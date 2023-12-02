package tn.esprit.applicationfoyer.service;

import tn.esprit.applicationfoyer.Entity.Bloc;
import tn.esprit.applicationfoyer.Entity.Foyer;

import java.util.List;

public interface IBlocService {

    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long blocid);
    public Bloc addBloc(Bloc b);
    public void removeBloc(Long blocid);
    public Bloc modifyBloc(Bloc bloc);
    public Bloc desaffecterBlocFromFoyer(Long blocId);
    public void assignBlocToFoyer(Long blocId, Long foyerId);
    public Bloc addBlocAndAaddFoyerAndAssignBlocToFoyer(Bloc bloc, Foyer foyer);
    public List<Bloc> findAllByFoyerIsNull();
}
