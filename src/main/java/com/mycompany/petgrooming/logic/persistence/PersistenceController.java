package com.mycompany.petgrooming.logic.persistence;

import com.mycompany.petgrooming.logic.Owner;
import com.mycompany.petgrooming.logic.Pet;
import com.mycompany.petgrooming.logic.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {

	OwnerJpaController ownerController = new OwnerJpaController();
	PetJpaController petController = new PetJpaController();

	public void save(Owner owner, Pet pet) {
		ownerController.create(owner);
		petController.create(pet);
	}

	public List<Pet> findall() {
		return petController.findPetEntities();
	}

	public void remove(int idPet) {
		try {
			petController.destroy(idPet);
		} catch (NonexistentEntityException ex) {
			Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public Pet findPet(int idPet) {
		return petController.findPet(idPet);
	}

	public void editPet(Pet pet) {
		try {
			petController.edit(pet);
		} catch (Exception ex) {
			Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public Owner findOwner(int id) {
		return ownerController.findOwner(id);
	}

	public void editowner(Owner owner) {
		try {
			ownerController.edit(owner);
		} catch (Exception ex) {
			Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
