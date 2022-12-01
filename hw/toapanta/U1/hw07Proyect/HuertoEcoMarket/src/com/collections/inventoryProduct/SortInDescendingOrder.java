
package com.collections.inventoryProduct;

import java.util.Comparator;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class SortInDescendingOrder implements Comparator<String>{

    @Override
    public int compare(String enteredProduct , String listedProduct) {
        return listedProduct.compareTo(enteredProduct);        
        
    }
    
    
    
}
