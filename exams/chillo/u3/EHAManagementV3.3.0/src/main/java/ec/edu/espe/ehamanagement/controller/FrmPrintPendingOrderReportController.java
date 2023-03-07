package ec.edu.espe.ehamanagement.controller;

import ec.edu.espe.ehamanagement.model.AgendaReport;
import ec.edu.espe.ehamanagement.model.Order;
import ec.edu.espe.ehamanagement.view.FrmPrintPendingOrderReport;
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
public class FrmPrintPendingOrderReportController {
    public static void insertReport( FrmPrintPendingOrderReport reportFrame){
        ArrayList <Order> completedOrders = AgendaReportGenerator.filterOrders(reportFrame.getReadedOrders(), "completed");
        ArrayList <Order> pendingOrders = AgendaReportGenerator.filterOrders(reportFrame.getReadedOrders(), "pending");
        ArrayList <Integer> completedOrdersIds = new ArrayList();
        ArrayList <Integer> pendingOrdersIds = new ArrayList();
        for(Order order: completedOrders){
            completedOrdersIds.add(order.getId());
        }
        for (Order order:pendingOrders){
            pendingOrdersIds.add(order.getId());
        }
        
        AgendaReport newReport = new AgendaReport(pendingOrdersIds, completedOrdersIds);
        newReport.setType("Pending Orders");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        newReport.setDate(String.valueOf(dateFormat.format(date)));
        AgendaReportGenerator.insertReport(reportFrame.getReportsCollection(), newReport);
    }
    
    public static void printReport(FrmPrintPendingOrderReport reportFrame){
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(reportFrame.getPnlPrintPendingOrderReport1());

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
