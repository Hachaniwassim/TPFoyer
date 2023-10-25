package tn.esprit.applicationfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.applicationfoyer.Entity.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
