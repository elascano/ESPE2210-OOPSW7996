package ec.edu.espe.restaurant.controller;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class ServiceController extends CrudMongoDBController implements ServiceInterface,CrudMongoDBInterface{

    public ServiceController(String mongoCollection) {
        super(mongoCollection);
    } 
    
    
    @Override
    public Boolean validateHour(String hour){
        boolean hourOfTreatment;
        char[] a = hour.toString().toCharArray();
        String[] c = hour.split(":");
        if ((a[0] == ' ') ||  (a[1] == ' ') || (a[2] == ' ')
                || (a[3] == ' ') || (a[4] == ' ')
                || (obtainInteger(c[0]) > 24) || (obtainInteger(c[1]) > 59)){
            hourOfTreatment = false;
        }else {
            hourOfTreatment = true;
        }
        return hourOfTreatment;
    }
   
    @Override
    public int obtainInteger(String value) {
        int integer = Integer.parseInt(value);
        return integer;
    }

   
}

