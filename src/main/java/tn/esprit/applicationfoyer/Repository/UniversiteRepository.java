package tn.esprit.applicationfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.applicationfoyer.Entity.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
