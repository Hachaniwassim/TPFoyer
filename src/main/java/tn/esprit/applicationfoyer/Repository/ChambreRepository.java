package tn.esprit.applicationfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.applicationfoyer.Entity.Chambre;
import tn.esprit.applicationfoyer.Entity.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    @Query("SELECT distinct (ch) FROM Chambre ch " +
            "INNER JOIN ch.reservations r " +
            "INNER JOIN r.etudiant e " +
            "WHERE e.cin=:Cin " )
    Chambre trouverChselonEt(String Cin);
}
