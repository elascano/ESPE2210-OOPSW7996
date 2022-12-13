
package ec.edu.espe.stadium.view;

import static ec.edu.espe.stadium.controller.FileManager.loadData;
import ec.edu.espe.stadium.model.StadiumInfo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static ec.edu.espe.stadium.controller.FileManager.enterStadium;
import static ec.edu.espe.stadium.controller.FileManager.modifyStadium;
import static ec.edu.espe.stadium.controller.FileManager.searchStadiumInfo;
import static ec.edu.espe.stadium.controller.FileManager.removeStadium;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class StadiumProgram {

    public static void main(String[] args) throws IOException {
        System.out.println("===============================");
        System.out.println("       STADIUM PROGRAM      ");
        System.out.println("===============================");
        ArrayList<StadiumInfo> stadium = new ArrayList<StadiumInfo>();

        StadiumInfo stadiumInfo = new StadiumInfo();
        File file = new File("StadiumInfo.json");
        if (file.length() != 0L) { 
            stadium = loadData(); 
        }
        System.out.println("File Size = "+ stadium.size());
        Scanner input = new Scanner(System.in);

        boolean repeat = true;
        int option;

        while (repeat == true) {

            System.out.println("==========Menu=========");
            System.out.println("1.Stadium ingress");
            System.out.println("2.Modify Stadium info");
            System.out.println("3.Find Stadium");
            System.out.println("4.Delete Stadium");
            System.out.println("5.Close");

            System.out.println("Ingress the number option:");
            option = input.nextInt();

            switch (option) {
                case 1:
                    enterStadium(stadium, stadiumInfo);
                    System.out.println("");
                    break;
                case 2:
                    modifyStadium(stadium);
                    break;
                case 3: 
                    searchStadiumInfo(stadium,input);
                    break;
                case 4:
                    removeStadium(stadium,input);
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
