package ec.edu.espe.chickenfarm.controller;

/**
 *
 * @author JuanPa
 */
public class ChickenFarmS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Juan Pablo Pinza");
        System.out.println("-This is my first time using Netbeans-");
        System.out.println("And it's easy");
        System.out.println("Cats are better than dogs c:");

        if (args.length == 0) {
            System.out.println("There are no arguments");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("arg [" + i + "]" + args[i]);
            }
        }
        System.out.println("==============================");
    }

}
