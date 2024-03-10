package com.mycompany.petgrooming.logic;

import com.mycompany.petgrooming.logic.persistence.PersistenceController;
import java.util.List;

public class LogicController {

	PersistenceController controller = new PersistenceController();

	public LogicController() {
	}

	public void save(String petName, String petBreed, String petColor, String petAllergic,
		String petAttention, String petObservation, String ownerName, String ownerPhone) {
		Owner owner = new Owner();
		owner.setName(ownerName);
		owner.setPhone(ownerPhone);

		Pet pet = new Pet();
		pet.setName(petName);
		pet.setBreed(petBreed);
		pet.setColor(petColor);
		pet.setAllergic(petAllergic);
		pet.setSpecialAttention(petAttention);
		pet.setOwner(owner);
		pet.setObservation(petObservation);

		controller.save(owner, pet);
	}

	public List<Pet> bringpets() {
		return controller.findall();
	}

	public void remove(int idPet) {
		controller.remove(idPet);
	}

	public Pet bringpets(int idPet) {
		return controller.findPet(idPet);
	}

	public void edit(Pet pet, String petName, String petBreed, String petColor, String petAllergic, String petAttention,
		String petObservation, String ownerName, String ownerPhone) {
		pet.setName(petName);
		pet.setBreed(petBreed);
		pet.setColor(petColor);
		pet.setAllergic(petAllergic);
		pet.setSpecialAttention(petAttention);
		pet.setObservation(petObservation);
		this.editPet(pet);
		System.out.println("owner id: "+ pet.getOwner().getId());
		
		Owner owner = this.findOwner(pet.getOwner().getId());
		owner.setName(ownerName);
		owner.setPhone(ownerPhone);

		this.editowner(owner);
	}

	private Owner findOwner(int id) {
		return controller.findOwner(id);
	}

	private void editPet(Pet pet) {
		controller.editPet(pet);
	}

	private void editowner(Owner owner) {
		controller.editowner(owner);
	}
}
