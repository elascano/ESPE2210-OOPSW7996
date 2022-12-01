
package trashbin.view;


import java.util.ArrayList;
import java.util.Scanner;
import trashbin.model.TrashBin;
import trashbin.model.TrashBin.java

public class TrashBinSimulator {
    public static void main(String[] args) {
        
        TrashBin trashbin = null;
                
                       
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<Order>();
        
        System.out.println("---------------------------");
        System.out.println("Enter trash bin id");
        int Id = sc.nextInt();
        System.out.println("Enter trash bin material");
        String material = sc.next();
        System.out.println("Enter trash bin color");
        String color = sc.next();
        
        trashbin.setId(Id);
        trashbin.setMaterial(material);
        trashbin.setColor(color);
        
        String json = new Gson().toJson(orders);
        
        
        
        
    }
    
}
