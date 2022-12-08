/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.apanadoMenu.view;

import ec.edu.espe.apanadoMenu.model.Customer;
import java.util.Scanner;
import ec.edu.espe.apanadoMenu.model.Order;
import java.util.ArrayList;
import java.util.InputMismatchException;
/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class ApanadoMenu {
    public static void main (String[] args){
        int choiceOfTheMenu=0;
        int choiceOfTheMenuOrder=0;
        Order food ;
        food =  new Order();
        Scanner imputEscan = new Scanner (System.in);
        boolean posibleToContinue;
        int counter = 0;
        int ASCIIValue = 0;
        char character;
        int id = 0;
        int listPosition = 0;
        String name = "";
        int age = 0;
        String email = "";
        int[] birthday = new int[3];
        birthday[0]=0;
        birthday[1]=0;
        birthday[2]=0;
        Customer customer;
        customer = new Customer();
        
        ArrayList<Customer> customers;
        customers = new ArrayList();
        ArrayList<Order> totalOrder;
        totalOrder = new ArrayList();
        
        do{
            principalMenu();
            choiceOfTheMenu = imputEscan.nextInt();
            switch (choiceOfTheMenu){
                case 1:{
                    menuFood();
                    break;
                }
                case 2:{
                    do{
                        menuFood();
                        System.out.print("Please, Choose an option: ");
                        choiceOfTheMenu = imputEscan.nextInt();
                        switch(choiceOfTheMenu){
                            case 1:{
                                do{
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("1. Salchipapa+Bebida                          |$2.00");
                                    System.out.println("2. Papipollo                                  |$2.50");
                                    System.out.println("3. Salchipapa+Huevo                           |$2.30");
                                    System.out.println("4. Porcion de Papas Fritas                    |$1.50");
                                    System.out.println("5. Back");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.print("Please, Choose an option: ");
                                    choiceOfTheMenuOrder = imputEscan.nextInt();
                                    switch(choiceOfTheMenuOrder){
                                        case 1:{
                                            food =  new Order();
                                            food.setOrder("Salchipapa+Bebida");
                                            food.setOrderCost((float) 2);
                                            totalOrder.add(food);
                                            break;
                                        }
                                        case 2:{
                                            food =  new Order();
                                            food.setOrder("Papipollo");
                                            food.setOrderCost((float) 2.3);
                                            totalOrder.add(food);
                                            break;
                                        }
                                        case 3:{
                                            food =  new Order();
                                            food.setOrder("Salchipapa+Huevo");
                                            food.setOrderCost((float) 2.3);
                                            totalOrder.add(food);
                                            break;
                                        }   
                                        case 4:{
                                            food =  new Order();
                                            food.setOrder("Porcion de Papas Fritas");
                                            food.setOrderCost((float) 1.5);
                                            totalOrder.add(food);
                                            break;
                                        }
                                        case 5:{
                                            break;
                                        }                                        
                                        default:{
                                            System.out.println("Wrong option");
                                            break;
                                        }
                                    }  
                                }while(choiceOfTheMenuOrder!=5);
                                break;
                            }
                            case 2:{
                                System.out.println("-----------------------------------------------------");
                                System.out.println("Precio de Super Completo                    |$4.50");
                                System.out.println("Contiene:");
                                System.out.println("Papas Fritas+pollo+huevo+salchicha+bebida");
                                food =  new Order();
                                food.setOrder("Super Completo");
                                System.out.println("-----------------------------------------------------");
                                food.setOrderCost((float) 4.5);
                                totalOrder.add(food);
                                break;
                            }
                            case 3:{
                                System.out.println("-----------------------------------------------------");
                                System.out.println("Pollo o Carne a la Plancha         |$4.50");
                                System.out.println("Contiene:");
                                System.out.println("Pollo o Carne");
                                System.out.println("Arroz+Menestra+Papasfritas+Ensalada+bebida");
                                food =  new Order();
                                food.setOrder("Pollo o Carne a la Plancha");
                                System.out.println("-----------------------------------------------------");
                                food.setOrderCost((float) 4.5);
                                totalOrder.add(food);
                                break;
                            }
                            case 4:{
                                do{
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("1. Apanado de Pollo o Carne                  |$4.50");
                                    System.out.println("Contiene:");
                                    System.out.println("Pollo o Carne");
                                    System.out.println("Arroz+Menestra+Papasfritas+Ensalada+bebida");
                                    System.out.println("2. Medio Apanado de Pollo                     |$2.50");
                                    System.out.println("Contiene:");
                                    System.out.println("Pollo+Papas fritas+Ensalada+bebida");
                                    System.out.println("3. Back");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.print("Please, Choose an option: ");
                                    
                                    choiceOfTheMenuOrder = imputEscan.nextInt();
                                    switch(choiceOfTheMenuOrder){
                                        case 1:{
                                            food =  new Order();
                                            food.setOrder("Apanado de Pollo o Carne");
                                            food.setOrderCost((float) 4.5);
                                            totalOrder.add(food);
                                            break;
                                        }
                                        case 2:{
                                            food =  new Order();
                                            food.setOrder("Medio Apanado de Pollo");
                                            food.setOrderCost((float) 2.5);
                                            totalOrder.add(food);
                                            break;
                                        }
                                        case 3:{
                                            break;
                                        }   
                                        default:{
                                            System.out.println("Wrong option");
                                            break;
                                        }
                                    }  
                                }while(choiceOfTheMenuOrder!=3);
                                break;
                            }
                            case 5:{
                                do{
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("1. Completa                                   |$3.00");
                                    System.out.println("Contiene:");
                                    System.out.println("Hamburguesa+Huevo+Queso+Papas Fritas+Bebida");
                                    System.out.println("2. Simple                                     |$2.50");
                                    System.out.println("Contiene:");
                                    System.out.println("Hamburguesa Simple+Papas Fritas+Bebida");
                                    System.out.println("3. Back");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.print("Please, Choose an option: ");
                                    choiceOfTheMenuOrder = imputEscan.nextInt();
                                    switch(choiceOfTheMenuOrder){
                                        case 1:{
                                            food =  new Order();
                                            food.setOrder("Hamburguesa Completa");
                                            food.setOrderCost((float) 3);
                                            totalOrder.add(food);
                                            break;
                                        }
                                        case 2:{
                                            food =  new Order();
                                            food.setOrder("Hamburguesa Simple");
                                            food.setOrderCost((float) 2.5);
                                            totalOrder.add(food);
                                            break;
                                        }
                                        case 3:{
                                            break;
                                        }   
                                        default:{
                                            System.out.println("Wrong option");
                                            break;
                                        }
                                    }  
                                }while(choiceOfTheMenuOrder!=3);                                
                                break;
                            }
                            case 6:{
                                do{
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("1. Churrasco de Pollo o Carne                 |$4.90");
                                    System.out.println("Contiene:");
                                    System.out.println("Pollo o Carne");
                                    System.out.println("PapasFritas+2Huevos+Ensalada+Bebida");
                                    System.out.println("2. Medio Churrasco+Bebida                     |$3.00");
                                    System.out.println("3. Back");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.print("Please, Choose an option: ");
                                    choiceOfTheMenuOrder = imputEscan.nextInt();
                                    switch(choiceOfTheMenuOrder){
                                        case 1:{
                                            food =  new Order();
                                            food.setOrder("Churrasco de Pollo o Carne");
                                            food.setOrderCost((float) 4.9);
                                            totalOrder.add(food);
                                            break;
                                        }
                                        case 2:{
                                            food =  new Order();
                                            food.setOrder("Medio Churrasco+Bebida");
                                            food.setOrderCost((float) 3);
                                            totalOrder.add(food);
                                            break;
                                        }
                                        case 3:{
                                            break;
                                        }   
                                        default:{
                                            System.out.println("Wrong option");
                                            break;
                                        }
                                    }  
                                }while(choiceOfTheMenuOrder!=3);                                   
                                break;
                            }
                            case 7:{
                                do{
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("1. Te                                         |$0.50");
                                    System.out.println("2. Agua                                       |$0.60");
                                    System.out.println("3. Gaseosa                                    |$0.50");
                                    System.out.println("4. Back");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.print("Please, Choose an option: ");
                                    choiceOfTheMenuOrder = imputEscan.nextInt();
                                    switch(choiceOfTheMenuOrder){
                                        case 1:{
                                            food =  new Order();
                                            food.setOrder("Te");
                                            food.setOrderCost((float) 0.5);
                                            totalOrder.add(food);
                                            break;
                                        }
                                        case 2:{
                                            food =  new Order();
                                            food.setOrder("Agua");
                                            food.setOrderCost((float) 0.6);
                                            totalOrder.add(food);
                                            break;
                                        }
                                        case 3:{
                                            food =  new Order();
                                            food.setOrder("Gaseosa");
                                            food.setOrderCost((float) 0.5);
                                            totalOrder.add(food);
                                            break;
                                        }
                                        case 4:{
                                            break;
                                        }
                                        default:{
                                            System.out.println("Wrong option");
                                            break;
                                        }
                                    }  
                                }while(choiceOfTheMenuOrder!=4);   
                                break;
                            }
                            case 8:{
                                break;
                            }
                            default: {
                                System.out.println("Wrong option");
                                break;
                            }

                        }
                    } while (choiceOfTheMenu != 8);
                    break;
                }
                case 3:
                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Enter Id: ");
                            id = imputEscan.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("Error, please introduce a real number");
                            imputEscan.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);

                    System.out.println("Enter Name: ");
                    name = imputEscan.next();

                    System.out.println("Enter email: ");
                    email = imputEscan.next();

                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Enter Birthday: ");
                            do {
                                System.out.println("Month");
                                birthday[0] = imputEscan.nextInt();
                            } while (birthday[0] < 1 || birthday[0] > 12);

                            if (birthday[0] == 2) {
                                do {
                                    System.out.println("Day");
                                    birthday[1] = imputEscan.nextInt();
                                } while (birthday[1] < 1 || birthday[1] > 29);
                            } else if (birthday[0] == 1 || birthday[0] == 3 || birthday[0] == 5 || birthday[0] == 7 || birthday[0] == 8 || birthday[0] == 10 || birthday[0] == 12) {
                                do {
                                    System.out.println("Day");
                                    birthday[1] = imputEscan.nextInt();
                                } while (birthday[1] < 1 || birthday[1] > 31);
                            } else {
                                do {
                                    System.out.println("Day");
                                    birthday[1] = imputEscan.nextInt();
                                } while (birthday[1] < 1 || birthday[1] > 30);
                            }

                            do {
                                System.out.println("Year");
                                birthday[2] = imputEscan.nextInt();
                            } while (birthday[2] < 1900 || birthday[2] > 2022);

                        } catch (InputMismatchException ex) {
                            System.out.println("Error, please introduce a real number");
                            imputEscan.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);

                    customer.setId(id);
                    customer.setName(name);
                    customer.setEmail(email);
                    customer.setBirthday(birthday);

                    System.out.println("\n====================================================================");
                    System.out.println("          Customer          ");
                    System.out.println("====================================================================\n");
                    System.out.println("id \t---> " + customer.getId());
                    System.out.println("name \t---> " + customer.getName());
                    System.out.println("email \t---> " + customer.getEmail());
                    System.out.println("birthday \t---> " + customer.getBirthday()[0] + "/" + customer.getBirthday()[1] + "/" + customer.getBirthday()[2] + "\n");

                    customers.add(customer);
                    System.out.println("\n====================================================================");
                    for (int i = 0; i < totalOrder.size(); i++) {
                        System.out.println("=" + totalOrder.get(i).getOrder() + "==========>" + totalOrder.get(i).getOrderCost() + "");
                    }
                    float totalPay = 0;
                    for (int i = 0; i < totalOrder.size(); i++) {
                        totalPay += totalOrder.get(i).getOrderCost();
                    }
                    System.out.println("= TOTAL:\t\t\t" + totalPay);
                    System.out.println("\n====================================================================");
                    break;
                case 4: {

                    break;
                }
                default: {
                    System.out.println("Wrong option");
                    break;
                }

            }
        } while (choiceOfTheMenu != 3);
    }

    public static void principalMenu() {

        System.out.println("-------------------------------------------------");
        System.out.println("           LOS MEGA APANADOS DE LA ESPE");
        System.out.println("-------------------------------------------------");
        System.out.println("1. View Menu");
        System.out.println("2. Place Order");
        System.out.println("3. Pay");
        System.out.println("4. Exit");
        System.out.print("Please, Choose an option: ");
    }

    public static void menuFood() {
        System.out.println("-----------------------------------------------------");
        System.out.println("1. Salchipapas");
        System.out.println("2. Super Completo");
        System.out.println("3. A la Plancha");
        System.out.println("4. Apanados");
        System.out.println("5. Hamburguesa");
        System.out.println("6. Churrascos");
        System.out.println("7. Bebidas");
        System.out.println("8. Back");
    }
    
    
}
