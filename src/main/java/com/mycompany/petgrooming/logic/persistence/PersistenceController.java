package com.mycompany.petgrooming.logic.persistence;

import com.mycompany.petgrooming.logic.Owner;
import com.mycompany.petgrooming.logic.Pet;

public class PersistenceController {
    OwnerJpaController ownerController = new OwnerJpaController();
    PetJpaController petController = new PetJpaController();

    public void save(Pet pet, Owner owner) {
        ownerController.create(owner);
        petController.create(pet);
    }
    
}
