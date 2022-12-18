
package ec.edu.espe.figure.model;

import ec.edu.espe.figure.view.Figure;

/**
 *
 * @author Lady Cajilima, Gaman Geeklords, DCCO-ESPE
 */
public class Triangle extends Figure{
    
    public Triangle(float base, float altura, float lad01, float lado2, float lado3, float diametro, float radio) {
        super(base, altura, lad01, lado2, lado3, diametro, radio);
        this.lad01 = lad01;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = base;
        this.altura = altura;
    }
    
    
}
