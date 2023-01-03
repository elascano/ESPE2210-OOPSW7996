package ec.edu.espe.MongoDBCRUD.view;
import ec.edu.espe.MongoDBCRUD.controller.CRUDMongoDB;
import java.util.*;
/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class MongoDBCRUD {
        
    public static void main(String[] args) {
        int option;
        boolean exitMenu = false;
        Scanner sc = new Scanner(System.in);
        
        try {
            while(!exitMenu){
                System.out.println("\n1. Insert new Soccer player");
                System.out.println("2. Find a Soccer player");
                System.out.println("3. Modify a Soccer player");
                System.out.println("4. Delete a Soccer player");
                System.out.println("5. Exit");
                option = sc.nextInt();
                
                switch(option)
                {
                    case 1:
                        CRUDMongoDB.insertSoccerPlayer();
                        break;
                    case 2:
                        CRUDMongoDB.findSoccerPlayer();
                        break;
                    case 3:
                        CRUDMongoDB.updateSoccerPlayer();
                        break;
                    case 4:
                        CRUDMongoDB.deleteSoccerPlayer();
                        break;
                    case 5:
                        exitMenu = true;
                        break;
                    default:
                        System.out.println("Please enter values from 1 to 5");
                        option = sc.nextInt();
                }
            }
        } catch (Exception e) {
            System.out.println("Incorrect Value");
        }
        
    }
}
