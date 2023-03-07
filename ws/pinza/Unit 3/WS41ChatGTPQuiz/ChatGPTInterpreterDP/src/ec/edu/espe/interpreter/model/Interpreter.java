/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.interpreter.model;

import java.util.Stack;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Interpreter {

    private Stack<Expression> expressionStack = new Stack<>();

    public int interpret(String expression) {
        String[] elements = expression.split(" ");

        for (String element : elements) {
            if (element.equals("+")) {
                Expression rightExpression = expressionStack.pop();
                Expression leftExpression = expressionStack.pop();
                Expression addExpression = new AddExpression(leftExpression, rightExpression);
                expressionStack.push(addExpression);
            } else if (element.equals("-")) {
                Expression rightExpression = expressionStack.pop();
                Expression leftExpression = expressionStack.pop();
                Expression subtractExpression = new SubstractExpression(leftExpression, rightExpression);
                expressionStack.push(subtractExpression);
            } else {
                Expression numberExpression = new NumberExpression(Integer.parseInt(element));
                expressionStack.push(numberExpression);
            }
        }

        return expressionStack.pop().interpret();
    }

}
