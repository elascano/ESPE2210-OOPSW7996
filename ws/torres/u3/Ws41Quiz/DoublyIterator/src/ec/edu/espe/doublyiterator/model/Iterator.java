/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.doublyiterator.model;


/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public interface Iterator<T>  {
    
    boolean hasNext();
    T next();
    boolean hasPrevious();
    T previous();
    
}
