
package com.mycompany.petgrooming.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pet implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String breed;
    private String color;
    private String Allergic;
    private String specialAttention;
    private String observations;
    @OneToOne
    private Owner owner;

    public Pet() {
    }

    public Pet(int id, String name, String breed, String color, String Allergic, String specialAttention, String observation, Owner owner) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.Allergic = Allergic;
        this.specialAttention = specialAttention;
        this.observations = observation;
        this.owner = owner;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergic() {
        return Allergic;
    }

    public void setAllergic(String Allergic) {
        this.Allergic = Allergic;
    }

    public String getSpecialAttention() {
        return specialAttention;
    }

    public void setSpecialAttention(String specialAttention) {
        this.specialAttention = specialAttention;
    }

    public String getObservation() {
        return observations;
    }

    public void setObservation(String observation) {
        this.observations = observation;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    
}
