
package ec.edu.espe.figure.view;

/**
 *
 * @author Lady Cajilima, Gaman Geeklords, DCCO-ESPE
 */
public class Figure {
   
    public float base;
    public float altura;
    public float lad01;
    public float lado2;
    public float lado3;
    public float diametro;
    public float radio;
    
    public Figure(float base, float altura, float lad01, float lado2, float lado3, float diametro, float radio) {
        this.base = base;
        this.altura = altura;
        this.lad01 = lad01;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.diametro = diametro;
        this.radio = radio;
    }
    
 

    @Override
    public String toString() {
        return "Figure{" + "base=" + getBase() + ", altura=" + getAltura() + ", lad01=" + getLad01() + ", lado2=" + getLado2() + ", lado3=" + getLado3() + ", diametro=" + getDiametro() + ", radio=" + getRadio() + '}';
    }

    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the lad01
     */
    public float getLad01() {
        return lad01;
    }

    /**
     * @param lad01 the lad01 to set
     */
    public void setLad01(float lad01) {
        this.lad01 = lad01;
    }

    /**
     * @return the lado2
     */
    public float getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the lado3
     */
    public float getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    /**
     * @return the diametro
     */
    public float getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    /**
     * @return the radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
   

  
    
    
}
