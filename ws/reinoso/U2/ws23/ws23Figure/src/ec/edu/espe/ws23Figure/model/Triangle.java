package ec.edu.espe.ws23Figure.model;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class Triangle extends Shape{
    private float slideA;
    private float slideB;
    private float slideC;
    private float totalPerimeter;
   
     public Triangle(float slideA, float slideB, float slideC, float area, float perimeter) {
         super(area,perimeter);
        this.slideA = slideA;
        this.slideB = slideB;
        this.slideC = slideC;
    }
       
    @Override
    public void perimeter(float perimeter) {
    }
    
    public void perimeter(float SlideA, float SlideB, float SlideC){
        float perimeter = SlideA+SlideB+SlideC;
        System.out.println("The perimeter of Triangle is"+ perimeter);
    }
   
    @Override
    public void area(float area) {
    }
     public void area (float SlideA, float SlideB, float SlideC){   
        float perimeter = SlideA+SlideB+SlideC;
        float area = (float) Math.sqrt((perimeter / 2) * ((perimeter / 2) - slideA) + ((perimeter / 2) - slideB) + ((perimeter / 2) - slideC));
         System.out.println("The area of the Triangle is"+ area);
    }
}

