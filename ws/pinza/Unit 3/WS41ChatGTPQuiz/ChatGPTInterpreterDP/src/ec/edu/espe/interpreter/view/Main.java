/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.interpreter.view;

import ec.edu.espe.interpreter.model.Interpreter;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Main {
  public static void main(String[] args) {
    Interpreter interpreter = new Interpreter();
    String expression = "1 + 2 - 3 + 4";
    int result = interpreter.interpret(expression);
    System.out.println(expression + " = " + result);
  }
}
