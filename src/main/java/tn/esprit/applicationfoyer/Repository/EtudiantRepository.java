package tn.esprit.applicationfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.applicationfoyer.Entity.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
