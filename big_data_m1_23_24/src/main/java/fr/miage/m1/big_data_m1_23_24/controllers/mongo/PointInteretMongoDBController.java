package fr.miage.m1.big_data_m1_23_24.controllers.mongo;


import fr.miage.m1.big_data_m1_23_24.entity.PointInteret;
import fr.miage.m1.big_data_m1_23_24.entity.PointInteretSearchCriteria;
import fr.miage.m1.big_data_m1_23_24.services.PointInteretService;
import fr.miage.m1.big_data_m1_23_24.services.mongo.PointInteretMongoDBService;
import jakarta.annotation.PostConstruct;
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

    private PointInteret pointInteret;

    @PostConstruct
    public void init() {
        pointInteret = PointInteret.builder()
                .uuid(UUID.randomUUID())
                .po_id(1)
                .po_description("Sample Point Interet")
                .po_lien_photo("http://example.com/photo.jpg")
                .build();
        pointInteretService.create(pointInteret);
    }

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

    @PostMapping("/search")
    public ResponseEntity<List<PointInteret>> searchPointInteret(@RequestBody PointInteretSearchCriteria criteria) {
        List<PointInteret> results = pointInteretService.search(criteria);
        return ResponseEntity.ok(results);
    }

    // Benchmarks pour la performance

    @GetMapping("/benchmark/create")
    public String benchmarkCreate() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            pointInteretService.create(PointInteret.builder()
                    .uuid(UUID.randomUUID())
                    .po_id(i)
                    .po_description("Point Interet " + i)
                    .po_lien_photo("http://example.com/photo" + i + ".jpg")
                    .build());
        }

        long endTime = System.currentTimeMillis();
        return "Benchmark create: " + (endTime - startTime) + " ms";
    }

    @GetMapping("/benchmark/get")
    public String benchmarkGet() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            pointInteretService.get(pointInteret.getUuid());
        }

        long endTime = System.currentTimeMillis();
        return "Benchmark get: " + (endTime - startTime) + " ms";
    }

    @GetMapping("/benchmark/update")
    public String benchmarkUpdate() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            pointInteret.setPo_description("Updated description " + i);
            pointInteretService.edit(pointInteret);
        }

        long endTime = System.currentTimeMillis();
        return "Benchmark update: " + (endTime - startTime) + " ms";
    }

    @GetMapping("/benchmark/delete")
    public String benchmarkDelete() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            pointInteretService.delete(pointInteret.getUuid());
            pointInteret = PointInteret.builder()
                    .uuid(UUID.randomUUID())
                    .po_id(i)
                    .po_description("Point Interet " + i)
                    .po_lien_photo("http://example.com/photo" + i + ".jpg")
                    .build();
            pointInteretService.create(pointInteret);
        }

        long endTime = System.currentTimeMillis();
        return "Benchmark delete: " + (endTime - startTime) + " ms";
    }
}
