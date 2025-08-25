package factoryPattern;

import java.util.*;

public class Clinic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n[1] Dog \n[2] Cat \n[3] Exit \n\nChoose your pet number: ");
            choice = input.nextInt();

            PetRecord petRecord = new PetRecord();
            Pet pet;

            switch (choice) {
                case 1:
                    pet = new Dog();
                    petRecord.setPetId("P01");
                    petRecord.setPetName("Bantay");
                    ((Dog) pet).setBreed("German Shepherd");
                    
                    petRecord.setPet(pet);
                    displayPetRecord(petRecord);
                    System.out.println("Breed is " + ((Dog) pet).getBreed());
                    break;

                case 2:
                    pet = new Cat();
                    petRecord.setPetId("P02");
                    petRecord.setPetName("Muning");
                    ((Cat) pet).setNoOfLives(9);
                    
                    petRecord.setPet(pet);
                    displayPetRecord(petRecord);
                    System.out.println("Number of lives is " + ((Cat) pet).getNoOfLives());
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);

        input.close();
    }

    private static void displayPetRecord(PetRecord record) {
        Pet pet = record.getPet();
        System.out.println("\nPet ID: " + record.getPetId());
        System.out.println("Pet name: " + record.getPetName());
        System.out.println("Pet kind: " + pet.getClass().getSimpleName());
        System.out.println("Sound: " + pet.makeSound());
        System.out.println("Play mode: " + pet.play());
    }
}
