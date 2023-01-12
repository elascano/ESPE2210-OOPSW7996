/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Generator {
    
    public static int generateId() {
        int id;
        id = (int) ((Math.random() * (9999 - 1000)) + 1000);
        return id;
    } 
    
}
