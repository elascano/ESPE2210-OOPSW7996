/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chatgtp.model;

import java.util.Map;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }
    
    
    @Override
    public int interpret(Map<String, Expression> variables) {
        return number;
    }

}
