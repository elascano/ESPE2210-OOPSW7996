/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shopinventory_v2.model;

import ec.edu.espe.shopinventory_v2.view.FrmMeat;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class MeatFactory implements ProductFactory {

    @Override
    public void getTypeOfProduct() {
        FrmMeat open = new FrmMeat();
        open.setVisible(true);
    }

}
