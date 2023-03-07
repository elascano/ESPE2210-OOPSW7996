package utils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class DictionaryConversor {
    public static HashMap<Object, Object> convertToDictionary(ArrayList<Object> keys, ArrayList<Object> values) {
        HashMap<Object, Object> dictionary = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            if (i < values.size()) {
                dictionary.put(keys.get(i), values.get(i));
            } else {
                dictionary.put(keys.get(i), null);
            }
        }
        return dictionary;
    }
    public static ArrayList <Object> convertToArrayList(HashMap map, String type){
        switch(type) {
            case "values":
                ArrayList values = new ArrayList<>(map.values());
                return values;
            case "keys":
                ArrayList keys = new ArrayList<>(map.keySet());
                return keys;
            default:
                return null;
        }
    }
}
