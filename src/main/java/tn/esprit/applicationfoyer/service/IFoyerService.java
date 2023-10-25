package tn.esprit.applicationfoyer.service;

import tn.esprit.applicationfoyer.Entity.Foyer;

import java.util.List;

public interface IFoyerService {
    public List<Foyer> retrieveAllFoyers();
    public Foyer retrieveFoyer(Long foyerId);
    public Foyer addFoyer(Foyer c);
    public void removeFoyer(Long foyerId);
    public Foyer modifyFoyer(Foyer foyer);
}
