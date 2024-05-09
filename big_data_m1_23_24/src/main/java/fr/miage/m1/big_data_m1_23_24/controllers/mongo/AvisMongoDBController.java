package fr.miage.m1.big_data_m1_23_24.controllers.mongo;


import fr.miage.m1.big_data_m1_23_24.entity.Avis;
import fr.miage.m1.big_data_m1_23_24.services.mongo.AvisMongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avis/mongo")
public class AvisMongoDBController {

    @Autowired
    private AvisMongoDBService avisMongoDBService;

    @PostMapping
    public Avis createAvis(@RequestBody Avis avis) {
        return avisMongoDBService.create(avis);
    }

    @GetMapping("/{id}")
    public Avis getAvis(@PathVariable int id) {
        return avisMongoDBService.get(id);
    }

    @PutMapping("/{id}")
    public Avis updateAvis(@PathVariable int id, @RequestBody Avis avis) {
        avis.setAvId(id);
        return avisMongoDBService.edit(avis);
    }

    @DeleteMapping("/{id}")
    public void deleteAvis(@PathVariable int id) {
        avisMongoDBService.delete(id);
    }

    /*@GetMapping("/search/message")
    public List<Avis> searchByMessage(@RequestParam String message) {
        return avisMongoDBService.searchByMessage(message);
    }*/

}
