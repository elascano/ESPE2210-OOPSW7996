
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.calculator.controller.BasicOperation;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class DataFormat {

    float value1;
    float value2;
    float ExpResult;

    public DataFormat() {
    }

 
    public float getExpResult() {
        return ExpResult;
    }

    public void setExpResult(float ExpResult) {
        this.ExpResult = ExpResult;
    }

    public float getValue1() {
        return value1;
    }

    public void setValue1(float valu1) {
        this.value1 = valu1;
    }

    public float getValue2() {
        return value2;
    }

    public void setValue2(float value2) {
        this.value2 = value2;
    }

    public void testDivide() {
        System.out.println("divide");
        BasicOperation instance = new BasicOperation();
        float dividend;
        float divisor;
        float expResult;
        float result;
        ArrayList<DataFormat> data = new ArrayList<>();
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("DivisionTestCases.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<DataFormat>> type = new TypeToken<ArrayList<DataFormat>>() {
                };
                data = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("* THE FILE DOESN'T EXIST, IT WILL BE CREATED *");
        } catch (IOException ex) {
            System.out.println("* THE FILE CAN'T BE READED *");
        }

        for (DataFormat dataFormat : data) {
            dividend = dataFormat.getValue1();
            divisor = dataFormat.getValue2();
            expResult = dataFormat.getExpResult();
            result = instance.divide(dividend, divisor);
            assertEquals(expResult, result, 0);
        }
    }

}
