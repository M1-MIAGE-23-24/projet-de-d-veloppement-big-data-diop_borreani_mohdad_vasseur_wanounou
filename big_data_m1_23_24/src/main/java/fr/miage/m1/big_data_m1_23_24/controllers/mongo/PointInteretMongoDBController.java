package fr.miage.m1.big_data_m1_23_24.controllers.mongo;


import fr.miage.m1.big_data_m1_23_24.entity.PointInteret;
import fr.miage.m1.big_data_m1_23_24.services.PointInteretService;
import fr.miage.m1.big_data_m1_23_24.services.mongo.PointInteretMongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/pointInteret/mongo")
public class PointInteretMongoDBController {

    @Autowired
    private PointInteretMongoDBService pointInteretMongoDBService;

    @Autowired
    private PointInteretService pointInteretService;

    @PostMapping("/")
    public PointInteret createRandonne(@RequestBody PointInteret randonne) {
        return pointInteretMongoDBService.create(randonne);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable UUID id) {
        try {
            return ResponseEntity.ok(pointInteretService.get(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error retrieving PointInteret: " + e.getMessage());
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> updatePointInteret(@PathVariable UUID id, @RequestBody PointInteret updatedPointInteret) {
        Optional<PointInteret> optionalPointInteret = pointInteretMongoDBService.get(id);
        if (optionalPointInteret.isPresent()) {
            updatedPointInteret.setUuid(id);
            PointInteret savedPointInteret = pointInteretMongoDBService.edit(updatedPointInteret);
            return ResponseEntity.ok(savedPointInteret);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PointInteret not found");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePointInteret(@PathVariable UUID id) {
        pointInteretMongoDBService.delete(id);
        return ResponseEntity.ok().body("RPointInteret deleted successfully");
    }
}
