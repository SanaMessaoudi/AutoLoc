package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Contract;
import tn.esprit.autoloc.repository.ContractRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class IContractServiceImp implements IContractService {
    private final ContractRepository contractRepository;

    @Override
    public Contract ajouterContract(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public Contract modifierContract(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public List<Contract> afficherToutesContracts() {
        return contractRepository.findAll();
    }

    @Override
    public Contract afficherContractById(Long idContract) {
        return contractRepository.findById(idContract).orElse(null);
    }

    @Override
    public void supprimerContract(Long idContract) {
        contractRepository.deleteById(idContract);

    }
}
