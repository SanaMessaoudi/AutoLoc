package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceController {

    @Qualifier("IMaintenanceServiceImp")
    private final IMaintenanceService maintenanceService;

    @PostMapping("/ajouterMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.ajouterMaintenance(maintenance);
    }

    @PutMapping("/modifierMaintenance")
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.modifierMaintenance(maintenance);
    }

    @DeleteMapping("/supprimerMaintenance/{idMaintenance}")
    public void supprimerMaintenance(@PathVariable Long idMaintenance) {
        maintenanceService.supprimerMaintenance(idMaintenance);
    }

    @GetMapping("/afficherToutesMaintenances")
    public List<Maintenance> getAllMaintenance() {
        return maintenanceService.afficherToutesMaintenance();
    }

    @GetMapping("/afficherMaintenanceById/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return maintenanceService.afficherMaintenanceById(id);
    }
}