
package ec.edu.espe.catsAdministrator.view;

import static ec.edu.espe.catsAdministrator.controller.FileManager.loadData;
import ec.edu.espe.catsAdministrator.model.CatsInfo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static ec.edu.espe.catsAdministrator.controller.FileManager.enterStadium;
import static ec.edu.espe.catsAdministrator.controller.FileManager.modifyCat;
import static ec.edu.espe.catsAdministrator.controller.FileManager.searchCatInfo;
import static ec.edu.espe.catsAdministrator.controller.FileManager.removeCat;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class CatAdministratorProgram {

    public static void main(String[] args) throws IOException {
        System.out.println("======================================");
        System.out.println("       CAT ADMINISTRATOR PROGRAM      ");
        System.out.println("======================================");
        ArrayList<CatsInfo> cat = new ArrayList<CatsInfo>();

        CatsInfo catInfo = new CatsInfo();
        File file = new File("CatInfo.json");
        if (file.length() != 0L) { 
            cat = loadData(); 
        }
        System.out.println("File Size = "+ cat.size());
        Scanner input = new Scanner(System.in);

        boolean repeat = true;
        int option;

        while (repeat == true) {

            System.out.println("==========Menu=========");
            System.out.println("1.Cat ingress");
            System.out.println("2.Modify Cat info");
            System.out.println("3.Find Cat");
            System.out.println("4.Delete Cat");
            System.out.println("5.Close");

            System.out.println("Ingress the number option:");
            option = input.nextInt();

            switch (option) {
                case 1:
                    enterStadium(cat, catInfo);
                    System.out.println("");
                    break;
                case 2:
                    modifyCat(cat);
                    break;
                case 3: 
                    searchCatInfo(cat,input);
                    break;
                case 4:
                    removeCat(cat,input);
                    break;
                case 5:
                    repeat = false;
                    break;
                default:
                    System.out.println("Option don't exist");
                    break;
            }

        }
    
    }
    
}
