package ec.edu.espe.view;

import ec.edu.espe.model.PairOfShoes;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class Exams {

    public static void main(String[] args) {
        ArrayList<PairOfShoes> shoeShopping = new ArrayList<>();

        menu();
        InsetData(shoeShopping);

    }

    public static void InsetData(ArrayList<PairOfShoes> shoeShopping) {
        PairOfShoes producto = new PairOfShoes();

        shoeShopping.add(producto);
        System.out.println("producto = " + producto);

    }

    public static void menu() {
        String pairofshoes;
        String brand;
        int price;
        Scanner console = new Scanner(System.in);
        System.out.println("want shoes:");
        pairofshoes = console.nextLine();
        System.out.println("shoes brand:");
        brand = console.nextLine();
        System.out.println("price of shoes:");
        price = Integer.parseInt(console.nextLine());
    }
}
