package fr.miage.m1.big_data_m1_23_24.controllers.mongo;


import fr.miage.m1.big_data_m1_23_24.entity.Avis;
import fr.miage.m1.big_data_m1_23_24.services.AvisService;
import fr.miage.m1.big_data_m1_23_24.services.mongo.AvisMongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/avis/mongo")
public class AvisMongoDBController {

    @Autowired
    private AvisMongoDBService avisMongoDBService;

    @Autowired
    private AvisService avisService;

    @PostMapping("/")
    public Avis createRandonne(@RequestBody Avis avis) {
        return avisMongoDBService.create(avis);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable UUID id) {
        try {
            return ResponseEntity.ok(avisService.get(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error retrieving Avis: " + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateAvis(@PathVariable UUID id, @RequestBody Avis updatedAvis) {
        Optional<Avis> optionalAvis = avisMongoDBService.get(id);
        if (optionalAvis.isPresent()) {
            updatedAvis.setUuid(id);
            Avis savedAvis = avisMongoDBService.edit(updatedAvis);
            return ResponseEntity.ok(savedAvis);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Avis not found");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAvis(@PathVariable UUID id) {
        avisMongoDBService.delete(id);
        return ResponseEntity.ok().body("Avis deleted successfully");
    }

}
