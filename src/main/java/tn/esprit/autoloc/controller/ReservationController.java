package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")

public class ReservationController {
    private final IReservationService reservationService;

    @PostMapping("/ajouterResevation")
    public Reservation ajouterReservation(@RequestBody Reservation reservation)
    {
        return reservationService.ajouterReservation(reservation);
    }

    @PutMapping("/modifierReservation")
    public Reservation modifierReservation(@RequestBody Reservation reservation)
    {
        return reservationService.modifierReservation(reservation);
    }

    @DeleteMapping("/supprimerReservation/{idReservation}")
    public void supprimerReservation(@PathVariable Long idReservation)
    {
        reservationService.supprimerReservation(idReservation);
    }

    @GetMapping("/afficherToutesReservations")
    public List<Reservation> getAllReservation(){
        return reservationService.afficherToutesReservation();
    }

    @GetMapping("/afficherReservationById/{id}")
    public Reservation getReservationById(@PathVariable Long id)
    {
        return reservationService.afficherReservationById(id);
    }

}