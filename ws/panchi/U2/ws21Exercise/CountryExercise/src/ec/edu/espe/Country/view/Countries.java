package ec.edu.espe.Country.view;
import java.util.*;
import ec.edu.espe.Country.model.Country;
import ec.edu.espe.Country.controller.FileManagerCRUD;
/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Countries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean leave = false;
        int option = 0;
        ArrayList<Country> countries = new ArrayList<>();
        
        while(!leave)
        {
            try
            {
                option = showOptions(option);
                switch(option){
                    case 1:
                        countries = FileManagerCRUD.readJson(countries);
                        FileManagerCRUD.enterCountries(countries);
                        FileManagerCRUD.editJson(countries);
                        System.out.println("---The country has been added---");
                        break;
                    case 2:
                        FileManagerCRUD.printCountries();
                        break;
                    case 3:
                        FileManagerCRUD.updateCountries();
                        break;
                    case 4:
                        FileManagerCRUD.deleteCountries();
                        break;
                    case 5:
                        leave = true;
                        break;
                }
            }catch(InputMismatchException e){
                System.out.println("Option no valid");
                sc.next();
            }
        }
    }
    
    private static int showOptions(int option){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enter a country");
        System.out.println("2. Print the countries");
        System.out.println("3. Update the data country");
        System.out.println("4. Delete all the countries");
        System.out.println("5. Exit");
        System.out.println("Please choose an option");
        option = sc.nextInt();
        return option;
    }
}
