package tn.esprit.applicationfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.applicationfoyer.Entity.Reservation;
import tn.esprit.applicationfoyer.Repository.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    ReservationRepository reservationRepository;
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }
    public Reservation retrieveReservation(String reservationId) {
        return reservationRepository.findById(reservationId).get();
    }
    public Reservation addReservation(Reservation c) {
        return reservationRepository.save(c);
    }
    public void removeReservation(String reservationId) {
        reservationRepository.deleteById(reservationId);
    }
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
