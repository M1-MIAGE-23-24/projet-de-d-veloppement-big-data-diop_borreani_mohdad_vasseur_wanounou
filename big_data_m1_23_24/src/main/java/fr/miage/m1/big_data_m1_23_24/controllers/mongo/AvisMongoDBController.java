package fr.miage.m1.big_data_m1_23_24.controllers.mongo;


import fr.miage.m1.big_data_m1_23_24.entity.Avis;
import fr.miage.m1.big_data_m1_23_24.entity.Rating;
import fr.miage.m1.big_data_m1_23_24.services.AvisService;
import fr.miage.m1.big_data_m1_23_24.services.mongo.AvisMongoDBService;
import jakarta.annotation.PostConstruct;
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

    private Avis avis;

    @PostConstruct
    public void init() {
        avis = Avis.builder()
                .uuid(UUID.randomUUID())
                .av_id(1)
                .av_etoile(Rating.FIVE)
                .av_message("Great hike!")
                .build();
        avisService.create(avis);
    }

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

    // Benchmarks pour test de performance

    @GetMapping("/benchmark/create")
    public String benchmarkCreate() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            avisService.create(Avis.builder()
                    .uuid(UUID.randomUUID())
                    .av_id(i)
                    .av_etoile(Rating.FIVE)
                    .av_message("Another great hike!")
                    .build());
        }

        long endTime = System.currentTimeMillis();
        return "Benchmark create : " + (endTime - startTime) + " ms";
    }

    @GetMapping("/benchmark/get")
    public String benchmarkGet() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            avisService.get(avis.getUuid());
        }

        long endTime = System.currentTimeMillis();
        return "Benchmark get : " + (endTime - startTime) + " ms";
    }

    @GetMapping("/benchmark/update")
    public String benchmarkUpdate() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            avis.setAv_message("Updated message " + i);
            avisService.edit(avis);
        }

        long endTime = System.currentTimeMillis();
        return "Benchmark update : " + (endTime - startTime) + " ms";
    }

    @GetMapping("/benchmark/delete")
    public String benchmarkDelete() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            avisService.delete(avis.getUuid());
            avis = Avis.builder()
                    .uuid(UUID.randomUUID())
                    .av_id(i)
                    .av_etoile(Rating.FIVE)
                    .av_message("Another great hike!")
                    .build();
            avisService.create(avis);
        }

        long endTime = System.currentTimeMillis();
        return "Benchmark delete : " + (endTime - startTime) + " ms";
    }

}
