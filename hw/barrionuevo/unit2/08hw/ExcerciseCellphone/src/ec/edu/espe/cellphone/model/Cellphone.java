package ec.edu.espe.cellphone.model;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class Cellphone {

    private int idCellphone;
    private String branPhone;
    private String modelPhone;
    private ArrayList<String> allPhones;

    public Cellphone() {
        this.idCellphone = 0;
        this.branPhone = "";
        this.modelPhone = "";
        this.allPhones = new ArrayList<>();
    }

    public Cellphone(int ID, String brandPhone, String modelPhone, ArrayList<String> allPhones) {
        this.idCellphone = ID;
        this.branPhone = brandPhone;
        this.modelPhone = modelPhone;
        this.allPhones = allPhones;
    }

    public int getIdCellphone() {
        return idCellphone;
    }

    public void setIdCellphone(int idCellphone) {
        this.idCellphone = idCellphone;
    }

    public String getBranPhone() {
        return branPhone;
    }

    public void setBrandPhone() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Enter the Brand Phone: ");
        branPhone = scan.nextLine();
    }

    public String getModelPhone() {
        return modelPhone;
    }

    public void setModelPhone() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Enter the model Phone: ");
        modelPhone = scan.nextLine();
    }

    public ArrayList<String> getCellphoneProperty() {
        return allPhones;
    }

    public void setCellphoneProperty() {        
        Scanner scan;
        scan = new Scanner(System.in);
        
        allPhones = new ArrayList<>();
                
        String option;
        String cellphoneProperty;
        
        do {
            System.out.println("Enter the property of phone: ");
            cellphoneProperty = scan.nextLine();
            allPhones.add(cellphoneProperty);
            System.out.println("Do you want to enter another property? (yes/no)");
            option = scan.nextLine();
        } while (option.toLowerCase().equals("yes"));
    }

    @Override
    public String toString() {
        return "ID=" + idCellphone + ", Brand Phone=" + branPhone + ", Model Phone=" + modelPhone + ", Property=" + allPhones;
    }

    public void enterInfo(int nextId) {                                
        setIdCellphone(nextId);                
        setBrandPhone();
        setModelPhone();
        setCellphoneProperty();
    }

    public void remove(Cellphone cellphone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
