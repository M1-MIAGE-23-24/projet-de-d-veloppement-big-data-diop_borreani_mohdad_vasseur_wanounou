package fr.miage.m1.big_data_m1_23_24.controllers.mongo;

import fr.miage.m1.big_data_m1_23_24.entity.Randonne;
import fr.miage.m1.big_data_m1_23_24.entity.Randonne;
import fr.miage.m1.big_data_m1_23_24.entity.RandonneSearchCriteria;
import fr.miage.m1.big_data_m1_23_24.services.RandonneService;
import fr.miage.m1.big_data_m1_23_24.services.mongo.RandonneMongoDBService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/randonne/mongo")
public class RandonneMongoDBController {

    @Autowired
    private RandonneMongoDBService randonneMongoDBService;

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

    @PostMapping("/search")
    public ResponseEntity<List<Randonne>> searchRandonne(@RequestBody RandonneSearchCriteria criteria) {
        List<Randonne> results = randonneService.search(criteria);
        return ResponseEntity.ok(results);
    }


    // Benchmarks pour test de performance

    @GetMapping("/benchmark/create")
    public ResponseEntity<Map<String, Long>> benchmarkCreate() {
        List<Long> times = benchmarkOperation(1000, "create");
        return ResponseEntity.ok(getBenchmarkMetrics(times));
    }

    @GetMapping("/benchmark/get")
    public ResponseEntity<Map<String, Long>> benchmarkGet() {
        List<Long> times = benchmarkOperation(1000, "get");
        return ResponseEntity.ok(getBenchmarkMetrics(times));
    }

    @GetMapping("/benchmark/update")
    public ResponseEntity<Map<String, Long>> benchmarkUpdate() {
        List<Long> times = benchmarkOperation(1000, "update");
        return ResponseEntity.ok(getBenchmarkMetrics(times));
    }

    @GetMapping("/benchmark/delete")
    public ResponseEntity<Map<String, Long>> benchmarkDelete() {
        List<Long> times = benchmarkOperation(1000, "delete");
        return ResponseEntity.ok(getBenchmarkMetrics(times));
    }

    private List<Long> benchmarkOperation(int count, String operation) {
        List<Long> times = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            long startTime = System.nanoTime();
            switch (operation) {
                case "create":
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
                    break;
                case "get":
                    randonneService.get(randonne.getUuid());
                    break;
                case "update":
                    randonne.setRa_description("Updated description " + i);
                    randonneService.edit(randonne);
                    break;
                case "delete":
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
                    break;
            }
            long endTime = System.nanoTime();
            times.add(endTime - startTime);
        }
        return times;
    }

    private Map<String, Long> getBenchmarkMetrics(List<Long> times) {
        long sum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (long time : times) {
            sum += time;
            if (time < min) {
                min = time;
            }
            if (time > max) {
                max = time;
            }
        }

        long mean = sum / times.size();
        Map<String, Long> metrics = new HashMap<>();
        metrics.put("mean", mean);
        metrics.put("min", min);
        metrics.put("max", max);

        return metrics;
    }



}
