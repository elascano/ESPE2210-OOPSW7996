package ec.edu.espe.ehamanagement.controller;

import ec.edu.espe.ehamanagement.model.GeneralReport;
import ec.edu.espe.ehamanagement.model.Order;
import ec.edu.espe.ehamanagement.model.Product;
import ec.edu.espe.ehamanagement.view.FrmPrintGeneralReport;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class FrmPrintGeneralReportController {
    public static void insertReport(FrmPrintGeneralReport reportFrame){
        ArrayList <Integer> ordersIds = new ArrayList();
        ArrayList <Integer> productsIds = new ArrayList();
        for(Order order: reportFrame.getReadedOrders()){
            ordersIds.add(order.getId());
        }
        for (Product product:reportFrame.getReadedProducts()){
            productsIds.add(product.getId());
        }
        
        GeneralReport newReport = new GeneralReport( ordersIds, productsIds);
        newReport.setType("General Report");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        newReport.setDate(String.valueOf(dateFormat.format(date)));
        GeneralReportGenerator.insertReport(reportFrame.getReportsCollection(), newReport);
    }
    
    public static void printReport(FrmPrintGeneralReport reportFrame){
        PrinterJob job = PrinterJob.getPrinterJob();

        job.setPrintable(reportFrame.getPnlPrintGeneralReport1());

        if(job.printDialog()){
            try{
                job.print();
            }catch (PrinterException ex){
            }
        }else{
            JOptionPane.showMessageDialog(reportFrame, "The print was canceled");
        }
    }
}
