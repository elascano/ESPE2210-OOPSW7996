package ec.edu.espe.Exam2.controller;

import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public abstract class DataPersistance {
    public abstract void insert(String collectionName, String json);
    public abstract ArrayList read(String collectionName);
    
    
    public static String toJson(Object object) {
        Gson gson = new Gson();
        String json;
        json = gson.toJson(object);

        return json;
    }
}
