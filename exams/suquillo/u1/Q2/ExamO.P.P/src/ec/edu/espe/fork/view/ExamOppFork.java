package ec.edu.espe.fork.view;

import com.google.gson.Gson;
import ec.edu.espe.fork.model.Fork;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class ExamOppFork {

    private static int forkId;
    private static boolean repeatFork;
    private static boolean repeatfork;

    public static void main(String[] args) throws IOException {
        ArrayList<Fork> forks = new ArrayList<>();
        Fork chicken = new Fork();
        Scanner input = new Scanner(System.in);
        int position[] = new int[1];
        boolean exit = false;
        int option;
        position[0] = 0;
    
        System.out.println(position[0]);
        while (!exit) {
            System.out.println("");
            System.out.println("====================");
            System.out.println("MARTIN SUQUILLO");
            System.out.println("==========Menu==========");
            System.out.println("1.Enter a new fork?");


            try {
                System.out.println("Enter an option number");
                option = input.nextInt();
                System.out.println("");
                switch (option) {
                    case 1 -> {
                        //createFile(); 
                        enterChicken(forks, chicken, position);
                        saveAsJson(forks.get(position[0]));
                        position[0]++;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect dataType");
                System.out.println("If you don't see the menu again");
                System.out.println("Write any character and press enter");
                input.next();
            }
        }

    }

    private static void printFork(Fork chicken) {
        System.out.println(chicken); 
    }

    private static void enterChicken(ArrayList<Fork> Forks, Fork fork, int position[]) {
        int id = 0;
        String size = "";
        String material = "";
        Scanner input = new Scanner(System.in);
        do{
        repeatFork=false;
        System.out.println("ENTER THE FORK ID");
        forkId = input.nextInt();
        input.nextLine();
        }while(repeatfork == true );

        System.out.println("ENTER FORK SIZE(BIG/MEDIUM/SMALL)");
        input.nextLine();
       
        System.out.println("ENTER FORK MATERIAL:)");
        input.nextLine();
    
    }
   
    private static void saveAsJson(Fork fork) throws IOException {
        File forkList = new File("FrokList.json");
        Gson gson = new Gson();
        String json = gson.toJson(fork);
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(forkList, true))) {
            writer.println("");
            writer.print(json);
        }
    }    
    
}
