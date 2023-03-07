package ec.edu.espe.AirporTaxiScheduling.controller;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class AccountingController {

   public static float calculateLostPercent(float payedValues, float outsValues) {
        float lostPercent;
        lostPercent = (outsValues / (payedValues + outsValues)) * 100;
        lostPercent = (float) Math.round(lostPercent * 100F) / 100F;
        return lostPercent;

    }

    public static float calculateTotal(ArrayList<Float> values) {

        float total = 0;
        for (int i = 0; i < values.size(); i++) {
            total += values.get(i);
        }
            
        return total;

    }

}
