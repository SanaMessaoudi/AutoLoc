package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;

    @Column(nullable = false)
    private LocalDate dateDebut;

    @Column(nullable = false)
    LocalDate dateFin;

    @Column(nullable = false)
    String Description;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "vehicule_id")
    Vehicule vehicule;

}
