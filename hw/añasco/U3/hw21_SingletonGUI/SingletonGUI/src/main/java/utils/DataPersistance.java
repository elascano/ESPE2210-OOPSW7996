package utils;

import java.util.ArrayList;
import org.bson.Document;

/*
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public abstract class DataPersistance {
    public abstract void insert(String collectionName, String json);
    public abstract ArrayList read(String collectionName);
    public abstract Document find(String collectionName,String keyName,String fieldValue);
    public abstract boolean update(String collectionName, String fieldNameToSearch, String valueToSearch,
        String fieldNameToUpdate, String valueToUpdate);
}