package ec.edu.espe.urbanizationtreasury.controller;

import ec.edu.espe.urbanizationtreasury.model.Resident;
import ec.edu.espe.urbanizationtreasury.utils.IdValidationException;
import org.bson.Document;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class ResidentController {
    
    public static void validateTheId(String id) throws IdValidationException {
        int number = 0, suma = 0, resultado = 0;

        for (int i = 0; i < id.length(); i++) {
            number = Integer.parseInt(String.valueOf(id.charAt(i)));
            if (i % 2 == 0) {
                number = number * 2;
                if (number > 9) {
                    number = number - 9;
                }
            }
            suma = suma + number;
        }
        if (suma % 10 != 0) {
            resultado = 10 - (suma % 10);
            if (resultado != number) {
                throw new IdValidationException("Invalid DNI");
            }
        } 
    }
    
    public static Document toDocument(Resident resident){
        Document documentOfResident = new Document();
        long id;
        int batch;
        String name;
        id = resident.getId();
        batch = resident.getBatch();
        name = resident.getName();
        
        documentOfResident.append("id", id)
                .append("name", name)
                .append("batch", batch);
        
        return documentOfResident;
        
    }
    
}
