package ec.edu.espe.calculator.contoller;

import com.google.gson.Gson;
import ec.edu.espe.calculator.contoller.BasicOperation;
import ec.edu.espe.calculator.model.TestCaseAdd;
import ec.edu.espe.calculator.model.TestCaseDivide;
import ec.edu.espe.calculator.model.TestCaseMultiply;
import ec.edu.espe.calculator.model.TestCaseSubstract;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() throws FileNotFoundException, IOException {
        
        String line;
        Gson gson = new Gson();
        ArrayList<TestCaseAdd> testCases;
        testCases = new ArrayList();
        TestCaseAdd testCase;
//        testCase = new TestCaseAdd();
        BufferedReader fileReader = new BufferedReader(new FileReader("testCasesAdd.json"));

        for (int i = 1; (line = fileReader.readLine()) != null; i++) {
            if (i % 2 == 0) {
                testCase = gson.fromJson(line, TestCaseAdd.class);
                testCases.add(testCase);
            }
        }
        fileReader.close();
        
        for(int i=0;i<testCases.size();i++){
            float addend1=testCases.get(i).getAddend1();
            float addend2=testCases.get(i).getAddend2();
            float expResult=testCases.get(i).getExpResult();
            float result = BasicOperation.add(addend1, addend2);
            if(expResult==result){
                testCases.get(i).setActResult(result);
                testCases.get(i).setPass("OK");
            }
            else{
                testCases.get(i).setActResult(result);
                testCases.get(i).setPass("FAIL");
            }
        }
        String json;
        FileWriter fileWriter = new FileWriter("testCasesAdd.json");
        fileWriter.write("[\n");
        for (int i = 0; i < testCases.size(); i++) {
            float addend1=testCases.get(i).getAddend1();
            float addend2=testCases.get(i).getAddend2();
            float expResult=testCases.get(i).getExpResult();
            float actResult=testCases.get(i).getActResult();
            String pass=testCases.get(i).getPass();
            json = "{\"addend1\":"+addend1+",\"addend2\":"+addend2+",\"expResult\":"+expResult+",\"actResult\":"+actResult+",\"pass\":\""+pass+"\"}";
            if(i!=testCases.size()-1){
                json = json + "\n,\n";
            }
            fileWriter.write(json);
        }
        fileWriter.write("\n]");
        fileWriter.close();
    }
    
    
    /**
     * Test of substract method, of class BasicOperation.
     */
    @Test
    public void testSubstract() throws IOException {
        
        String line;
        Gson gson = new Gson();
        ArrayList<TestCaseSubstract> testCases;
        testCases = new ArrayList();
        TestCaseSubstract testCase;
//        testCase = new TestCaseAdd();
        BufferedReader fileReader = new BufferedReader(new FileReader("testCasesSubstract.json"));

        for (int i = 1; (line = fileReader.readLine()) != null; i++) {
            if (i % 2 == 0) {
                testCase = gson.fromJson(line, TestCaseSubstract.class);
                testCases.add(testCase);
            }
        }
        fileReader.close();
        
        for(int i=0;i<testCases.size();i++){
            float minuend=testCases.get(i).getMinuend();
            float substrahend=testCases.get(i).getSubstrahend();
            float expResult=testCases.get(i).getExpResult();
            float result = BasicOperation.substract(minuend, substrahend);
            if(expResult==result){
                testCases.get(i).setActResult(result);
                testCases.get(i).setPass("OK");
            }
            else{
                testCases.get(i).setActResult(result);
                testCases.get(i).setPass("FAIL");
            }
        }
        String json;
        FileWriter fileWriter = new FileWriter("testCasesSubstract.json");
        fileWriter.write("[\n");
        for (int i = 0; i < testCases.size(); i++) {
            float minuend=testCases.get(i).getMinuend();
            float substrahend=testCases.get(i).getSubstrahend();
            float expResult=testCases.get(i).getExpResult();
            float actResult=testCases.get(i).getActResult();
            String pass=testCases.get(i).getPass();
            json = "{\"minuend\":"+minuend+",\"substrahend\":"+substrahend+",\"expResult\":"+expResult+",\"actResult\":"+actResult+",\"pass\":\""+pass+"\"}";
            if(i!=testCases.size()-1){
                json = json + "\n,\n";
            }
            fileWriter.write(json);
        }
        fileWriter.write("\n]");
        fileWriter.close();

    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() throws FileNotFoundException, IOException {
        
        String line;
        Gson gson = new Gson();
        ArrayList<TestCaseMultiply> testCases;
        testCases = new ArrayList();
        TestCaseMultiply testCase;
//        testCase = new TestCaseAdd();
        BufferedReader fileReader = new BufferedReader(new FileReader("testCasesMultiply.json"));

        for (int i = 1; (line = fileReader.readLine()) != null; i++) {
            if (i % 2 == 0) {
                testCase = gson.fromJson(line, TestCaseMultiply.class);
                testCases.add(testCase);
            }
        }
        fileReader.close();
        
        for(int i=0;i<testCases.size();i++){
            float multiplicand=testCases.get(i).getMultiplicand();
            float multioliet=testCases.get(i).getMultioliet();
            float expResult=testCases.get(i).getExpResult();
            float result = BasicOperation.multiply(multiplicand, multioliet);
            if(expResult==result){
                testCases.get(i).setActResult(result);
                testCases.get(i).setPass("OK");
            }
            else{
                testCases.get(i).setActResult(result);
                testCases.get(i).setPass("FAIL");
            }
        }
        String json;
        FileWriter fileWriter = new FileWriter("testCasesMultiply.json");
        fileWriter.write("[\n");
        for (int i = 0; i < testCases.size(); i++) {
            float multiplicand=testCases.get(i).getMultiplicand();
            float multioliet=testCases.get(i).getMultioliet();
            float expResult=testCases.get(i).getExpResult();
            float actResult=testCases.get(i).getActResult();
            String pass=testCases.get(i).getPass();
            json = "{\"multiplicand\":"+multiplicand+",\"multioliet\":"+multioliet+",\"expResult\":"+expResult+",\"actResult\":"+actResult+",\"pass\":\""+pass+"\"}";
            if(i!=testCases.size()-1){
                json = json + "\n,\n";
            }
            fileWriter.write(json);
        }
        fileWriter.write("\n]");
        fileWriter.close();

    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() throws IOException {
        
        String line;
        Gson gson = new Gson();
        ArrayList<TestCaseDivide> testCases;
        testCases = new ArrayList();
        TestCaseDivide testCase;
//        testCase = new TestCaseAdd();
        BufferedReader fileReader = new BufferedReader(new FileReader("testCasesDivide.json"));

        for (int i = 1; (line = fileReader.readLine()) != null; i++) {
            if (i % 2 == 0) {
                testCase = gson.fromJson(line, TestCaseDivide.class);
                testCases.add(testCase);
            }
        }
        fileReader.close();
        
        for(int i=0;i<testCases.size();i++){
            float dividend=testCases.get(i).getDividend();
            float divisor=testCases.get(i).getDivisor();
            float expResult=testCases.get(i).getExpResult();
            float result = BasicOperation.divide(dividend, divisor);
            if(expResult==result){
                testCases.get(i).setActResult(result);
                testCases.get(i).setPass("OK");
            }
            else{
                testCases.get(i).setActResult(result);
                testCases.get(i).setPass("FAIL");
            }
        }
        String json;
        FileWriter fileWriter = new FileWriter("testCasesDivide.json");
        fileWriter.write("[\n");
        for (int i = 0; i < testCases.size(); i++) {
            float dividend=testCases.get(i).getDividend();
            float divisor=testCases.get(i).getDivisor();
            float expResult=testCases.get(i).getExpResult();
            float actResult=testCases.get(i).getActResult();
            String pass=testCases.get(i).getPass();
            json = "{\"dividend\":"+dividend+",\"divisor\":"+divisor+",\"expResult\":"+expResult+",\"actResult\":"+actResult+",\"pass\":\""+pass+"\"}";
            if(i!=testCases.size()-1){
                json = json + "\n,\n";
            }
            fileWriter.write(json);
        }
        fileWriter.write("\n]");
        fileWriter.close();

    }
    
}
