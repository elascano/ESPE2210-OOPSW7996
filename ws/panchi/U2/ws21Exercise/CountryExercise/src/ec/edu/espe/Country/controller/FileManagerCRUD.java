package ec.edu.espe.Country.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.Country.model.Country;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class FileManagerCRUD {
    private static final Scanner sc = new Scanner(System.in);
    public static void enterCountries(ArrayList<Country> countries){
        Country country = new Country();
        
        System.out.println("Enter the Id");
        country.setId(sc.nextInt());
        System.out.println("Enter the name");
        country.setName(sc.next());
        System.out.println("Enter the number of cities");
        country.setCities(sc.nextInt());
        
        countries.add(country);
    }
    
    public static ArrayList<Country> readJson(ArrayList<Country> countries){
        Gson gson = new Gson();
        try
        {
            Reader reader = Files.newBufferedReader(Paths.get("CountriesList.json"));
            TypeToken<ArrayList<Country>> type = new TypeToken<ArrayList<Country>>(){};
            countries = gson.fromJson(reader, type.getType());
            reader.close();
        }catch(FileNotFoundException ex)
        {
            System.out.println("File not found");
        }catch(IOException ex)
        {
            System.out.println("Empty File");
        }
        return countries;
    }
    public static void editJson(ArrayList<Country> countries){
        File fileJson = new File("CountriesList.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(countries);
        try(FileWriter writer = new FileWriter(fileJson))
        {
            writer.write(json);
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e){
            e.printStackTrace(System.out);
        }
    }
    public static void printCountries(){
        ArrayList<Country> countries = new ArrayList<>();
        Country country = new Country();
        countries = readJson(countries);
        boolean countriesExist = true;
        
        if(countries.isEmpty()){
            System.out.println("There are no countries");
            countriesExist = false;
        }
        
        if(countriesExist)
        {
            System.out.println("|\tID\t|\tName\t|\tCities\t|");
        }
        for (int i = 0; i < countries.size(); i++) {
            country = countries.get(i);
            System.out.println("|\t" + country.getId() + "\t|\t" + country.getName() + "\t|\t" + country.getCities()+ "\t|\t");
        }
    }
    public static void updateCountries() {
        ArrayList<Country> countries = new ArrayList<>();
        boolean idNotFound = true;
        
        countries = readJson(countries);
        System.out.print("Enter the countrie's id to update: ");
        int match = sc.nextInt();
        
        for (int i = 0; i < countries.size(); i++)
        {
            if (match == countries.get(i).getId())
            {
                changeInfo(countries, i);
                idNotFound = false;
            }
        }
        if(idNotFound){
            System.out.println("ID not found");
        }
    }
    private static void changeInfo(ArrayList<Country> countries, int position) {

        System.out.println("Enter the new country id");
        countries.get(position).setId(sc.nextInt());
        System.out.println("Enter the new country name");
        countries.get(position).setName(sc.next());
        System.out.println("Enter the name of the cities");
        countries.get(position).setCities(sc.nextInt());
        
        editJson(countries);
        System.out.println("Country information changed");
    }
    
    public static void deleteCountries(){
        File fileJson = new File("CountriesList.json");
        try
        {
            System.out.println("Are you sure?\n1. Yes\n2. No");
            int answer = sc.nextInt();
            while(answer < 1 || answer > 2){
                System.out.println("Incorrect value, enter again");
                answer = sc.nextInt();
            }
            
            if(answer == 1){
                FileWriter writer = new FileWriter(fileJson);
                writer.write("[]");
                writer.close();
                System.out.println("Data has been deleted");
            } else {
                System.out.println("The data hasn't been deleted");
            }
            
        } catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }
}
