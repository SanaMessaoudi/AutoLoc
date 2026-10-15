package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule vehicule);
    Vehicule modifierVehicule(Vehicule vehicule);
    List<Vehicule> afficherToutesVehicule();
    Vehicule afficherVehiculeById(Long idVehicule);
    void supprimerVehicule(Long idVehicule);
}
