package com.mycompany.petgrooming.logic.persistence;

import com.mycompany.petgrooming.logic.Owner;
import com.mycompany.petgrooming.logic.Pet;
import java.util.List;

public class PersistenceController {
    OwnerJpaController ownerController = new OwnerJpaController();
    PetJpaController petController = new PetJpaController();

    public void save( Owner owner, Pet pet) {
        ownerController.create(owner);
        petController.create(pet);
    }

    public List<Pet> findall() {
        return petController.findPetEntities();
    }
    
}
