package tn.esprit.applicationfoyer.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.applicationfoyer.Entity.Bloc;
import tn.esprit.applicationfoyer.Repository.BlocRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class BlocServiceImpl implements IBlocService {

    BlocRepository blocRepository;


    @Scheduled(fixedDelay = 60000)
    public List<Bloc> retrieveAllBlocs() {

        List<Bloc> ListB = blocRepository.findAll();
        log.info("taille totale : " + ListB.size());
        for (Bloc b: ListB) {
            log.info("Bloc : " + b);
        }
        return ListB;
    }
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }
    public Bloc addBloc(Bloc c) {
        return blocRepository.save(c);
    }
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

}
