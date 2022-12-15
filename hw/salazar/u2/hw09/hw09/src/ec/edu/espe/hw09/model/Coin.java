/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.hw09.model;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class Coin {
    private int id;
    private String currency;
    private float value;

    @Override
    public String toString() {
        return "Coin{" + "id=" + id + ", currency=" + currency + ", value=" + value + '}';
    }

    public Coin(int id, String currency, float value) {
        this.id = id;
        this.currency = currency;
        this.value = value;
    }
    
    public Coin() {
        id = 0;
        currency = "";
        value = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
}
