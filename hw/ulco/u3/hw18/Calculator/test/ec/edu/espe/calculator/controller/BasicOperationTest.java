package ec.edu.espe.calculator.controller;

import com.google.gson.Gson;
import ec.edu.espe.calculator.model.Add;
import ec.edu.espe.calculator.model.Divide;
import ec.edu.espe.calculator.model.Multiply;
import ec.edu.espe.calculator.model.Subtract;
import static ec.edu.espe.calculator.controller.JsonManager.addRead;
import static ec.edu.espe.calculator.controller.JsonManager.divideRead;
import static ec.edu.espe.calculator.controller.JsonManager.multiplyRead;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 *
 *
 * @author Sebastian Verdugo, Jefferson Ulco, Justin Villarroel, DCOO-ESPE
 */
public class BasicOperationTest {

    Gson gson = new Gson();

    public BasicOperationTest() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd(){
        System.out.println("add");
        BasicOperation instance = new BasicOperation();
        ArrayList<Add> add = new ArrayList<>();
        add = addRead(add);
        for (Add adds : add) {
            float result = instance.add(adds.getAddent1(), adds.getAddent2());
            assertEquals(adds.getExpectedResult(), result, 0);
        }
    }


    /**
     * Test of subtract method, of class BasicOperation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        BasicOperation instance = new BasicOperation();
        ArrayList<Subtract> subtract = new ArrayList<>();
        subtract = JsonManager.subtractRead(subtract);
        for (Subtract subtracts : subtract) {
            float result = instance.subtract(subtracts.getMinuend(), subtracts.getSubstrahend());
            assertEquals(subtracts.getExpectedResult(), result, 0);
        }

    }

    

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        BasicOperation instance = new BasicOperation();
        ArrayList<Multiply> multiply = new ArrayList<>();
        multiply = multiplyRead(multiply);
        for (Multiply multiplys : multiply) {
            float result = instance.multiply(multiplys.getMultiplicand(), multiplys.getMultiplicator());
            assertEquals(multiplys.getExpectedResult(), result, 0);
        }

    }


    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
       BasicOperation instance = new BasicOperation();
        ArrayList<Divide> divide = new ArrayList<>();
        divide = divideRead(divide);
        for (Divide divides : divide) {
            float result = instance.divide(divides.getDividend(), divides.getDivider());
            assertEquals(divides.getExpectedResult(), result, 0);
        }

    }

}
