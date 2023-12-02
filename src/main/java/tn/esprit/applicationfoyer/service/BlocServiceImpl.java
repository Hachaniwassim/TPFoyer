package tn.esprit.applicationfoyer.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.applicationfoyer.Entity.Bloc;
import tn.esprit.applicationfoyer.Entity.Foyer;
import tn.esprit.applicationfoyer.Repository.BlocRepository;
import tn.esprit.applicationfoyer.Repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class BlocServiceImpl implements IBlocService {

    BlocRepository blocRepository;

    FoyerRepository foyerRepository;

    @Scheduled(fixedDelay = 30000)
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

    public Bloc addBlocAndAaddFoyerAndAssignBlocToFoyer(Bloc bloc, Foyer foyer) {
        Foyer foyerr = foyerRepository.save(foyer);
        // on set le fils dans le parent :
        bloc.setFoyer(foyerr);
        return blocRepository.save(bloc);
    }
    public void assignBlocToFoyer(Long blocId, Long foyerId) {
        Bloc bloc = blocRepository.findById(blocId).get();
        Foyer foyer = foyerRepository.findById(foyerId).get();
        // on set le fils dans le parent :

        bloc.setFoyer(foyer);
        blocRepository.save(bloc);
    }

    public Bloc desaffecterBlocFromFoyer(Long blocId) {
        Bloc bloc = blocRepository.findById(blocId).get();
        bloc.setFoyer(null);
        return blocRepository.save(bloc);
    }

    @Scheduled(fixedDelay = 120000)
    public List<Bloc> findAllByFoyerIsNull() {

        List<Bloc> listB = blocRepository.findAllByFoyerIsNull();
        log.info("les blocs sans foyer:");
        for(Bloc b: listB) {
            log.info("Bloc:" + b);
        }
        return listB;
    }

}
