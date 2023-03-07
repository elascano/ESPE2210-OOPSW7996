package ec.edu.espe.ehamanagement.controller;

import ec.edu.espe.ehamanagement.model.Order;
import ec.edu.espe.ehamanagement.view.PnlAgendaAddNewOrder;
import java.awt.Color;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class PnlAgendaAddNewOrderController {
    private static Order collectInformation(PnlAgendaAddNewOrder agendaPanel){
        String clientName = agendaPanel.getTxtClientName().getText();
        String deliveryPlace = agendaPanel.getTxtDeliveryPlace().getText();
        String deliveryDate = agendaPanel.getCbxMonthDelivery().getSelectedItem() + "/" + agendaPanel.getCbxDayDelivery().getSelectedItem() + "/" + agendaPanel.getCbxYearDelivery().getSelectedItem();
        String description = agendaPanel.getTxtADescription().getText();
        boolean isDelivered = false;
        Order newOrder =  new Order(0, clientName,  deliveryPlace, deliveryDate, description, isDelivered);
        return newOrder;
    }
    public static boolean insertOrder(PnlAgendaAddNewOrder agendaPanel){
        Order newOrder = collectInformation(agendaPanel);
        return Agenda.insertOrder(agendaPanel.getOrdersCollection(), newOrder);
    } 
    
    public static void writeFields(PnlAgendaAddNewOrder agendaPanel){
        if(agendaPanel.getTxtClientName().getText().isEmpty()){
                agendaPanel.getTxtClientName().setText("client's  name");
                agendaPanel.getTxtClientName().setForeground(Color.gray);
            }
        if(agendaPanel.getTxtDeliveryPlace().getText().isEmpty()){
                agendaPanel.getTxtDeliveryPlace().setText("216 Newbury Street");
                agendaPanel.getTxtDeliveryPlace().setForeground(Color.gray);
            }
        if(agendaPanel.getTxtADescription().getText().isEmpty()){
                agendaPanel.getTxtADescription().setText("Product's description");
                agendaPanel.getTxtADescription().setForeground(Color.gray);  
            }
    }
    
    public static void cleanFields(PnlAgendaAddNewOrder agendaPanel){
        agendaPanel.getTxtClientName().setText("");
        agendaPanel.getTxtDeliveryPlace().setText("");
        agendaPanel.getTxtADescription().setText("");
    }
}
