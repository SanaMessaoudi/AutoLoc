package tn.esprit.autoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.autoloc.domain.Agence;

import java.util.List;

public class IAgenceServiceImp implements IAgencyService{

    @Override
    public Agence ajouterAgence(Agence agence) {
        return null;
    }

    @Override
    public Agence modifierAgence(Agence agence) {
        return null;
    }

    @Override
    public List<Agence> afficherToutesAgences() {
        return List.of();
    }

    @Override
    public Agence afficherAgenceById() {
        return null;
    }

    @Override
    public void supprimerAgence(Long id) {

    }
}