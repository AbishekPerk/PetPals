package petpals.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import petpals.entity.Pet;
import petpals.impl.PetService;

public class MainModule {
	 public void insert() {
		  Scanner sc = new Scanner(System.in);
	      PetService ps = new PetService();
	      try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
	    	  System.out.println("Enter Pet details...");
	    	  System.out.println("Enter Pet Name:");
	    	  String name = reader.readLine();
	    	  System.out.println("Enter pet age:");
	    	  int age = sc.nextInt();
	    	  System.out.println("Enter pet breed:");
	    	  String breed = reader.readLine();
	    	  String dogbreed = null;
	    	  String catcolor = null;
	    	  if(breed.equals("Dog")||breed.equals("dog")) {
	    		  System.out.println("Enter dog breed:");
	    		  dogbreed = reader.readLine();
	    	  }else if(breed.equals("Cat")||breed.equals("cat")){
	    		  System.out.println("Enter cat color");
	    		  catcolor = reader.readLine();
	    	  }else {
	    		  System.out.println("invalid Input");
	    	  }
	    	  
	    	  Pet pet = new Pet(name,age,breed,dogbreed,catcolor);
	    	  System.out.println(ps.addPet(pet));
	      }catch(IOException e) {
	    	  e.printStackTrace();
			  System.out.println("Error occurred while reading string input");
	      }
	      }
	 
	 public void retrievebyId() {
		 Scanner sc = new Scanner(System.in);
		 PetService ps = new PetService();
		 System.out.println("Enter Pet id :");
		 int id = sc.nextInt();
		 
		 Pet pet = ps.getPetById(id);
		 
		 System.out.println(pet.toString());
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      MainModule m = new MainModule();
      System.out.println("Insert 1\nRetrieve 2\n");
      int n = sc.nextInt();
      switch(n) {
        case 1:
        	m.insert();
        	break;
        case 2:
        	m.retrievebyId();
      }
      
     
	}

}
