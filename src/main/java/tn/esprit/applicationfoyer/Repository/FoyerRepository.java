package tn.esprit.applicationfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.applicationfoyer.Entity.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
