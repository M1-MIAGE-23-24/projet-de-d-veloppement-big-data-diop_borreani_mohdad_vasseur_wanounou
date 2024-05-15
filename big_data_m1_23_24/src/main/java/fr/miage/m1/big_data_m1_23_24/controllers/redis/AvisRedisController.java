package fr.miage.m1.big_data_m1_23_24.controllers.redis;

import fr.miage.m1.big_data_m1_23_24.entity.Avis;
import fr.miage.m1.big_data_m1_23_24.entity.Rating;
import fr.miage.m1.big_data_m1_23_24.services.AvisService;
import fr.miage.m1.big_data_m1_23_24.services.mongo.AvisMongoDBService;
import fr.miage.m1.big_data_m1_23_24.services.redis.AvisRedisService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/avis/redis")
public class AvisRedisController {


    @Autowired
    private AvisRedisService avisRedisService;

    @Autowired
    @Qualifier("avisRedisService")
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
        return avisRedisService.create(avis);
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
        return ResponseEntity.ok(avisService.edit(updatedAvis));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAvis(@PathVariable UUID id) {
        avisService.delete(id);
        return ResponseEntity.ok("Avis deleted");
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
