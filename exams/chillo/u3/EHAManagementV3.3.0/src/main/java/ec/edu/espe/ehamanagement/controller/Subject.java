package ec.edu.espe.ehamanagement.controller;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public abstract class Subject {
    private static ArrayList<Observer> observers = new ArrayList<>();
    
    public static void notifyObservers(JPanel frame) {
        for (Observer observer : observers) {
            observer.update(frame); 
        }
    }
    
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }  
}
