package fr.miage.m1.big_data_m1_23_24.controllers.mongo;


import fr.miage.m1.big_data_m1_23_24.entity.*;
import fr.miage.m1.big_data_m1_23_24.entity.PointInteret;
import fr.miage.m1.big_data_m1_23_24.services.PointInteretService;
import fr.miage.m1.big_data_m1_23_24.services.mongo.PointInteretMongoDBService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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
                    pointInteretService.create(PointInteret.builder()
                            .uuid(UUID.randomUUID())
                            .po_id(i)
                            .po_description("Point Interet " + i)
                            .po_lien_photo("http://example.com/photo" + i + ".jpg")
                            .build());
                    break;
                case "get":
                    pointInteretService.get(pointInteret.getUuid());
                    break;
                case "update":
                    pointInteret.setPo_description("Updated description " + i);
                    pointInteretService.edit(pointInteret);
                    break;
                case "delete":
                    pointInteretService.delete(pointInteret.getUuid());
                    pointInteret = PointInteret.builder()
                            .uuid(UUID.randomUUID())
                            .po_id(i)
                            .po_description("Point Interet " + i)
                            .po_lien_photo("http://example.com/photo" + i + ".jpg")
                            .build();
                    pointInteretService.create(pointInteret);
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
