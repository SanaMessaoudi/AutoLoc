package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVehicule;

    String immatriculation;
    String marque;
    String modele;

    @Enumerated(EnumType.STRING)
    CategorieVehicule categorie;

    BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    StatutVehicule statut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_agence")
    Agence agence;

    @OneToMany(mappedBy = "vehicule", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    List<Maintenance> maintenances = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "vehicule_equipement",
            joinColumns = @JoinColumn(name = "id_vehicule"),
            inverseJoinColumns = @JoinColumn(name = "id_equipement")
    )
    List<Equipement> equipements = new ArrayList<>();

    @OneToMany(mappedBy = "vehicule", fetch = FetchType.LAZY)
    List<Reservation> reservations = new ArrayList<>();
}