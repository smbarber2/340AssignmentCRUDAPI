package com.csc340.crud_api_jpa_demo.animal;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int animalId;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String species;
    @Column(nullable = false)
    private String habitat;

    private String description;
    private String scientificName;

    private String userInput;

    public Animal(int animalId, String name, String species) {
        this.animalId = animalId;
        this.name = name;
        this.species = species;
        this.habitat = habitat;
        this.description = description;
        this.scientificName = scientificName;
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
        this.habitat = habitat;
        this.description = description;
        this.scientificName = scientificName;
    }

    public Animal() {
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() { return habitat; }

    public void setHabitat(String habitat) { this.habitat = habitat; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

}

