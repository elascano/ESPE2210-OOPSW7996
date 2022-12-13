
package ec.edu.espe.countryCRUD.view;

import ec.edu.espe.countryCRUD.controller.FileManager;
import ec.edu.espe.countryCRUD.model.Country;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class CountrySimulator {
    public static void main(String[] args) {
        int option = 0;
        int countryIndex;
        int countryId;
        
        Scanner scan;
        Country country;
        ArrayList<Country> countries;
        
        
        scan = new Scanner(System.in);
        
        countries = FileManager.loadJson();
                
        while (option != 5) {
            System.out.println("Diego Pilataxi");
            System.out.println("-----------------------------------------");
            System.out.println("                  MENU"                   );
            System.out.println("-----------------------------------------");
            System.out.println("1. Create new Country");
            System.out.println("2. Read the Country");
            System.out.println("3. Update information tu .json");
            System.out.println("4. Delete Country");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            try {
                option = scan.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            scan.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("----------Add INFO----------");
                    country = FileManager.addCountry();
                    if (country != null) {
                        countries.add(country);
                    }
                }
                case 2 -> {
                    System.out.println("----------City info----------");
                    System.out.print("Enter city ID: ");
                    countryId = scan.nextInt();
                    scan.nextLine();
                    countryIndex = FileManager.findCountryIndex(countries, countryId);
                    if (countryIndex >= 0) {
                        FileManager.printCountry(countries.get(countryIndex));
                    } else {
                        System.out.println("City ID not found");
                    }
                }
                case 3 -> {
                    System.out.println("----------SAVED----------");
                    //saveFile(chickens);
                    FileManager.saveJson(countries);
                }
                
                case 4 -> {
                    System.out.println("----------File----------");
                    FileManager.deleteFile();
                } 

                case 5 ->
                    System.out.println("GOD BYE....");

                default ->
                    System.out.println("OPTION NOT VALID");
            }
            scan.nextLine();
        }
    }
    
}
