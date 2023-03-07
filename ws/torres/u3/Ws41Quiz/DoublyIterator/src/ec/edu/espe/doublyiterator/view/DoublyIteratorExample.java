/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.doublyiterator.view;

import ec.edu.espe.doublyiterator.model.DoublyLinkedList;
import ec.edu.espe.doublyiterator.model.Iterator;


/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class DoublyIteratorExample {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
 
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
 
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        
    }
    
}
