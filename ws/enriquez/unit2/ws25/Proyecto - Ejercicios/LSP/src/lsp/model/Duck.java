/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsp.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Duck extends FlyingBird {

    @Override
    void fly() {
        System.out.println("Flying");
    }

    void eat() {
        System.out.println("Eating");
    }
}
