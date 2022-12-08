
package ec.edu.espe.countryInfo.view;

import ec.edu.espe.countryInfo.model.Country;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import com.google.gson.Gson;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class CountryClass {
    public static void main(String[] args) {
        int option = 0;
        
        Scanner scan;
        Country country;
        ArrayList<Country> countries;
        
        
        scan = new Scanner(System.in);
        
        countries = loadJson();
                
        while (option != 3) {
            System.out.println("Diego Pilataxi");
            System.out.println("-----------------------------------------");
            System.out.println("                  MENU"                   );
            System.out.println("-----------------------------------------");
            System.out.println("1. Add new Country");
            System.out.println("2. Save Country");
            System.out.println("3. Exit");

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
                    country = addCountry();
                    if (country != null) {
                        countries.add(country);
                    }
                }
                case 2 -> {
                    System.out.println("----------SAVED----------");
                    //saveFile(chickens);
                    saveJson(countries);
                }

                case 3 ->
                    System.out.println("GOD BYE....");

                default ->
                    System.out.println("OPTION NOT VALID");
            }
            scan.nextLine();
        }
       
        
        
    }
    private static void saveJson(ArrayList<Country> countries) {
        Gson gson = new Gson();
        String json = gson.toJson(countries);
        
        File file = new File("./countryInfo.json");
        try ( FileWriter fw = new FileWriter(file);) {            
            fw.write(json);            
            System.out.println("FILE SAVED");
        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");
        } 
    }
    
    private static ArrayList<Country> loadJson() {
        Gson gson = new Gson();
        
        ArrayList<Country> countries = new ArrayList<>();
        String jsonFile = "";
        String[] jsonCountries;
        
        try ( Scanner scFile = new Scanner(new File("./countryInfo.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }
            
            jsonFile = jsonFile.replace("[","");
            jsonFile = jsonFile.replace("]","");
            
            jsonCountries = jsonFile.split("},");
            
            for (int i = 0; i < jsonCountries.length; i++) {
                if (i < jsonCountries.length - 1) {
                    countries.add(gson.fromJson(jsonCountries[i] + "}", Country.class));
                } else {
                    countries.add(gson.fromJson(jsonCountries[i], Country.class));
                }
            }  
            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("FILE NOT FOUND");
        }

        return countries;
    }
    
    static Country addCountry() {
        Country newCountry = new Country();

        int id;
        String name;
        String continent;

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter country Name: ");
            name = scan.nextLine();
            System.out.print("Enter country ID: ");
            id = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter country continent: ");
            continent = scan.nextLine();

            newCountry.setId(id);
            newCountry.setName(name);
            newCountry.setContinent(continent);

        } catch (Exception e) {
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("INCORRECT DATA");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            return null;
        }

        return newCountry;
    }
    
}

