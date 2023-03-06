package ec.edu.espe.calculator.view;



import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.Gson;
import ec.edu.espe.calculator.model.TestDataDivision;
import ec.edu.espe.calculator.model.TestDataMultiply;
import ec.edu.espe.calculator.model.TestDataSubtract;
import ec.edu.espe.calculator.model.TestDataSum;
import java.io.FileReader;
/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class CalculatorJUnitTest {
    
    
    @Test
    public void testSumFromJson() throws Exception {
        Gson gson = new Gson();
        TestDataSum testDataSum = gson.fromJson(new FileReader("testDataAdd.json"), TestDataSum.class);
        float addend1 = testDataSum.addend1;
        float addend2 = testDataSum.addend2;
        float expectedSum = testDataSum.expectedSum;
        float result = addend1 + addend2;
        assertEquals(expectedSum, result,0);
    }
    
    @Test
    public void testSubtractFromJson() throws Exception {
        Gson gson = new Gson();
        TestDataSubtract testDataSubtract = gson.fromJson(new FileReader("testDataSubtract.json"), TestDataSubtract.class);
        float minuend = testDataSubtract.minuend;
        float subtrahend = testDataSubtract.subtrahend;
        float difference = testDataSubtract.difference;
        float result = minuend - subtrahend;
        assertEquals(difference, result,0);
    }
    
    @Test
    public void testMultiplyFromJson() throws Exception {
        Gson gson = new Gson();
        TestDataMultiply testDataMultiply = gson.fromJson(new FileReader("testDataMultiply.json"), TestDataMultiply.class);
        float multiplicand = testDataMultiply.multiplicand;
        float multiplicator = testDataMultiply.multiplicator;
        float product = testDataMultiply.product;
        float result = multiplicand * multiplicator;
        assertEquals(product, result,0);
    }
    
    @Test
    public void testDivisionFromJson() throws Exception {
        Gson gson = new Gson();
        TestDataDivision testDataDivision = gson.fromJson(new FileReader("testDataDivision.json"), TestDataDivision.class);
        float dividend = testDataDivision.dividend;
        float divisor = testDataDivision.divisor;
        float quotient = testDataDivision.quotient;
        float result = dividend / divisor;
        assertEquals(quotient, result,0);
    }
}


