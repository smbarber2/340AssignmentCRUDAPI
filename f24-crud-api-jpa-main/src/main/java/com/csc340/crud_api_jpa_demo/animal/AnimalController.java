package com.csc340.crud_api_jpa_demo.animal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService service;

    //All Animals [Works]
    @GetMapping("/all")
    public List<Animal> getAllAnimals() {
        return service.getAllAnimals();
    }

    //Animal by Id [Works]
    @GetMapping("/{animalId}")
    public Animal getOneAnimal(@PathVariable int animalId) {
        return service.getAnimalById(animalId);
    }

    //EXTRA: Animal by Name [merged into the search tbh]
    //@GetMapping("/{name}")
    //publc Animal getAnimalByName(@PathVariable String name) {
    //    return service.getAnimalByName(name);
    //}

    //Animal by species [Works, http://localhost:8080/animals?species= [species] ]
    @GetMapping("")
    public List<Animal> getAnimalsBySpecies(@RequestParam(name = "species", defaultValue = "unspecified") String species) {
        return service.getAnimalsBySpecies(species);
    }

    //Create a new Animal [Works]
    @PostMapping("/new")
    public List<Animal> addNewAnimal(@RequestBody Animal animal) {
        service.addNewAnimal(animal);
        return service.getAllAnimals();
    }

    //Update animal [Works, like creating a new]
    @PutMapping("/update/{animalId}")
    public Animal updateAnimal(@PathVariable int animalId, @RequestBody Animal animal) {
        service.updateAnimal(animalId, animal);
        return service.getAnimalById(animalId);
    }

    //Delete animal [Works ohhh my gosh I finally understand postman]
    @DeleteMapping("/delete/{animalId}")
    public List<Animal> deleteAnimalById(@PathVariable int animalId) {
        service.deleteAnimalById(animalId);
        return service.getAllAnimals();
    }

    //Animal by search [WORKS OMG]
    @GetMapping("/search") // /search?contains= input
    public List<Animal> getAnimalsBySearch(@RequestParam(name = "contains", defaultValue = "unspecified") String name) {
        return service.getAnimalBySearch(name);
    }
}