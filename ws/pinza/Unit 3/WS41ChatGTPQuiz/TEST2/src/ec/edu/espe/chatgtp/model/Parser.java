/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chatgtp.model;

import java.util.Stack;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
class Parser {

    private Stack<Expression> expressionStack = new Stack<Expression>();

    public int parse(String s) {
        char[] chars = s.toCharArray();

        Expression left;
        Expression right;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = expressionStack.pop();
                    right = new NumberExpression(Character.getNumericValue(chars[++i]));
                    expressionStack.push(new PlusExpression(left, right));
                    break;
                case '-':
                    left = expressionStack.pop();
                    right = new NumberExpression(Character.getNumericValue(chars[++i]));
                    expressionStack.push(new MinusExpression(left, right));
                    break;
                default:
                    expressionStack.push(new NumberExpression(Character.getNumericValue(chars[i])));
                    break;
            }
        }

        return expressionStack.pop().interpret(null);
    }

}
