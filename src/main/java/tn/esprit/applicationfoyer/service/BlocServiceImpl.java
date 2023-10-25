package tn.esprit.applicationfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.applicationfoyer.Entity.Bloc;
import tn.esprit.applicationfoyer.Repository.BlocRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {

    BlocRepository blocRepository;
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
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
