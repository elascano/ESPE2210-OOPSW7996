/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fashionStore.controller;

import ec.edu.espe.fashionstore.model.Measurement;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class ControllerMeasurement {

    public static float calculateProductionCost(Measurement measurement) {
        float productionCost = 0.0F;
        float neck = (float) measurement.getNeckMeasurement();
        float chest = (float) measurement.getChestMeasurement();
        float shoulder = (float) measurement.getShoulderMeasurement();
        float arm = (float) measurement.getArmMeasurement();
        float hip = (float) measurement.getHipMeasurement();
        float waist = (float) measurement.getWaistMeasurement();
        float leg = (float) measurement.getLegMeasurement();
        productionCost = (neck + chest + shoulder + arm + hip + waist + leg) * 0.285F;
        return productionCost;
    }

}
