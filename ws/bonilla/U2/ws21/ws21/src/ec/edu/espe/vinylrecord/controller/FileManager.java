package ec.edu.espe.vinylrecord.controller;

import com.google.gson.Gson;
import ec.edu.espe.vinylrecord.model.VinylRecord;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {

    private File file;
    private File fileJson=new File("./VinylRecord.json");
    private ArrayList<VinylRecord> arrayVinylRecords;
    private ArrayList<VinylRecord> listJson;

    public FileManager(String file) {
        this.file = new File(file);
        arrayVinylRecords = new ArrayList<>();
    }
    public void save(VinylRecord vinylRecord)
    {
        listJson=new ArrayList<>();
        
        Gson gson = new Gson();
        FileWriter fileWriter;
        PrintWriter printWriter;
        listJson.add(vinylRecord);

        String readGson = gson.toJson(vinylRecord);
        if (!file.exists()) {
            try {
                file.createNewFile();
                fileWriter = new FileWriter(fileJson, true);
                printWriter = new PrintWriter(fileWriter);
                printWriter.write(readGson);
                printWriter.write("\n");
                printWriter.close();
                fileWriter.close();

            } catch (IOException ex) {
                Logger.getLogger(VinylRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {

                fileWriter = new FileWriter(fileJson, true);
                printWriter = new PrintWriter(fileWriter);
                printWriter.write(readGson);
                printWriter.write("\n");
                printWriter.close();
                fileWriter.close();

            } catch (IOException ex) {
                Logger.getLogger(VinylRecord.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void getInformation(VinylRecord vinylRecord) {
        if (file.exists()) {
            

            try ( ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
                while (true) {
//----------------> nombre del dato declarado = (TIPO DE DATO) bjectInputStream.readObject()                   
                    vinylRecord = (VinylRecord) objectInputStream.readObject();
                    arrayVinylRecords.add(vinylRecord);
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (EOFException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void saveObject(VinylRecord vinylRecord) {
        if (file.exists() && file.length() > 0) {
            try ( MiObjectOutputStream miObjectOutputStream = new MiObjectOutputStream(new FileOutputStream(file, true))) {
                miObjectOutputStream.writeObject(vinylRecord);
                arrayVinylRecords.add(vinylRecord);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            try ( ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
                objectOutputStream.writeObject(vinylRecord);
                arrayVinylRecords.add(vinylRecord);

            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
    }

    public void clearInformation()
    {
        file.delete();
        fileJson.delete();
        arrayVinylRecords.clear();
        
    }


    public void showDates()
    {
        if(file.exists())
        {
            for (VinylRecord vinylRecord : arrayVinylRecords) {
            System.out.println(vinylRecord);
            }
            
        }
        else
        {
            System.out.println("");
        }
        
    }

    public void deleteData(VinylRecord vinylRecord, int id) {
        int iterator = -1;
        
        if (file.exists() && file.length() > 0) {
            
            for (int i = 0; i < arrayVinylRecords.size(); i++) {
               
                if (id == arrayVinylRecords.get(i).getId()) {
                   
                    iterator = i;
                    break;
                }
            }
            if (iterator > -1) {
               
                ArrayList<VinylRecord> copy = arrayVinylRecords;
                arrayVinylRecords = new ArrayList<>();
                file.delete();
                fileJson.delete();
                
                copy.remove(iterator);
                for (VinylRecord c : copy) {
                  
                    saveObject(c);
                    save(c);
                }
                System.out.println("\n\n\t\tData deleted successfully!!");

                
            } else {
                System.out.println("\n\t\tId not found, please enter a valid id!!");
            }

        } else {
            System.out.println("Cannot delete because the file does not exist The file does not exist");
        }

    }

}
