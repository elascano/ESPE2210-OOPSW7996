
package ec.edu.espe.cityInfo.controller;

import com.google.gson.Gson;
import ec.edu.espe.cityInfo.model.City;
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

    public static void saveJson(ArrayList<City> cities) {
        Gson gson = new Gson();
        String json = gson.toJson(cities);
        
        File file = new File("./cityInformation.json");
        try ( FileWriter fw = new FileWriter(file);) {            
            fw.write(json);            
            System.out.println("FILE SAVED");
        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");
        } 
    }
    
    public static ArrayList<City> loadJson() {
        Gson gson = new Gson();
        
        ArrayList<City> cities = new ArrayList<>();
        String jsonFile = "";
        String[] jsonCities;
        
        try ( Scanner scFile = new Scanner(new File("./cityInformation.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }
            
            jsonFile = jsonFile.replace("[","");
            jsonFile = jsonFile.replace("]","");
            
            jsonCities = jsonFile.split("},");
            
            for (int i = 0; i < jsonCities.length; i++) {
                if (i < jsonCities.length - 1) {
                    cities.add(gson.fromJson(jsonCities[i] + "}", City.class));
                } else {
                    cities.add(gson.fromJson(jsonCities[i], City.class));
                }
            }  
            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("FILE NOT FOUND");
        }

        return cities;
    }
    
    public static City addCity() {
        City newCity = new City();

        int id;
        String name;
        String country;

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter city Name: ");
            name = scan.nextLine();
            System.out.print("Enter city ID: ");
            id = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter country from city: ");
            country = scan.nextLine();

            newCity.setId(id);
            newCity.setName(name);
            newCity.setCountry(country);

        } catch (Exception e) {
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("INCORRECT DATA");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            return null;
        }

        return newCity;
    }
    
    public static void deleteFile() {
        File file = new File("./cityInformation.json");
        try {
            file.delete();
            System.out.println("----------File was deleted----------");
        } catch (Exception e) {
            System.out.println("Error: File not deleted or found");
        }
    }
    
    public static int findCityIndex(List<City> cities, int id) {
        int index = 0;

        for (City city : cities) {
            if (city.getId() == id) {
                return index;
            }
            index++;
        }
        return -1;
    }
    
    public static void printCity(City city) {
        System.out.println("=========================================");
        System.out.println("city --> id: " + city.getId());
        System.out.println("=========================================");

        if (city.getName() != null) {
            System.out.println("City name --> " + city.getName());
            System.out.println("City Country --> " + city.getCountry());
        } else {
            System.out.println("City info is empty");
        }
    }
}
