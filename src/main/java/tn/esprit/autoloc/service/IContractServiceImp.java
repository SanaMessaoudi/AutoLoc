package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.ContractRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class IContractServiceImp implements IContractService {
    private final ContractRepository contractRepository;

    @Override
    public Contrat ajouterContract(Contrat contract) {
        return contractRepository.save(contract);
    }

    @Override
    public Contrat modifierContract(Contrat contract) {
        return contractRepository.save(contract);
    }

    @Override
    public List<Contrat> afficherToutesContracts() {
        return contractRepository.findAll();
    }

    @Override
    public Contrat afficherContractById(Long idContract) {
        return contractRepository.findById(idContract).orElse(null);
    }

    @Override
    public void supprimerContract(Long idContract) {
        contractRepository.deleteById(idContract);

    }
}
