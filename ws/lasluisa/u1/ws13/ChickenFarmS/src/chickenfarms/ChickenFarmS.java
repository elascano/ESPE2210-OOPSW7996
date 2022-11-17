package chickenfarms;

/**
 *
 * @author erick
 */
public class ChickenFarmS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Erick Lasluisa");
        System.out.println("-This is my first time using NetBeans-");
        System.out.println(" And it is easy");
        System.out.println(" Practice will make you learn until you master the skill");

        
        System.out.println("===========================");
        if (args.length == 0) {
            System.out.println("There are no arguments");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("arg [" + i + "]" + args[i]);
            }
        }
        System.out.println("===========================");
    }

}
