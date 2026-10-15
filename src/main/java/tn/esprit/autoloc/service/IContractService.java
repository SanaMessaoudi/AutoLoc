package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Contract;

import java.util.List;

public interface IContractService {
    Contract ajouterContract(Contract contract);
    Contract modifierContract(Contract contract);
    List<Contract> afficherToutesContracts();
    Contract afficherContractById(Long idContract);
    void supprimerContract(Long idContract);

}
