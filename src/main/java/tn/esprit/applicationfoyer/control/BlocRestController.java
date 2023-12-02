package tn.esprit.applicationfoyer.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.applicationfoyer.Entity.Bloc;
import tn.esprit.applicationfoyer.Entity.Foyer;
import tn.esprit.applicationfoyer.Repository.BlocRepository;
import tn.esprit.applicationfoyer.Repository.FoyerRepository;
import tn.esprit.applicationfoyer.service.BlocServiceImpl;
import tn.esprit.applicationfoyer.service.IBlocService;
import tn.esprit.applicationfoyer.service.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {

    IBlocService blocService;

    BlocServiceImpl blocservicee;

    FoyerRepository foyerRepository;
    BlocRepository blocRepository;

    // http://localhost:8089/tpfoyer/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listblocs = blocService.retrieveAllBlocs();
        return listblocs;
    }

    // http://localhost:8089/tpfoyer/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long chId) {
        Bloc bloc = blocService.retrieveBloc(chId);
        return bloc;
    }

    // http://localhost:8089/tpfoyer/chambre/add-chambre
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long chId) {
        blocService.removeBloc(chId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.modifyBloc(b);
        return bloc;
    }

    @PostMapping("/creer-bloc-et-creer-foyer-et-affecter-bloc-a-foyer")
    public Bloc addBlocAndAaddFoyerAndAssignBlocToFoyer(Bloc bloc, Foyer foyer) {
        Foyer foyerr = foyerRepository.save(foyer);
        // on set le fils dans le parent :
        bloc.setFoyer(foyerr);
        return blocRepository.save(bloc);
    }

    @PutMapping("/affecter-bloc-a-foyer/{bloc-id}/{foyer-id}")
    public void affecterBlocToFoyer(@PathVariable("bloc-id") Long blocId,
                                             @PathVariable("foyer-id") Long foyerId) {
        blocservicee.assignBlocToFoyer(blocId, foyerId);
    }

    @PutMapping("desaffecter-bloc-de-foyer/{bloc-id}")
    public void desaffecterBlocFromFoyer(@PathVariable("bloc-id") Long blocId){
        blocService.desaffecterBlocFromFoyer(blocId);
    }

    @GetMapping("/trouver-sans-foyer")
    public List<Bloc> findAllByFoyerIsNull() {
        List<Bloc> listBlocs = blocService.findAllByFoyerIsNull();
        return listBlocs;
    }


}
