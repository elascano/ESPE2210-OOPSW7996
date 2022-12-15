package ec.edu.espe.guitarshop.model;

import ec.edu.espe.guitarshop.util.IdLessThanZeroException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class GuitarManager {

    private String name;

    public GuitarManager(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public void showGuitars(ArrayList<Guitar> guitars) {
        System.out.println("List of registered guitars");
        for (Guitar guitar : guitars) {
            System.out.println(guitar);
        }
    }

    public Guitar addGuitar() throws IdLessThanZeroException {
        Scanner scan = new Scanner(System.in);

        Guitar newGuitar;

        int id = -1;
        String brand;
        String color;
        String typeOfWood;

        System.out.print("Enter the guitar ID: ");
        try {
            id = scan.nextInt();            
            validateId(id);
        } catch (Exception e) {
            System.out.println("Error: invalid number");
        }
        
        scan.nextLine();

        if (id >= 0) {
            System.out.print("Enter the guitar brand: ");
            brand = scan.nextLine();
            System.out.print("Enter the guitar color: ");
            color = scan.nextLine();
            System.out.print("Enter type of wood of the guitar: ");
            typeOfWood = scan.nextLine();
            newGuitar = new Guitar(id, brand, color, typeOfWood);
        } else {
            newGuitar = null;
        }

        return newGuitar;
    }

    private void validateId(int id) {
        try {
            if (id < 0) {
                throw new IdLessThanZeroException();
            }
        } catch (IdLessThanZeroException e) {
            System.out.println(e.getMessage());
        }
    }

}
