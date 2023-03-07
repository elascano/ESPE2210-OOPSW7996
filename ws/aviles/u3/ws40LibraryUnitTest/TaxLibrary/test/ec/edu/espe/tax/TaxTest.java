/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.tax;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class TaxTest {
    
    public TaxTest() {
    }

 
    
    
    /**
     * Test of computeGreenTax method, of class Tax.
     */
    @Test
    public void testComputeGreenTax() throws FileNotFoundException, IOException {
        
//        Workbook book = new XSSFWorkbook();
//        Sheet sheet = book.createSheet("Test Cases");
//        Row row = sheet.createRow(0);
//        row.createCell(0).setCellValue("test Cases");
//        FileOutputStream fileout = new FileOutputStream("TestCases.xlsx");
//        book.write(fileout);
//        fileout.close();
        
        FileInputStream file = new FileInputStream(new File("TestCases.xlsx"));
        XSSFWorkbook book = new XSSFWorkbook(file);
        XSSFSheet sheet = book.getSheetAt(0);
        int rowNumber = sheet.getLastRowNum();
        for(int actualRow=2; actualRow<=rowNumber;actualRow++){
            Row row = sheet.getRow(actualRow);
            System.out.println("computeGreenTax");
            
            Cell cylinderCapacityCell = row.getCell(0);
            Cell yearCell = row.getCell(1);
            Cell expResultCell = row.getCell(2);
            
            if(cylinderCapacityCell==null||yearCell==null||expResultCell==null){
                if (cylinderCapacityCell == null && yearCell == null&&expResultCell==null) {
                } else {
                    row.createCell(3).setCellValue("No Value");
                    row.createCell(4).setCellValue("No Value");
                }
            }
            else if(cylinderCapacityCell.getCellTypeEnum().toString()=="STRING"||yearCell.getCellTypeEnum().toString()=="STRING"||expResultCell.getCellTypeEnum().toString()=="STRING"){
                row.createCell(3).setCellValue("Wrong Value");
                row.createCell(4).setCellValue("Wrong Value");
            }
            else if(yearCell.getNumericCellValue()!=(int) yearCell.getNumericCellValue()){
                row.createCell(3).setCellValue("Wrong Value");
                row.createCell(4).setCellValue("Wrong Value");
            }
            else{
                float cylinderCapacity = (float) cylinderCapacityCell.getNumericCellValue();
                int year = (int) yearCell.getNumericCellValue();
                System.out.println(year);
                float expResult = (float) expResultCell.getNumericCellValue();

                float result = Tax.computeGreenTax(cylinderCapacity, year);
                if(result==expResult){
                    row.createCell(3).setCellValue(result);
                    row.createCell(4).setCellValue("OK");
                }
                else{
                    row.createCell(3).setCellValue(result);
                    row.createCell(4).setCellValue("Fail");
                }
//                assertEquals(expResult, result, 0);
            }
            
            
        }
        
        FileOutputStream fileout = new FileOutputStream("TestCases.xlsx");
        book.write(fileout);
        fileout.close();
        
    }

    /**
     * Test of computeRentTax method, of class Tax.
     */
    @Test
    public void testComputeRentTax() throws FileNotFoundException, IOException {
        
        FileInputStream file = new FileInputStream(new File("TestCases.xlsx"));
        XSSFWorkbook book = new XSSFWorkbook(file);
        XSSFSheet sheet = book.getSheetAt(0);
        int rowNumber = sheet.getLastRowNum();
        for(int actualRow=2; actualRow<=rowNumber;actualRow++){
            Row row = sheet.getRow(actualRow);
            System.out.println("computeRentTax");
        
            
            Cell monthlySalaryCell = row.getCell(6);
            Cell expResultCell = row.getCell(7);
            
            if(monthlySalaryCell==null||expResultCell==null){
                if (monthlySalaryCell == null && expResultCell == null) {
                } else {
                    row.createCell(8).setCellValue("No Value");
                    row.createCell(9).setCellValue("No Value");
                }
            }
            else if(monthlySalaryCell.getCellTypeEnum().toString()=="STRING"||expResultCell.getCellTypeEnum().toString()=="STRING"){
                row.createCell(8).setCellValue("Wrong Value");
                row.createCell(9).setCellValue("Wrong Value");
            }
            else{
                float monthlySalary = (float) monthlySalaryCell.getNumericCellValue();
                float expResult = (float) expResultCell.getNumericCellValue();
                float result = Tax.computeRentTax(monthlySalary);
                if(result==expResult){
                    row.createCell(8).setCellValue(result);
                    row.createCell(9).setCellValue("OK");
                }
                else{
                    row.createCell(8).setCellValue(result);
                    row.createCell(9).setCellValue("Fail");
                }
//                assertEquals(expResult, result, 0);
            }
            
            
        }
        
        FileOutputStream fileout = new FileOutputStream("TestCases.xlsx");
        book.write(fileout);
        fileout.close();
//        
//        System.out.println("computeRentTax");
//        float price = 1563.32F;
//        float expResult = 604.98F;
//        float result = Tax.computeRentTax(price);
//        assertEquals(expResult, result, 0);
    }

    /**
     * Test of computePriceWhitIva method, of class Tax.
     */
    @Test
    public void testComputePriceWithIva() throws FileNotFoundException, IOException {
        FileInputStream file = new FileInputStream(new File("TestCases.xlsx"));
        XSSFWorkbook book = new XSSFWorkbook(file);
        XSSFSheet sheet = book.getSheetAt(0);
        int rowNumber = sheet.getLastRowNum();
        for(int actualRow=2; actualRow<=rowNumber;actualRow++){
            Row row = sheet.getRow(actualRow);
            System.out.println("computePriceWhitIva");
        
            
            Cell priceCell = row.getCell(11);
            Cell expResultCell = row.getCell(12);
            
            
            if(priceCell==null||expResultCell==null){
                if(priceCell==null&&expResultCell==null){
                }
                else{
                    row.createCell(13).setCellValue("No Value");
                    row.createCell(14).setCellValue("No Value"); 
                }
            }
            else if(priceCell.getCellTypeEnum().toString()=="STRING"||expResultCell.getCellTypeEnum().toString()=="STRING"){
                row.createCell(13).setCellValue("Wrong Value");
                row.createCell(14).setCellValue("Wrong Value");
            }
            else{
                float price = (float) priceCell.getNumericCellValue();
                float expResult = (float) expResultCell.getNumericCellValue();
                float result = Tax.computePriceWithIva(price);
                
                if(result==expResult){
                    row.createCell(13).setCellValue(result);
                    row.createCell(14).setCellValue("OK");
                }
                else{
                    row.createCell(13).setCellValue(result);
                    row.createCell(14).setCellValue("Fail");
                }
                //assertEquals(expResult, result, 0);
//                assertEquals(expResult, result, 0);
            }
            
            
        }
        
        FileOutputStream fileout = new FileOutputStream("TestCases.xlsx");
        book.write(fileout);
        fileout.close();
        
//        float price = 123.33F;
//        float expResult = 138.13F;
//        float result = Tax.computePriceWithIva(price);
//        assertEquals(expResult, result, 0);
    }
    
}
