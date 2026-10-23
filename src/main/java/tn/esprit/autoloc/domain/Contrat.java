package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "contrat")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contrat") // Correspond exactement au nom de la colonne dans phpMyAdmin[cite: 4]
    private Long idContract;

    @Column(nullable = false)
    private LocalDate dateSignature;

    @Column(nullable = false)
    private BigDecimal montantTotal;

    @Column(nullable = false)
    private boolean valide;

    @OneToOne(mappedBy = "contract")
    private Reservation reservation;

    @OneToMany(mappedBy = "contract", cascade = CascadeType.ALL)
    private List<Paiement> paiements = new ArrayList<>();
}