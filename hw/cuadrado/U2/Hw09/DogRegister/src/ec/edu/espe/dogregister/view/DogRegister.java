package ec.edu.espe.dogregister.view;

import static ec.edu.espe.dogregister.controller.FileManager.*;
import ec.edu.espe.dogregister.utils.DataNotFoundException;
import ec.edu.espe.dogregister.model.Dog;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alejandro Cuadrado
 */
public class DogRegister {
    
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        ArrayList<Dog> actualDogData = new ArrayList<>();
        String fileName = "Dogs.json";

        do {
            actualDogData = read(actualDogData, "Dogs.json");
            System.out.println("Menu Dog Register :3");
            System.out.println("++++++--------------++++++");
            System.out.println("1.Insert a new Dog:  ");
            System.out.println("2.Find a Dog:        ");
            System.out.println("3.Print Dogs:        ");
            System.out.println("4.Exit of program:   ");           
            System.out.print("Enter one option:");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    addDog(actualDogData);
                    create(actualDogData, fileName);
                    System.out.println("\n\n--Dog added--\n");
                }
                case 2 -> {
                    findOneDog(actualDogData);
                }
                case 3 ->
                    printList(actualDogData);
                case 4 ->
                    System.out.println("You exit:");
                default ->
                    System.out.println("Invalid option:");
            }
        } while (option != 4);
    }
    private static void findOneDog(ArrayList<Dog> actualDogsData) {
        int idToSearch;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("\nInsert id of the Dog to search: ");
            idToSearch = sc.nextInt();
            try {
                int dogFoundPosition = find(actualDogsData, idToSearch);
                System.out.println("\nID\t|Name\t|Age|");
                printLine(actualDogsData.get(dogFoundPosition));
            } catch (DataNotFoundException ex) {
                System.out.println("Error: ");
                System.out.println(ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("-- Incorrect data please try again :,3");
        }
    }
    public static void addDog(ArrayList<Dog> dogs) {
        Scanner sc = new Scanner(System.in);
        Dog dog;
        int id;
        String name;
        float age;
        try {
            System.out.println("++++-----------------------------------++++");
            System.out.print("Enter the id of the Dog :3: ");
            id = sc.nextInt();
            while (validateIdExistance(id)) {
                System.out.print("++ The id already exists, enter a new id : ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Enter the Name of the Dog: ");
            name = sc.nextLine();

            System.out.print("Enter the age of Dog: ");
            age = sc.nextFloat();
            
            dog = new Dog(id, name, age);
            System.out.println("++++-------------------------------------++++");
            dogs.add(dog);
        } catch (Exception e) {
            System.out.println("+++ datos inválidos, ingrese datos nuevos:");
        }
    }
    public static boolean validateIdExistance(int id) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs = read(dogs, "Dogs.json");
        Dog dog = new Dog();
        for (int i = 0; i < dogs.size(); i++) {
            dog = dogs.get(i);
            if (id == dog.getId()) {
                return true;
            }
        }
        return false;
    }
}

