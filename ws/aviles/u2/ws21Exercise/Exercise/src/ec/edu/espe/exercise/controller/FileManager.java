package ec.edu.espe.exercise.controller;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import ec.edu.espe.exercise.model.SoundMixer;
import java.io.FileWriter;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class FileManager {

    public static int chooseOption(int option) {
        Scanner readOption = new Scanner(System.in);
        boolean posibleToContinue;
        do {
            try {
                posibleToContinue = false;
                System.out.println("Choose an option: ");
                option = readOption.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("\nError, please introduce a real number");
                readOption.next();
                posibleToContinue = true;
            }
        } while (posibleToContinue);
        return (option);
    }

    public static ArrayList<SoundMixer> readJson(ArrayList<SoundMixer> soundMixers) throws FileNotFoundException, IOException {
        String line;
        Gson gson = new Gson();
        SoundMixer soundMixer;
        soundMixer = new SoundMixer();
        BufferedReader fileReader = new BufferedReader(new FileReader("soundMixersJson.json"));

        for (int i = 1; (line = fileReader.readLine()) != null; i++) {
            if (i % 2 == 0) {
                soundMixer = gson.fromJson(line, SoundMixer.class);
                soundMixers.add(soundMixer);
            }
        }
        fileReader.close();
        return (soundMixers);
    }

    public static ArrayList<SoundMixer> addSoundMixer(ArrayList<SoundMixer> soundMixers) {
        Scanner readData = new Scanner(System.in);
        boolean posibleToContinue;
        int id = 0;
        float price = 0;
        String brand="";
        SoundMixer soundMixer;
        soundMixer = new SoundMixer();
        System.out.println("\n//////////////////////////////////");
        System.out.println("=======================================");
        System.out.println("          New Sound Mixer.  ");
        System.out.println("=======================================\n");
        do {
            try {
                posibleToContinue = false;
                System.out.println("Enter Id: ");
                id = readData.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("\nError, please introduce a real number.");
                readData.next();
                posibleToContinue = true;
            }
        } while (posibleToContinue);
        do {
            try {
                posibleToContinue = false;
                System.out.println("Enter price: ");
                price = readData.nextFloat();
            } catch (InputMismatchException ex) {
                System.out.println("\nError, please introduce a number.");
                readData.next();
                posibleToContinue = true;
            }
        } while (posibleToContinue);

        System.out.println("Enter the brand: ");
        brand = readData.next();

        soundMixer.setId(id);
        soundMixer.setPrice(price);
        soundMixer.setBrand(brand);
        soundMixers.add(soundMixer);
        System.out.println("========================================");
        System.out.println("Data saved");
        System.out.println("//////////////////////////////////\n");
        return (soundMixers);
    }

    public static int findSoundMixer(ArrayList<SoundMixer> soundMixers) {
        int option = 0;
        int position = -1;
        Scanner readOption = new Scanner(System.in);
        Scanner readId = new Scanner(System.in);
        boolean posibleToContinue;
        int id = 0;
        int idFound;
        boolean inexistenceId = true;

        do {
            id=0;
            System.out.println("\n//////////////////////////////////");
            do {
                try {
                    posibleToContinue = false;
                    System.out.println("Enter the Id of the Pencil to delete.");
                    id = readId.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("\nError, please introduce a real number.");
                    readId.next();
                    posibleToContinue = true;
                }
            } while (posibleToContinue);

            for (int i = 0; i < soundMixers.size(); i++) {
                idFound = soundMixers.get(i).getId();
                if (id == idFound) {
                    position = i;
                    inexistenceId = false;
                }
            }

            if (inexistenceId == true) {
                System.out.println("The id does not exist.");
                do {
                    System.out.println("==================================");
                    System.out.println("Want to try again?");
                    System.out.println("1. YES");
                    System.out.println("2. No");
                    System.out.println("==================================\n");

                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Choose an option: ");
                            option = readOption.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("\nError, please introduce a real number");
                            readOption.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);
                    switch (option) {
                        case 1:
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("==================================");
                            System.out.println("Incorect option\n");
                            break;
                    }
                } while (option != 2 && option != 1);

            } else {
                option = 2;
            }
        } while (option == 1);
        return (position);
    }
    
    public static ArrayList<SoundMixer> deleteSoundMixer(int position, ArrayList<SoundMixer> soundMixers) {
        soundMixers.remove(soundMixers.get(position));
        System.out.println("///////////////////////////////////////////////");
        System.out.println("Sound Mixer eliminated");
        System.out.println("///////////////////////////////////////////////\n");
        return (soundMixers);
    }
    
    public static ArrayList<SoundMixer> updateSoundMixer(int position, ArrayList<SoundMixer> soundMixers) {
        int option = 0;
        boolean posibleToContinue;
        Scanner read = new Scanner(System.in);
        int id=0;
        float price=0;
        String brand="";
        do {
            System.out.println("\n/////////////////////////////////////");
            System.out.println("=================================");
            System.out.println("What do you want to modify: ");
            System.out.println("1. Id");
            System.out.println("2. Price");
            System.out.println("3. Brand");
            System.out.println("4. Confirm adn save new data");
            System.out.println("=================================");
            do {
                try {
                    posibleToContinue = false;
                    System.out.println("Choose an option: ");
                    option = read.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("\nError, please introduce a real number");
                    read.next();
                    posibleToContinue = true;
                }
            } while (posibleToContinue);
            System.out.println("\n==================================\n");
            switch (option) {
                case 1:
                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Enter new Id: ");
                            id = read.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("\nError, please introduce a real number");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);
                    soundMixers.get(position).setId(id);
                    break;
                case 2:
                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Enter new price: ");
                            price = read.nextFloat();
                        } catch (InputMismatchException ex) {
                            System.out.println("\nError, please introduce a number.");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);
                    soundMixers.get(position).setPrice(price);
                    break;
                case 3:
                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Enter new brand: ");
                            brand = read.next();
                        } catch (InputMismatchException ex) {
                            System.out.println("==================================\n");
                            System.out.println("Error, please introduce a number.");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);
                    soundMixers.get(position).setBrand(brand);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("==================================\n");
                    System.out.println("Invalid Option");
                    break;
            }
        }while(option!=4);
        System.out.println("/////////////////////////////////////");
        System.out.println("Sound Mixer updated");
        System.out.println("/////////////////////////////////////\n");
        return (soundMixers);
    }
    
    public static void printSoundMixers(ArrayList<SoundMixer> soundMixers) {
        int id = 0;
        float price = 0;
        String brand = "";
        System.out.println("\n//////////////////////////////////");
        System.out.println("Sound Mixers data");
        System.out.println("|ID\t|PRICE\t|BRAND\t|");
        for (int i = 0; i < soundMixers.size(); i++) {
            id = soundMixers.get(i).getId();
            price = soundMixers.get(i).getPrice();
            brand = soundMixers.get(i).getBrand();
            System.out.println("|" + id + "\t|" + price + "\t|" + brand + "\t|");
        }
        System.out.println("//////////////////////////////////\n\n");
    }
    
    public static void writeJson(ArrayList<SoundMixer> soundMixers) throws IOException {
        Gson gson = new Gson();
        String json;
        FileWriter fileWriter = new FileWriter("soundMixersJson.json");
        fileWriter.write("[\n");
        for (int i = 0; i < soundMixers.size(); i++) {
            json = gson.toJson(soundMixers.get(i));
            if(i!=soundMixers.size()-1){
                json = json + "\n,\n";
            }
            fileWriter.write(json);
        }
        fileWriter.write("\n]");
        fileWriter.close();
        System.out.println("/////////////////////////////////////");
        System.out.println("Sound Mixers saved in JSON file");
        System.out.println("/////////////////////////////////////\n");
    }

}
