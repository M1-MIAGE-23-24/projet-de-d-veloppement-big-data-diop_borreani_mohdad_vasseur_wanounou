package fr.miage.m1.big_data_m1_23_24.controllers.redis;

import fr.miage.m1.big_data_m1_23_24.entity.PointInteret;
import fr.miage.m1.big_data_m1_23_24.repositories.redis.PointInteretRedisRepository;
import fr.miage.m1.big_data_m1_23_24.services.PointInteretService;
import fr.miage.m1.big_data_m1_23_24.services.mongo.PointInteretMongoDBService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/pointInteret/redis")
public class PointInteretRedisController {

    @Autowired
    private PointInteretRedisRepository pointInteretRedisRepository;

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
        return pointInteretRedisRepository.save(randonne);
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
        Optional<PointInteret> optionalPointInteret = pointInteretService.get(id);
        if (optionalPointInteret.isPresent()) {
            updatedPointInteret.setUuid(id);
            return ResponseEntity.ok(pointInteretService.edit(updatedPointInteret));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PointInteret not found");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePointInteret(@PathVariable UUID id) {
        pointInteretService.delete(id);
        return ResponseEntity.ok().build();
    }

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
