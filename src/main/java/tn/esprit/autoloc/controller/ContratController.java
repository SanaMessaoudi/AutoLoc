package tn.esprit.autoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.IContractService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contract")
@Tag(name = "gestion de contrats", description = "CRUD")
public class ContratController {

    private final IContractService contractService;

    @Operation(summary = "ajouter un contrat")
    @PostMapping("/ajouterContract")
    public Contrat ajouterContract(@RequestBody Contrat contract) {
        return contractService.ajouterContract(contract);
    }

    @Operation(summary = "modifier un contrat")
    @PutMapping("/modifierContract")
    public Contrat modifierContract(@RequestBody Contrat contract) {
        return contractService.modifierContract(contract);
    }

    @Operation(summary = "supprimer un contrat")
    @DeleteMapping("/supprimerContract/{idContract}")
    public void supprimerContract(@PathVariable Long idContract) {
        contractService.supprimerContract(idContract);
    }

    @Operation(summary = "afficher tous les contrats")
    @GetMapping("/afficherTousContrats")
    public List<Contrat> getAllContrats() {
        return contractService.afficherToutesContracts();
    }

    @Operation(summary = "trouver un contrat par id")
    @GetMapping("/afficherContractById/{id}")
    public Contrat getContractById(@PathVariable Long id) {
        return contractService.afficherContractById(id);
    }
}