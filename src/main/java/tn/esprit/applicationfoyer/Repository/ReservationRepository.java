package tn.esprit.applicationfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.applicationfoyer.Entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
