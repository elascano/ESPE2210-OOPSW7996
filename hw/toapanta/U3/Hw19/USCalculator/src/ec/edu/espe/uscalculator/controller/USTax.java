package ec.edu.espe.uscalculator.controller;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class USTax {
    private static USTax instance;
    private USTax(){}; 
    
    public static USTax getInstance() {
        if(instance == null) instance = new USTax();
        return instance;
    }
    public float salesTotal() {
        return 0.0F;
    }
}
