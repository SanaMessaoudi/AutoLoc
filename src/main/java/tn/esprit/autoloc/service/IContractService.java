package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Contrat;

import java.util.List;

public interface IContractService {
    Contrat ajouterContract(Contrat contract);
    Contrat modifierContract(Contrat contract);
    List<Contrat> afficherToutesContracts();
    Contrat afficherContractById(Long idContract);
    void supprimerContract(Long idContract);

}
