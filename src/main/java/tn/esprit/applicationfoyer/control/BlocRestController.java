package tn.esprit.applicationfoyer.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.applicationfoyer.Entity.Bloc;
import tn.esprit.applicationfoyer.service.IBlocService;
import tn.esprit.applicationfoyer.service.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {

    IBlocService blocService;

    // http://localhost:8089/tpfoyer/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listblocs = blocService.retrieveAllBlocs();
        return listblocs;
    }

    // http://localhost:8089/tpfoyer/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-bloc/{chambre-id}")
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

}
