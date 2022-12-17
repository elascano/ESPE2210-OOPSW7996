
package ec.edu.espe.Figure.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Triangle extends Shape {

    private float slide1;
    private float slide2;
    private float slide3;

    public Triangle(float slide1, float slide2, float slide3, float area, float perimeter) {
        super(area, perimeter);
        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }

    public void perimeter(float slide1, float slide2, float slide3) {
        float perimeter = slide1 + slide2 + slide3;
        System.out.println("PERIMETRE TRIANGLE-->" + perimeter);
    }

    @Override
    public void area(float area) {

    }

    public void area(float slideA, float slideB, float slideC) {
        float perimeter = slideA + slideB + slideC;
        float area = (float) Math.sqrt((perimeter / 2) * ((perimeter / 2) - slide1) + ((perimeter / 2) - slide2) + ((perimeter / 2) - slide3));
        System.out.println("AREA TRIANGLE--> " + area);
    }

    public float getSlide1() {
        return slide1;
    }

    public void setSlide1(float slide1) {
        this.slide1 = slide1;
    }

    public float getSlide2() {
        return slide2;
    }

    public void setSlide2(float slide2) {
        this.slide2 = slide2;
    }

    public float getSlide3() {
        return slide3;
    }

    public void setSlide3(float slide3) {
        this.slide3 = slide3;
    }

    

    @Override
    public void perimetre(float perimetre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
