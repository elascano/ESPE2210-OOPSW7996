/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.keyboardStore.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Keyboard {

    private int id;
    private String tradeMark;
    private String keyboardType;
    private float price;

    public Keyboard(int id, String tradeMark, String keyboardType, float price) {
        this.id = id;
        this.tradeMark = tradeMark;
        this.keyboardType = keyboardType;
        this.price = price;
    }

    public Keyboard() {
        this.id = 0;
        this.tradeMark = "";
        this.keyboardType = "";
        this.price = 0;
    }

    @Override
    public String toString() {
        return "Keyboard{" + "id=" + id + ", tradeMark=" + tradeMark + ", keyboardType=" + keyboardType + ", price=" + price + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tradeMark
     */
    public String getTradeMark() {
        return tradeMark;
    }

    /**
     * @param tradeMark the tradeMark to set
     */
    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    /**
     * @return the keyboardType
     */
    public String getKeyboardType() {
        return keyboardType;
    }

    /**
     * @param keyboardType the keyboardType to set
     */
    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

}
