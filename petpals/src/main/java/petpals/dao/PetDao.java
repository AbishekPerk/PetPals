package petpals.dao;

import java.util.List;

import petpals.entity.Pet;

public interface PetDao {
      
	String addPet(Pet pet);

    
    Pet getPetById(int petId);

    
    List<Pet> getAllPets();

    
    List<Pet> getPetsByType(String type);

    
    void updatePet(Pet pet);

    
    void removePetById(int petId);
}
