package factoryPattern;

import java.util.*;

public class Clinic {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        System.out.println ("[1] Dog" + "\n[2] Cat" + "\nChoose your pet number: ");
        Integer choice = input.nextInt();
    }

    PetRecord petRecord = new PetRecord();
    Pet pet;

    switch(choice) {
        case 1: pet = new Dog();
        petRecord.setPetId("P001");
        petRecord.setPetName("Bantay");
        Dog dog = new Dog();
        
    }
}