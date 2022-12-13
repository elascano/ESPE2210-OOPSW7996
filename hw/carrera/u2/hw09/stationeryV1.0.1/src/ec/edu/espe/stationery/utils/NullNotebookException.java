package ec.edu.espe.stationery.utils;

import ec.edu.espe.stationery.view.Stationery;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class NullNotebookException extends NullPointerException{

    public NullNotebookException(String message) {
        System.err.println(message);
        Stationery.runMenu();
    }

}
