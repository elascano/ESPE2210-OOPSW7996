/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chatgtp.model;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        int result = parser.parse("10+3+4+5-7");
        System.out.println("Result: " + result);
    }

}
