package tn.esprit.applicationfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.applicationfoyer.Entity.Universite;
import tn.esprit.applicationfoyer.Repository.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {

    UniversiteRepository universiteRepository;
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }
    public Universite retrieveUniversite(Long universiteId) {
        return universiteRepository.findById(universiteId).get();
    }
    public Universite addUniversite(Universite c) {
        return universiteRepository.save(c);
    }
    public void removeUniversite(Long universiteId) {
        universiteRepository.deleteById(universiteId);
    }
    public Universite modifyUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
}
