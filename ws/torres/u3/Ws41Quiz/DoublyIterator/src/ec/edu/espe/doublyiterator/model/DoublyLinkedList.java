/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.doublyiterator.model;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class DoublyLinkedList<T> {
    private List<T> list;
 
    public DoublyLinkedList() {
        this.list = new ArrayList<>();
    }
 
    public void add(T element) {
        list.add(element);
    }
 
    public Iterator<T> iterator() {
        return new DoublyIterator<>(list);
    }
}
