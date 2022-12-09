package ec.edu.espe.cable.model;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class Cable {

    private int idCable;
    private String typeOfCable;
    private String typeOfConductor;
    private ArrayList<String> allCables;

    public Cable() {
        this.idCable = 0;
        this.typeOfCable = "";
        this.typeOfConductor = "";
        this.allCables = new ArrayList<>();
    }

    public Cable(int ID, String name, String conductor, ArrayList<String> allCables) {
        this.idCable = ID;
        this.typeOfCable = name;
        this.typeOfConductor = conductor;
        this.allCables = allCables;
    }

    public int getIdCable() {
        return idCable;
    }

    public void setIdCable(int idCable) {
        this.idCable = idCable;
    }

    public String getTypeOfCable() {
        return typeOfCable;
    }

    public void setNameCable() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Enter the type of cable: ");
        typeOfCable = scan.nextLine();
    }

    public String getTypeOfConductor() {
        return typeOfConductor;
    }

    public void setConductor() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Enter the type of Conductor: ");
        typeOfConductor = scan.nextLine();
    }

    public ArrayList<String> getCableProperty() {
        return allCables;
    }

    public void setCableProperty() {        
        Scanner scan;
        scan = new Scanner(System.in);
        
        allCables = new ArrayList<>();
                
        String option;
        String cableProperty;
        
        do {
            System.out.println("Enter the property of cable: ");
            cableProperty = scan.nextLine();
            allCables.add(cableProperty);
            System.out.println("Do you want to enter another property? (yes/no)");
            option = scan.nextLine();
        } while (option.toLowerCase().equals("yes"));
    }

    @Override
    public String toString() {
        return "ID=" + idCable + ", Type of Cable=" + typeOfCable + ", Type of Conductor=" + typeOfConductor + ", Property=" + allCables;
    }

    public void enterInfo(int nextId) {                                
        setIdCable(nextId);                
        setNameCable();
        setConductor();
        setCableProperty();
    }
}
