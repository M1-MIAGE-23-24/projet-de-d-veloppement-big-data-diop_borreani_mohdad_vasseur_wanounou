package fr.miage.m1.big_data_m1_23_24.controllers.mongo;


import fr.miage.m1.big_data_m1_23_24.entity.PointInteret;
import fr.miage.m1.big_data_m1_23_24.services.mongo.PointInteretMongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pointInteret/mongo")
public class PointInteretMongoDBController {

    @Autowired
    private PointInteretMongoDBService pointInteretMongoDBService;

    @PostMapping
    public PointInteret createPointInteret(@RequestBody PointInteret pointInteret) {
        return pointInteretMongoDBService.create(pointInteret);
    }

    @GetMapping("/{id}")
    public PointInteret getPointInteret(@PathVariable int id) {
        return pointInteretMongoDBService.get(id);
    }

    @PutMapping("/{id}")
    public PointInteret updatePointInteret(@PathVariable int id, @RequestBody PointInteret pointInteret) {
        pointInteret.setPoId(id);
        return pointInteretMongoDBService.edit(pointInteret);
    }

    @DeleteMapping("/{id}")
    public void deletePointInteret(@PathVariable int id) {
        pointInteretMongoDBService.delete(id);
    }

    /*@GetMapping("/search/description")
    public List<PointInteret> searchByDescription(@RequestParam String description) {
        return pointInteretMongoDBService.searchByDescription(description);
    }*/

    /*@GetMapping("/search/photoLink")
    public List<PointInteret> searchByPhotoLink(@RequestParam String photoLink) {
        return pointInteretMongoDBService.searchByPhotoLink(photoLink);
    }*/

}
