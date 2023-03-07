/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.doublyiterator.model;

import java.util.List;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class DoublyIterator<T> implements Iterator<T> {
    
     private List<T> list;
    private int currentIndex;
 
    public DoublyIterator(List<T> list) {
        this.list = list;
        this.currentIndex = 0;
    }
 
    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }
 
    @Override
    public T next() {
        return list.get(currentIndex++);
    }
 
    @Override
    public boolean hasPrevious() {
        return currentIndex > 0;
    }
 
    @Override
    public T previous() {
        return list.get(--currentIndex);
    }
    
}
