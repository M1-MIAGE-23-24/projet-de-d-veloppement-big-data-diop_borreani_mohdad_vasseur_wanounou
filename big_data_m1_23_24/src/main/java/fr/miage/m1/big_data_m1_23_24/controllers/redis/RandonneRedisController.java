package fr.miage.m1.big_data_m1_23_24.controllers.redis;

import fr.miage.m1.big_data_m1_23_24.entity.Randonne;
import fr.miage.m1.big_data_m1_23_24.repositories.redis.RandonneRedisRepository;
import fr.miage.m1.big_data_m1_23_24.services.RandonneService;
import fr.miage.m1.big_data_m1_23_24.services.mongo.RandonneMongoDBService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/randonne/redis")
public class RandonneRedisController {

    @Autowired
    private RandonneRedisRepository randonneRedisRepository;

    @Autowired
    private RandonneService randonneService;

    private Randonne randonne;

    @PostConstruct
    public void init() {
        randonne = Randonne.builder()
                .uuid(UUID.randomUUID())
                .ra_id(1)
                .ra_label("Sample Randonne")
                .ra_description("This is a sample description")
                .ra_duree(120)
                .ra_difficulte("Medium")
                .ra_denivele(500)
                .ra_distance(10.5)
                .ra_boucle(true)
                .po_id(1)
                .av_id(1)
                .build();
        randonneService.create(randonne);
    }

    @PostMapping("/")
    public Randonne createRandonne(@RequestBody Randonne randonne) {
        return randonneRedisRepository.save(randonne);
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
        Optional<Randonne> optionalRandonne = randonneService.get(id);
        if (optionalRandonne.isPresent()) {
            updatedRandonne.setUuid(id);
            return ResponseEntity.ok(randonneService.edit(updatedRandonne));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Randonne not found");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRandonne(@PathVariable UUID id) {
        randonneService.delete(id);
        return ResponseEntity.ok().build();
    }

    // Benchmarks pour la performance

    @GetMapping("/benchmark/create")
    public String benchmarkCreate() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            randonneService.create(Randonne.builder()
                    .uuid(UUID.randomUUID())
                    .ra_id(i)
                    .ra_label("Randonne " + i)
                    .ra_description("Description " + i)
                    .ra_duree(120 + i)
                    .ra_difficulte("Medium")
                    .ra_denivele(500 + i)
                    .ra_distance(10.5 + i)
                    .ra_boucle(true)
                    .po_id(i)
                    .av_id(i)
                    .build());
        }

        long endTime = System.currentTimeMillis();
        return "Benchmark create: " + (endTime - startTime) + " ms";
    }

    @GetMapping("/benchmark/get")
    public String benchmarkGet() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            randonneService.get(randonne.getUuid());
        }

        long endTime = System.currentTimeMillis();
        return "Benchmark get: " + (endTime - startTime) + " ms";
    }

    @GetMapping("/benchmark/update")
    public String benchmarkUpdate() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            randonne.setRa_description("Updated description " + i);
            randonneService.edit(randonne);
        }

        long endTime = System.currentTimeMillis();
        return "Benchmark update: " + (endTime - startTime) + " ms";
    }

    @GetMapping("/benchmark/delete")
    public String benchmarkDelete() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            randonneService.delete(randonne.getUuid());
            randonne = Randonne.builder()
                    .uuid(UUID.randomUUID())
                    .ra_id(i)
                    .ra_label("Randonne " + i)
                    .ra_description("Description " + i)
                    .ra_duree(120 + i)
                    .ra_difficulte("Medium")
                    .ra_denivele(500 + i)
                    .ra_distance(10.5 + i)
                    .ra_boucle(true)
                    .po_id(i)
                    .av_id(i)
                    .build();
            randonneService.create(randonne);
        }

        long endTime = System.currentTimeMillis();
        return "Benchmark delete: " + (endTime - startTime) + " ms";
    }



}
