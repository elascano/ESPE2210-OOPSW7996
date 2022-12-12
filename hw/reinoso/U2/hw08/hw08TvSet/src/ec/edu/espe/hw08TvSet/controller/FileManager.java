package ec.edu.espe.hw08TvSet.controller;

import com.google.gson.Gson;
import ec.edu.espe.hw08TvSet.model.hw08TvSet;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class FileManager {

    public static void saveJson(ArrayList<hw08TvSet> TvSets) {
        Gson gson = new Gson();
        String json = gson.toJson(TvSets);

        File file = new File("./TvSetInformation.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("FILE SAVED");
        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");
        }
    }

    public static ArrayList<hw08TvSet> loadJson() {
        Gson gson = new Gson();

        ArrayList<hw08TvSet> tvsets = new ArrayList<>();
        String jsonFile = "";
        String[] jsonTvSets;

        try ( Scanner scFile = new Scanner(new File("./tvsetInformation.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonTvSets = jsonFile.split("},");

            for (int i = 0; i < jsonTvSets.length; i++) {
                if (i < jsonTvSets.length - 1) {
                    tvsets.add(gson.fromJson(jsonTvSets[i] + "}", hw08TvSet.class));
                } else {
                    tvsets.add(gson.fromJson(jsonTvSets[i], hw08TvSet.class));
                }
            }

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("FILE NOT FOUND");
        }

        return tvsets;
    }

    public static hw08TvSet addhw08TvSet() {
        hw08TvSet newhw08TvSet = new hw08TvSet();

        int id;
        String brand;
        String price;

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter TvSet Brand: ");
            brand = scan.nextLine();
            System.out.print("Enter TvSeT ID: ");
            id = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter TvSet price : ");
            price = scan.nextLine();

            newhw08TvSet.setId(id);
            newhw08TvSet.setBrand(brand);
            newhw08TvSet.setPrice(price);

        } catch (Exception e) {
            System.out.println("==============");
            System.out.println("INCORRECT DATA");
            System.out.println("==============");
            return null;
        }

        return newhw08TvSet;
    }

    public static void deleteFile() {
        File file = new File("./TvSetInformation.json");
        try {
            file.delete();
            System.out.println("=======File was deleted=======");
        } catch (Exception e) {
            System.out.println("Error: File not deleted or found");
        }
    }

    public static int findhw08TvSetIndex(List<hw08TvSet> tvsets, int id) {
        int index = 0;

        for (hw08TvSet hw08tvset : tvsets) {
            if (hw08tvset.getId() == id) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void printhw08TvSet(hw08TvSet hw08tvset) {
        System.out.println("=====================================");
        System.out.println("TvSet --> id: " + hw08tvset.getId());
        System.out.println("=====================================");

        if (hw08tvset.getBrand() != null) {
            System.out.println("TvSet brand --> " + hw08tvset.getBrand());
            System.out.println("TvSet price --> " + hw08tvset.getPrice());
        } else {
            System.out.println("TvSet info is empty");
        }
    }
}
