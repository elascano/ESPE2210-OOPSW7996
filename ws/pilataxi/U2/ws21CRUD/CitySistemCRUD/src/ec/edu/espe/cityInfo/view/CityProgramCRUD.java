
package ec.edu.espe.cityInfo.view;

import ec.edu.espe.cityInfo.controller.FileManager;
import ec.edu.espe.cityInfo.model.City;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class CityProgramCRUD {
    public static void main(String[] args) {
        int option = 0;
        int cityIndex;
        int cityId;
        
        Scanner scan;
        City city;
        ArrayList<City> cities;
        
        
        scan = new Scanner(System.in);
        
        cities = FileManager.loadJson();
                
        while (option != 5) {
            System.out.println("Diego Pilataxi");
            System.out.println("-----------------------------------------");
            System.out.println("                  MENU"                   );
            System.out.println("-----------------------------------------");
            System.out.println("1. Create new City");
            System.out.println("2. Read the City");
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
                    city = FileManager.addCity();
                    if (city != null) {
                        cities.add(city);
                    }
                }
                case 2 -> {
                    System.out.println("----------City info----------");
                    System.out.print("Enter city ID: ");
                    cityId = scan.nextInt();
                    scan.nextLine();
                    cityIndex = FileManager.findCityIndex(cities, cityId);
                    if (cityIndex >= 0) {
                        FileManager.printCity(cities.get(cityIndex));
                    } else {
                        System.out.println("City ID not found");
                    }
                }
                case 3 -> {
                    System.out.println("----------SAVED----------");
                    //saveFile(chickens);
                    FileManager.saveJson(cities);
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
