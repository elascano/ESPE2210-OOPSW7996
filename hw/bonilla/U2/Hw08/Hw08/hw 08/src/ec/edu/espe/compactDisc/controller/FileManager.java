package ec.edu.espe.compactDisc.controller;

import com.google.gson.Gson;
import ec.edu.espe.compactdisc.model.CompactDisc;
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
    private File fileJson=new File("./compactDisc.json");
    private ArrayList<CompactDisc> arrayCompactDisc;
    private ArrayList<CompactDisc> listJson;

    public FileManager(String file) {
        this.file = new File(file);
        arrayCompactDisc = new ArrayList<>();
    }
    public void save(CompactDisc compactDisc)
    {
        listJson=new ArrayList<>();
        
        Gson gson = new Gson();
        FileWriter fileWriter;
        PrintWriter printWriter;
        listJson.add(compactDisc);

        String readGson = gson.toJson(compactDisc);
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
                Logger.getLogger(CompactDisc.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(CompactDisc.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void getInformation(CompactDisc compactDisc) {
        if (file.exists()) {
            

            try ( ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
                while (true) {
//----------------> nombre del dato declarado = (TIPO DE DATO) bjectInputStream.readObject()                   
                    compactDisc = (CompactDisc) objectInputStream.readObject();
                    arrayCompactDisc.add(compactDisc);
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

    public void saveObject(CompactDisc compactDisc) {
        if (file.exists() && file.length() > 0) {
            try ( MiObjectOutputStream miObjectOutputStream = new MiObjectOutputStream(new FileOutputStream(file, true))) {
                miObjectOutputStream.writeObject(compactDisc);
                arrayCompactDisc.add(compactDisc);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            try ( ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
                objectOutputStream.writeObject(compactDisc);
                arrayCompactDisc.add(compactDisc);

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
        arrayCompactDisc.clear();
        
    }


    public void showDates()
    {
        if(file.exists())
        {
            for (CompactDisc compactDisc : arrayCompactDisc) {
            System.out.println(compactDisc);
            }
            
        }
        else
        {
            System.out.println("");
        }
        
    }

    public void deleteData(CompactDisc vinylRecord, int id) {
        int iterator = -1;
        
        if (file.exists() && file.length() > 0) {
            
            for (int i = 0; i < arrayCompactDisc.size(); i++) {
               
                if (id == arrayCompactDisc.get(i).getId()) {
                   
                    iterator = i;
                    break;
                }
            }
            if (iterator > -1) {
               
                ArrayList<CompactDisc> copy = arrayCompactDisc;
                arrayCompactDisc = new ArrayList<>();
                file.delete();
                fileJson.delete();
                
                copy.remove(iterator);
                for (CompactDisc c : copy) {
                  
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
