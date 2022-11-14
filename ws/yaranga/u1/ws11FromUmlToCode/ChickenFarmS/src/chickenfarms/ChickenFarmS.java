package chickenfarms;

/**
 *
 * @author Leonardo Yaranga, Progress Team, DCCO-ESPE
 */
public class ChickenFarmS {
    
   // int main(int argc, char *arg[]){
    //for i<argc
    
    //printf(argv[i] \n)
   //     return 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Leonardo Yaranga ");
        System.out.println("-This is my first time using netbeans-");
        System.out.println("And it is easy");
        System.out.println("If you made an effort, that's on your conscience.");
        
        System.out.println("===================");
        if (args.length == 0){
            System.out.println("There are no arguments");
        }else{
        for (int i = 0; i < args.length; i++) {
            System.out.println(("arg["+i+"]")+args[i]);
        }
        }
        System.out.println("===================");
    }

}
 
