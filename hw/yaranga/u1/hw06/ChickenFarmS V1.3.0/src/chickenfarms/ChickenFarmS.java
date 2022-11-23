package chickenfarms;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.ArrayList;
import java.util.Scanner;

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
        
        int position[]= new int [1];
        position[0]=0;
         System.out.println("position -->"+position[0]);
        position[0]++;
        System.out.println("position -->"+position[0]);
        
        
        /*ArrayList<Chicken> chickens = new ArrayList<Chicken>();
        Chicken chicken = new Chicken();
        Scanner input = new Scanner(System.in);
        int position[] = new int[1];
        boolean exit = false;
        int option;
        position[0] = 0;
        readFile(chickens,position);*/
        
    }
/*private static void readFile(ArrayList<Chicken> chickens, int position[]) {
        String json = ""; 
        Gson gson = new Gson();
        Chicken chicken = new Chicken();
        try {
           BufferedReader reader = new BufferedReader(new FileReader("chickenlist.json"));
           String line = "";
        while ((line = reader.readLine())!= null){
            json += line;
            chicken= gson.fromJson(json ,Chicken.class);
            chickens.add(position[0], chicken);
            position[0]++;
        }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
    }*/
}
 
