
package ec.edu.espe.countryCRUD.controller;

import com.google.gson.Gson;
import ec.edu.espe.countryCRUD.model.Country;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class FileManager {
    public static void saveJson(ArrayList<Country> countries) {
        Gson gson = new Gson();
        String json = gson.toJson(countries);
        
        File file = new File("./countryInformation.json");
        try ( FileWriter fw = new FileWriter(file);) {            
            fw.write(json);            
            System.out.println("FILE SAVED");
        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");
        } 
    }
    
    public static ArrayList<Country> loadJson() {
        Gson gson = new Gson();
        
        ArrayList<Country> countries = new ArrayList<>();
        String jsonFile = "";
        String[] jsonCountries;
        
        try ( Scanner scFile = new Scanner(new File("./countryInformation.json"))) {
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
    
    public static Country addCountry() {
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
            System.out.print("Enter continent from country: ");
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
    
    public static void deleteFile() {
        File file = new File("./countryInformation.json");
        try {
            file.delete();
            System.out.println("----------File was deleted----------");
        } catch (Exception e) {
            System.out.println("Error: File not deleted or found");
        }
    }
    
    public static int findCountryIndex(List<Country> countries, int id) {
        int index = 0;

        for (Country country : countries) {
            if (country.getId() == id) {
                return index;
            }
            index++;
        }
        return -1;
    }
    
    public static void printCountry(Country country) {
        System.out.println("=========================================");
        System.out.println("country --> id: " + country.getId());
        System.out.println("=========================================");

        if (country.getName() != null) {
            System.out.println("City name --> " + country.getName());
            System.out.println("City Country --> " + country.getContinent());
        } else {
            System.out.println("City info is empty");
        }
    }
}
