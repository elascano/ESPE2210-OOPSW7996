package ec.edu.espe.ehamanagement.controller;

import ec.edu.espe.ehamanagement.view.PnlAgenda;
import ec.edu.espe.ehamanagement.view.PnlAgendaAddNewOrder;
import ec.edu.espe.ehamanagement.view.PnlAgendaTable;
import ec.edu.espe.ehamanagement.view.PnlAgendaUpdateAndDeleteOrder;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class PnlAgendaController {
    public static void initPnlAgendaTable(PnlAgenda agendaPanel){
        PnlAgendaTable pnlAgendaTable = new PnlAgendaTable(agendaPanel.getOrdersCollection());
        pnlAgendaTable.setSize(714,523);
        pnlAgendaTable.setLocation(0, 0);
        agendaPanel.getPnlWindow().removeAll();
        agendaPanel.getPnlWindow().add(pnlAgendaTable,pnlAgendaTable);
        agendaPanel.getPnlWindow().revalidate();
        agendaPanel.getPnlWindow().repaint();
    }

    public static void initPnlNewOrder(PnlAgenda agendaPanel){
        PnlAgendaAddNewOrder pnlNewOrder = new PnlAgendaAddNewOrder(agendaPanel.getOrdersCollection());
        pnlNewOrder.setSize(714,523);
        pnlNewOrder.setLocation(0, 0);
        agendaPanel.getPnlWindow().removeAll();
        agendaPanel.getPnlWindow().add(pnlNewOrder,pnlNewOrder);
        agendaPanel.getPnlWindow().revalidate();
        agendaPanel.getPnlWindow().repaint();
    }
    public static void initPnlAgendaUpdateAndDeleteOrder(PnlAgenda agendaPanel){
        PnlAgendaUpdateAndDeleteOrder pnlAgendaUpdateAndDeleteOrder = new PnlAgendaUpdateAndDeleteOrder(agendaPanel.getOrdersCollection());
        pnlAgendaUpdateAndDeleteOrder.setSize(714,523);
        pnlAgendaUpdateAndDeleteOrder.setLocation(0,0);
        agendaPanel.getPnlWindow().removeAll();
        agendaPanel.getPnlWindow().add(pnlAgendaUpdateAndDeleteOrder,pnlAgendaUpdateAndDeleteOrder);
        agendaPanel.getPnlWindow().revalidate();
        agendaPanel.getPnlWindow().repaint();

    }
}
