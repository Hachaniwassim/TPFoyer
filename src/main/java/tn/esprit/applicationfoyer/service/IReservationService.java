package tn.esprit.applicationfoyer.service;

import tn.esprit.applicationfoyer.Entity.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(String reservationId);
    public Reservation addReservation(Reservation c);
    public void removeReservation(String reservationId);
    public Reservation modifyReservation(Reservation reservation);
}
