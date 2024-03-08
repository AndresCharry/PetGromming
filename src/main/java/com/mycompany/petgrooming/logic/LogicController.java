package com.mycompany.petgrooming.logic;

import com.mycompany.petgrooming.logic.persistence.PersistenceController;
import java.util.ArrayList;
import java.util.List;

public class LogicController {
      PersistenceController controller = new PersistenceController();

    public LogicController() {
    }

    public void save(String petName, String petBreed, String petColor, String petAllergic, 
            String petAttention, String petObservation, String ownerName, String ownerPhone) {
        Pet pet = new Pet();
        pet.setName(petName);
        pet.setBreed(petBreed);
        pet.setColor(petColor);
        pet.setAllergic(petAllergic);
        pet.setSpecialAttention(petAttention);
        
        Owner owner = new Owner();
        owner.setName(ownerName);
        owner.setPhone(ownerPhone);
        controller.save(pet, owner);
    }
    
}
