package ec.edu.espe.sortapp.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.sortapp.view.FrmSortApp;
import java.util.ArrayList;
import java.util.Arrays;
import utils.DictionaryConversor;
import utils.MongoDbManager;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class FrmSortAppController {
    public static void concatenateNumber(FrmSortApp sortFrame, String number){
        String newNumber;
        newNumber = sortFrame.getLblCurrentNumber().getText() + number;
        sortFrame.getLblCurrentNumber().setText(newNumber);
    }
    
    public static void addNumberToList(FrmSortApp sortFrame){
        int numberToAdd;
        numberToAdd = Integer.parseInt(sortFrame.getLblCurrentNumber().getText());
         
        sortFrame.getNumbersToSort() = Arrays.copyOf(sortFrame.getNumbersToSort(), sortFrame.getArrayLength());
        sortFrame.getNumbersToSort()[sortFrame.getArrayLength()-1] = numberToAdd;
        sortFrame.getArrayLength() += 1;
        
        sortFrame.getTxtAList().append("\n" + numberToAdd);
    }
    
    public static void deleteNumberFromList(FrmSortApp sortFrame){
        String numbersList = sortFrame.getTxtAList().getText(); 
        int lastLinesStart = numbersList.lastIndexOf("\n"); 
        if (lastLinesStart >= 0) { 
            int lastLineEnd = numbersList.length(); 
            sortFrame.getTxtAList().replaceRange("", lastLinesStart, lastLineEnd); 
        }
        
        sortFrame.getNumbersToSort() = Arrays.copyOfRange(sortFrame.getNumbersToSort(), 0, sortFrame.getArrayLength() - 1);
    }
    
    public static void sortList(FrmSortApp sortFrame){
        sortFrame.getTxtANotSortedList().setText(Arrays.toString(sortFrame.getNumbersToSort()).replace("[", "").replace("]", ""));
        
        SortingContext sortingContext = new SortingContext();
        int sortedList[] = sortingContext.sort(sortFrame.getNumbersToSort());
        insertInMongoDb(sortFrame, sortedList);
        sortFrame.getTxtASortedList().setText(Arrays.toString(sortedList).replace("[", "").replace("]", ""));
    }
    
    public static void insertInMongoDb(FrmSortApp sortFrame, int[] sortedList){
        ArrayList<String> keys = new ArrayList();
        ArrayList values = new ArrayList();
        
        keys.add("unsorted list");
        keys.add("size");
        keys.add("algorithm");
        keys.add("sorted list");
        
        values.add(sortFrame.getNumbersToSort());
        values.add(sortedList.length);
        values.add(changeTypeLabel(sortFrame));
        values.add(sortedList);
        MongoCollection collection = MongoConnection.getInstance().getCollection("arrayNahir");

        MongoDbManager.insertDocument(collection, DictionaryConversor.convertToDictionary(keys, values));
    }
            
    public static void restartList(FrmSortApp sortFrame){
        sortFrame.getArrayLength() = 1;
        sortFrame.getNumbersToSort() = new int[sortFrame.getArrayLength()];
        sortFrame.getBtnDelete().setEnabled(false);
        sortFrame.getBtnSort().setEnabled(false);
        sortFrame.getTxtAList().setText("");
    }
    
    public static String changeTypeLabel(FrmSortApp sortFrame){
        sortFrame.ArrayLength() -= 1;
        
        if(sortFrame.getArrayLength() >0 && sortFrame.getArrayLength()<=3){
            sortFrame.getLblSortType().setText("Bubble Sort: " + sortFrame.getArrayLength() + " elements");
            return "Bubble Sort";
        }
        
        if(sortFrame.getArrayLength() >= 4 && sortFrame.getArrayLength()<=7){
            sortFrame.getLblSortType().setText("Insertion Sort: "+ sortFrame.getArrayLength() + " elements");
            return "Insertion Sort";
        }
        
        if (sortFrame.getArrayLength() >7){
            sortFrame.getLblSortType().setText("Quick Sort: "+ sortFrame.getArrayLength()+ " elements");
            return "Quick Sort";
        }
    }
    public static void changeButtonsStatus(FrmSortApp sortFrame){
        if(sortFrame.getArrayLength() == 1){
            sortFrame.getBtnDelete().setEnabled(false);
            sortFrame.getBtnSort().setEnabled(false);
        }else{
            sortFrame.getBtnDelete().setEnabled(true);
            sortFrame.getBtnSort().setEnabled(true);
        }
    }
         
}
