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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idContract;

    @Column(nullable = false)
    LocalDate dateSignature;

    @Column(nullable = false, length = 20)
    BigDecimal montantTotal;

    @Column(nullable = false)
    boolean valide;

    @OneToOne(mappedBy = "contract")
    Reservation reservation;

    @OneToMany(mappedBy = "contract",cascade = CascadeType.ALL )
    List<Paiement> paiements =new ArrayList<>();


}
