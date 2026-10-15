package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;

import java.util.List;


    public interface IAgencyService {
        Agence ajouterAgence(Agence agence);
        Agence modifierAgence(Agence agence);
        List<Agence> afficherToutesAgences();
        Agence afficherAgenceById();
        void supprimerAgence(Long id);
}
