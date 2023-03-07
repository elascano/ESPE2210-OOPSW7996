package ec.edu.espe.ehamanagement.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.model.Material;
import ec.edu.espe.mongodbmanager.MongoDbManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import javax.swing.JPanel;
import utils.DictionaryConversor;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class MaterialsOrganizer extends Subject{
    private static boolean state;

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    
    public static ArrayList getFieldsToInsert(){
        ArrayList fields = new ArrayList();
        fields.add("id");
        fields.add("name");
        fields.add("generalQuantity");
        fields.add("generalCost");
         fields.add("unitCost");
        return fields;   
    }
    public static ArrayList getValuesToInsert(Material material){
        ArrayList values = new ArrayList(5);
        values.add(material.getId());
        values.add(material.getName());
        values.add(material.getGeneralQuantity());
        values.add(material.getGeneralCost());
        values.add(material.getUnitCost());
        return values;
    }
    
    private static int assignIdToMaterial(MongoCollection materialsCollection){
        ArrayList MaterialsIds = MongoDbManager.getFieldValues(materialsCollection, "id");
        if(!MaterialsIds.isEmpty()){
            int lastId = Integer.parseInt(String.valueOf(Collections.max(MaterialsIds)));
            int newId = lastId + 1;
            return newId;
        }else{
            return 1;
        }
    }
    
    public static ArrayList <Object> getAll(MongoCollection materialsCollection, String field){
        ArrayList <Object> values;
        values = MongoDbManager.getFieldValues(materialsCollection, field);
        return values;
    }
    public static boolean insertMaterial(MongoCollection materialsCollectoin, Material material){
        int newId = assignIdToMaterial(materialsCollectoin);
        material.setId(newId);
        ArrayList fields = getFieldsToInsert();
        ArrayList values = getValuesToInsert(material);
        HashMap orderToInsert = DictionaryConversor.convertToDictionary(fields, values);
        MongoDbManager.insertDocument(materialsCollectoin, orderToInsert);
        return true;
    }
    
    public static boolean deleteMaterial(MongoCollection materialsCollection, int id){
        return MongoDbManager.deleteDocument(materialsCollection,"id", id);
    }
    
    public static Object getValueFromMaterial(MongoCollection materialsCollection,String field,  Object value, String fieldToFind){
        Object foundValue;
        foundValue = MongoDbManager.getDocumentValue(materialsCollection, field,value, fieldToFind);
        return foundValue;
    }
    
    
    public static boolean updateMaterial(MongoCollection materialsCollection, Material material, JPanel frame){
        int id = material.getId();
        MongoDbManager.updateDocument(materialsCollection,"id", id, "name", material.getName());
        MongoDbManager.updateDocument(materialsCollection,"id", id, "generalQuantity", material.getGeneralQuantity());
        MongoDbManager.updateDocument(materialsCollection,"id", id, "generalCost", material.getGeneralCost());
        MongoDbManager.updateDocument(materialsCollection, "id",id, "unitCost", material.getUnitCost());
        state = true;
        Subject.notifyObservers(frame);
        state = false;
        return true;
    }

    public static  boolean findMaterialExistence(MongoCollection materialsCollection, String field, Object value){
        return MongoDbManager.existsDocument(materialsCollection, field, value);
    }
    
    public static ArrayList <Material> readMaterialsOrganizer( MongoCollection materialsCollection){
        ArrayList <Object> ids = getAll (materialsCollection, "id");
        Material readedMaterial;
        ArrayList <Material> readedMaterials = new ArrayList();
        for (Object readedId: ids){
            int id = Integer.parseInt(String.valueOf(readedId));
            String name = String.valueOf(getValueFromMaterial(materialsCollection, "id", id, "name"));
            double generalQuantity = Double.valueOf(String.valueOf(getValueFromMaterial(materialsCollection, "id", id, "generalQuantity")));
            Float generalCost =  (float)((double)getValueFromMaterial(materialsCollection, "id", id, "generalCost"));
            Float unitCost = (float)((double)getValueFromMaterial(materialsCollection, "id", id, "unitCost"));
            readedMaterial = new Material(id, name, (int)generalQuantity, generalCost, unitCost); 
            readedMaterials.add(readedMaterial);
        }
        return readedMaterials;
    }
}
