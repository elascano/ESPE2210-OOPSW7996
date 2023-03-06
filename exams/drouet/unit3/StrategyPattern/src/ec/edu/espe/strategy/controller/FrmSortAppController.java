package ec.edu.espe.strategy.controller;

import ec.edu.espe.strategy.view.FrmSortApp;
import utils.DBManager;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class FrmSortAppController {
    public static DBManager connectMongo(DBManager dBManager) {
        dBManager = new DBManager();
        dBManager.connect("mongodb+srv://oop22:oop22@cluster0.cd2tjad.mongodb.net/test", "strategyDrouet");
        return dBManager;
    }
    
    public static void sortArray(FrmSortApp frmSortApp) {
        String arrayString;
        SortingContext sortingContext;
        StrategyArray strategyArray;
        
        int[] unsorted;
        int[] sorted;
        String algorithm;
        
        sortingContext = new SortingContext();
        
        arrayString = frmSortApp.getTxtArray().getText();
        unsorted = getArray(arrayString);
        sorted = unsorted.clone();
        
        algorithm = sortingContext.sort(sorted);
        
        strategyArray = new StrategyArray(unsorted, unsorted.length, algorithm, sorted);
        
        frmSortApp.getdBManager().createDocument("arrayStephen", strategyArray.toGson());
    }
    
    public static int[] getArray(String numbers) {
        String[] Array = numbers.split(",");
        int[] newArray = new int[Array.length];
        for (int i = 0; i < Array.length; i++) {
            newArray[i] = Integer.parseInt(Array[i]);
        }
        return newArray;
    }
}
