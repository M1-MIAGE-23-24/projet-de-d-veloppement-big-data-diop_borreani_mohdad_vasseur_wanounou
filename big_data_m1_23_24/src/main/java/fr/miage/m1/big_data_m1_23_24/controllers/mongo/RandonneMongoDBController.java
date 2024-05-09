package fr.miage.m1.big_data_m1_23_24.controllers.mongo;

import fr.miage.m1.big_data_m1_23_24.entity.Randonne;
import fr.miage.m1.big_data_m1_23_24.services.RandonneService;
import fr.miage.m1.big_data_m1_23_24.services.mongo.RandonneMongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/randonne/mongo")
public class RandonneMongoDBController {

    @Autowired
    private RandonneMongoDBService randonneMongoDBService;
    private RandonneService randonneService;

    @PostMapping
    public Randonne createRandonne(@RequestBody Randonne randonne) {
        return randonneMongoDBService.create(randonne);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable UUID id) {
        try {
            return ResponseEntity.ok(randonneService.get(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error retrieving Randonne: " + e.getMessage());
        }
    }

    @PutMapping("/{ra_id}")
    public Randonne updateRandonne(@PathVariable int ra_id, @RequestBody Randonne randonne) {
        randonne.setid(ra_id);
        return randonneMongoDBService.edit(randonne);
    }

    @DeleteMapping("/{ra_id}")
    public void deleteRandonne(@PathVariable int ra_id) {
        randonneMongoDBService.delete(ra_id);
    }

    /*@GetMapping("/search/label")
    public List<Randonne> searchByLabel(@RequestParam String label) {
        return randonneMongoDBService.searchByLabel(label);
    }

    @GetMapping("/search/difficulty")
    public List<Randonne> searchByDifficulty(@RequestParam String difficulty) {
        return randonneMongoDBService.searchByDifficulty(difficulty);
    }*/

}
