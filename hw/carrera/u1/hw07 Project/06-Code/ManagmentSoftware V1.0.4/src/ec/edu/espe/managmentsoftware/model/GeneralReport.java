package ec.edu.espe.managmentsoftware.model;

import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class GeneralReport {
    public static void generateReport(){
    ArrayList<Order> ordersForAgendaReport = Agenda.readOrdersFromFile();
    ArrayList<Product> productsForInventoryReport = Inventory.readProductsFromFile();
    AgendaReport.generatePendingOrdersReport(ordersForAgendaReport);
    AgendaReport.generateCompletedOrdersReport(ordersForAgendaReport);
    InventoryReport.generateStockReport(productsForInventoryReport );
    InventoryReport.generateShortageReport(productsForInventoryReport);
    } 
}
