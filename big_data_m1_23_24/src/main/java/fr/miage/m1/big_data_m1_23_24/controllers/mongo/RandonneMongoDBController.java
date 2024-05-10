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

    @Autowired
    private RandonneService randonneService;


    @PostMapping("/")
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

    @PutMapping("/{id}")
    public ResponseEntity<?> updateRandonne(@PathVariable UUID id, @RequestBody Randonne updatedRandonne) {
        Optional<Randonne> optionalRandonne = randonneMongoDBService.get(id);
        if (optionalRandonne.isPresent()) {
            updatedRandonne.setUuid(id);
            Randonne savedRandonne = randonneMongoDBService.edit(updatedRandonne);
            return ResponseEntity.ok(savedRandonne);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Randonne not found");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRandonne(@PathVariable UUID id) {
        randonneMongoDBService.delete(id);
        return ResponseEntity.ok().body("Randonne deleted successfully");
    }

}
