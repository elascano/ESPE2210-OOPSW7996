
package ec.edu.espe.ExamPractice.view;

import ec.edu.espe.ExamPractice.model.Cellphone;
import java.util.Scanner;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class ExamPractice {
    static Cellphone cellphone;
    
    public static void main (String [] args){
        cellphone = new Cellphone();
        controlMainMenu ();
        

    }
    public static void controlMainMenu(){
        int option =0;
        while (option != 2){
            System.out.println("---------------------------------");
            System.out.println("              MENU");
            System.out.println("---------------------------------");
            System.out.println("1. Add Cellphone Data ");
            System.out.println("2. Leave Program");
            System.out.println("---------------------------------");
            option = validateOption();
            switch (option) {
                case 1 -> cellphone.setCellphone();
            }

        }
          
    }
    
    public static int validateOption(){
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nChoose an option: ");
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            option = 0;
        }
        sc.nextLine();

        return option;
    }
}

