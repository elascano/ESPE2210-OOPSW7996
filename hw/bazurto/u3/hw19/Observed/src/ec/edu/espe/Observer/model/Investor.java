/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Observer.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Investor implements IInvestor {
private String name;
private String observerState;
private Stock stock;

    public Investor(String name, String observerState, Stock stock) {
        this.name = name;
        this.observerState = observerState;
        this.stock = stock;
    }

public Investor(String name ) {
this.name = name;
}
public void update(Stock stock, Object args) {
System.out.println("Notified observer " + name);
if (args instanceof String) {
System.out.println("The symbol of " + stock.getSymbol() + " changed to: " + args);
}
else if (args instanceof Double) {
System.out.println("The price of " + stock.getSymbol() + " changed to: " + args);
}
}
}