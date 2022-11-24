/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class Contacts {
    
public static void main(String[] args) {
        // TODO code application logic here
        
        int b;
        b=20;
        System.out.println("b(before)-->" + b);
        modify(b);
        System.out.println("b -->" + b);
        
        Customer customer= new Customer(0, "Martin", 19, 2000.0F);
        
        System.out.println("customer(before)-->" + customer);
        modifyObject(customer);
        System.out.println("customer(after)-->" + customer);
        
        int[] otherNumbers={2,4};
        
        System.out.println("other Numbers(0)-->"+ otherNumbers[0]);
        System.out.println("other Numbers(0)-->"+ otherNumbers[1]);
        
        modifyArray(otherNumbers);
        
        System.out.println("other Numbers(0)-->"+ otherNumbers[0]);
        System.out.println("other Numbers(0)-->"+ otherNumbers[0]);
        
        String json;
        json= "{"id":
        
    }
    
    public static void modify(int a){
        a=20;
    }
    
    public static void modifyObject(Customer customer){
        customer.setName("Joel");
        customer.serAge(18);
    }
    
    public static void modifyArray(int number[]){
        number[0]=3;
        number[1]=5;
    }
    
}

