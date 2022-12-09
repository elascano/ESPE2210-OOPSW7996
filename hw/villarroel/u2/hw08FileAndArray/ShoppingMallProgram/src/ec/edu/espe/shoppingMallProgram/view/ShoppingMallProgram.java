package ec.edu.espe.shoppingMallProgram.view;

import static ec.edu.espe.shoppingMallProgram.controller.FileManager.enterStore;
import static ec.edu.espe.shoppingMallProgram.controller.FileManager.loadData;
import static ec.edu.espe.shoppingMallProgram.controller.FileManager.modifyStore;
import static ec.edu.espe.shoppingMallProgram.controller.FileManager.searchStoreInfo;
import static ec.edu.espe.shoppingMallProgram.controller.FileManager.showStoreList;
import java.util.ArrayList;
import java.util.Scanner;
import ec.edu.espe.shoppingMallProgram.model.StoreInfo;
import java.io.File;
import java.io.IOException;
import static ec.edu.espe.shoppingMallProgram.controller.FileManager.removeStore;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class ShoppingMallProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("===============================");
        System.out.println("    SHOPPING MALL PROGRAM      ");
        System.out.println("===============================");
        ArrayList<StoreInfo> store = new ArrayList<StoreInfo>();

        StoreInfo storeInfo = new StoreInfo();
        File file = new File("Storeinfo.json");
        if (file.length() != 0L) {
            store = loadData();
        }
        System.out.println("File Size = "+ store.size());
        Scanner input = new Scanner(System.in);

        boolean repeat = true;
        int option;

        while (repeat == true) {

            System.out.println("==========Menu=========");
            System.out.println("1.Store ingress");
            System.out.println("2.Modify Store info");
            System.out.println("3.Find Store");
            System.out.println("4.Delete Store");
            System.out.println("5.Show all Store");
            System.out.println("6.Close");

            System.out.println("Ingress the number option:");
            option = input.nextInt();

            switch (option) {
                case 1:
                    enterStore(store, storeInfo);
                    System.out.println("");
                    break;
                case 2:
                    modifyStore(store);
                    break;
                case 3: 
                    searchStoreInfo(store,input);
                    break;
                case 4:
                    removeStore(store,input);
                    break;
                case 5:
                    showStoreList(store);
                    break;
                case 6:
                    repeat = false;
                    break;
            }

        }
    }

}
