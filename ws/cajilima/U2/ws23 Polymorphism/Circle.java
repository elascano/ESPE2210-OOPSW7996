
package ec.edu.espe.figure.model;

import ec.edu.espe.figure.view.Figure;

/**
 *
 * @author Lady Cajilima, Gaman Geeklords, DCCO-ESPE
 */
public class Circle extends Figure {
    public Circle(int base, int altura, int lad01, int lado2, int lado3, int diametro, int radio) {
        super(base, altura, lad01, lado2, lado3, diametro, radio);
        this.diametro = diametro;
        this.radio = radio;
    }
 
    
}
