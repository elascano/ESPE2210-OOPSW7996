
package ec.espe.edu.exam.view;

import com.google.gson.Gson;
import ec.edu.espe.exam.model.CompactDisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExamOne 
{

    private static Object CompactDisc;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        CompactDisc compactDisc;
        int id;
        float memory;
        boolean answer =true;
        String color, readGson;
        ArrayList<CompactDisc> compactDiscs;
        compactDiscs=new ArrayList<>();
        File file = new File("./CompactDisc.json");
        do 
        { 
            System.out.print("Enter the disk id: ");
            id=scan.nextInt();
            System.out.print("Enter disk memory: ");
            memory=scan.nextFloat();
            System.out.print("Enter color disk: ");
            color=scan.next();
            compactDisc=new CompactDisc(id, memory, color);
            compactDiscs.add(compactDisc);
            System.out.println("Do you want to add other information?");
            answer=scan.nextBoolean();
            Gson gson=new Gson();
            readGson=gson.toJson(compactDiscs);
            try {
                PrintWriter pw=new PrintWriter(file);
                pw.append(readGson);
                pw.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ExamOne.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        } while (answer==true);
        
    }
    
}
