package com.csc340.crud_api_jpa_demo.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Centralizes data access to the Student Database.
 */
@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    //All Animals
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    //Animal by Id
    public Animal getAnimalById(int animalId) {
        return animalRepository.findById(animalId).orElse(null);
    }

    //EXTRA:Animal by Name
    //public Animal getAnimalByName(String name) { return animalRepository.findByName(name).orElse(null); }

    //All animals of a species
    public List<Animal> getAnimalsBySpecies(String species) {
        return animalRepository.getAnimalsBySpecies(species);
    }


    //Add new animal
    public void addNewAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    //Update existing animal
    public void updateAnimal(int animalId, Animal animal) {
        Animal existing = getAnimalById(animalId);
        existing.setName(animal.getName());
        existing.setSpecies(animal.getSpecies());
        existing.setHabitat(animal.getHabitat());
        existing.setDescription(animal.getDescription());

        //Technically the 4 lines above are not necessary because the save method merges by default.
        animalRepository.save(existing);
    }

    //Delete animal
    public void deleteAnimalById(int animalId) {
        animalRepository.deleteById(animalId);
    }

    //Search by String
    public List<Animal> getAnimalBySearch(String name) {return animalRepository.findByNameContainingIgnoreCase(name); }


}