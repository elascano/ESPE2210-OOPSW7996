package ec.edu.espe.Singleton.model;

public class USTax {
    private static USTax instance;
    
    private USTax() {}
    
    public static USTax getInstance() {
        if(instance == null) {
            instance = new USTax();
        }
        return instance;
    }
     public float salesTotal() {
         System.out.println("caballo");
        return 0;
    }
}
