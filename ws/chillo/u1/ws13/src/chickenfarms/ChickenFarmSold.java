/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chickenfarms;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class ChickenFarmSold {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Nicolay Chillo");
        System.out.println("-This is my first time in NetBeans-");
        System.out.println("And it is easy");
        System.out.println(" Edison is a excelent profesor :D");
        
        System.out.println("-------------------------------");
        
        if (args.length == 0) {
            System.out.println("There are no arguments");
        } else {
          for (int i = 0; i < args.length; i++) {
                System.out.println("arg ¨[" + i + "]" + args[i]);
            }
        }
        
        System.out.println("------------------------------");
    }
        
}
