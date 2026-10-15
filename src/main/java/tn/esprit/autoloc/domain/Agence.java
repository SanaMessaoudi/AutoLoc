package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    @Column(nullable = false, length = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    private String ville;

    @Column(nullable = false, length = 50)
    private String adress;

    @Column(nullable = false, unique = true, length = 20)
    private String telephone;

    @OneToMany(mappedBy = "agence",fetch = FetchType.LAZY)
    List<Employe> ep = new ArrayList<>();

    @OneToMany(mappedBy = "agence",fetch = FetchType.LAZY)
    List<Vehicule> vehicules = new ArrayList<>();

}
