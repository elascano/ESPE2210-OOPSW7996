/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chickenfarms;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class ChickenFarms {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Carlos Alexander Torres");
        System.out.println("-This is my first time using NetBeans-");
        System.out.println("And it is easy");
        System.out.println("Society needs good professionals, good students, good programmers");
        
        System.out.println("=========================================");

        if (args.length == 0) {
            System.out.println("There are no arguments");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("arg [" + i + "]" + args[i]);

            }
        }
        System.out.println("=========================================");

    }
    
}
