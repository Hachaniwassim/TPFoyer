package tn.esprit.applicationfoyer.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.applicationfoyer.Entity.Chambre;
import tn.esprit.applicationfoyer.Repository.ChambreRepository;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    ChambreRepository chambreRepository;
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }
    public Chambre retrieveChambre(Long chambreId) {
        log.info("In method retrieveAllChambres : ");
        Chambre chambre =  chambreRepository.findById(chambreId).get();
        log.info("Out of retrieveAllChambres.");
        return  chambre;
    }
    public Chambre addChambre(Chambre c) {

        log.info("In method retrieveAllChambres : ");
        Chambre chambre =   chambreRepository.save(c);
        log.info("Out of retrieveAllChambres.");
        return chambre;

    }
    public void removeChambre(Long chambreId) {
        log.info("In method retrieveAllChambres : ");
        chambreRepository.deleteById(chambreId);
        log.info("Out of retrieveAllChambres.");
    }
    public Chambre modifyChambre(Chambre chambre) {
        log.info("In method retrieveAllChambres : ");
        Chambre ch = chambreRepository.save(chambre);
        log.info("Out of retrieveAllChambres.");
        return  ch;
    }
}
