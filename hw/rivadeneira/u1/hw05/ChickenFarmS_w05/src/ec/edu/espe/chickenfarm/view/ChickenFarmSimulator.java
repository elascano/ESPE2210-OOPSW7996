
package ec.edu.espe.chickenfarm.view;

import java.util.Scanner;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.*;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        
        File file;
        FileWriter write;
        PrintWriter line;
        
        Chicken chickenOne;
        chickenOne= new Chicken();

        String ans;
        int id;
        String name = "";
        int age;
        String color = "";
        boolean Ismolting;
        
        file = new File("C:\\Users\\Administrador\\Desktop\\OOP\\ESPE2210-OOPSW7996\\hw\\rivadeneira\\u1\\hw05\\Chicken.txt");
        
        if(!file.exists()){
        try{
        
        file.createNewFile();
        
        
        System.out.println("Ariel Rivadeneira");
        System.out.println("=========");
        System.out.println("=========");
        System.out.println("Homework");
        System.out.println("=========");
        System.out.println("=========");
       
        
        Scanner scan = new Scanner(System.in);
        do {
        System.out.println("------NEW DATA------");
        System.out.print("chicken id -->");
        id = scan.nextInt();
        System.out.print("chicken name -->");
        name = scan.next();
        System.out.print("chicken age -->");
        age = scan.nextInt();
        System.out.print("chicken color -->");
        color = scan.next();
        System.out.print("chicken is molting (true/false)-->");
        Ismolting = scan.nextBoolean();
        scan.nextLine();
        System.out.println("do you want to continue entering data? yes/no");
        ans = scan.nextLine();
        
        
        write=new FileWriter(file,true); 
        line = new PrintWriter(write);
        line.println("------NEW DATA------");
        line.print("chicken id -->");
        line.println(id);
        line.print("chicken name -->");
        line.println(name);
        line.print("chicken age -->");
        line.println(age);
        line.print("chicken color -->");
        line.println(color);
        line.print("chicken is molting (true/false)-->");
        line.println(Ismolting);
        line.close();
        write.close();
        
        }while( ans.equals("yes"));
        System.out.println("Finish the program");
        
    }catch(IOException exepcion){
        exepcion.printStackTrace (System.out);
    }
        }else{
        try{

     
        System.out.println("Ariel Rivadeneira");
        System.out.println("=========");
        System.out.println("=========");
        System.out.println("Homework");
        System.out.println("=========");
        System.out.println("=========");
       
        
        Scanner scan = new Scanner(System.in);
        do {
        System.out.println("------NEW DATA------");   
        System.out.print("chicken id -->");
        id = scan.nextInt();
        System.out.print("chicken name -->");
        name = scan.next();
        System.out.print("chicken age -->");
        age = scan.nextInt();
        System.out.print("chicken color -->");
        color = scan.next();
        System.out.print("chicken is molting (true/false)-->");
        Ismolting = scan.nextBoolean();
        scan.nextLine();
        System.out.println("do you wish to continue? yes/no");
        ans = scan.nextLine();   
        
        
        write=new FileWriter(file,true); 
        line = new PrintWriter(write);
        line.println("------NEW DATA------");
        line.print("chicken id -->");
        line.println(id);
        line.print("chicken name -->");
        line.println(name);
        line.print("chicken age -->");
        line.println(age);
        line.print("chicken color -->");
        line.println(color);
        line.print("do you want to continue entering data? yes/no");
        line.println(Ismolting);
        line.close();
        write.close();
        
        }while( ans.equals("yes"));
        System.out.println("Finish the program");
        
    }catch(IOException exepcion){
        exepcion.printStackTrace (System.out);
    }

        }
    }
}


   