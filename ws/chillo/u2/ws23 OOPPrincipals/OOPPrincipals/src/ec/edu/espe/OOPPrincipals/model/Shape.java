package ec.edu.espe.OOPPrincipals.model;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public abstract class Shape {
    
    public int calculatePerimeterRectanguler (int baseRectanguler, int heightRectanguler) {
        
        int perimeterRectanguler;
        
        perimeterRectanguler = ( 2 * baseRectanguler ) + ( 2 * heightRectanguler );
        
        return perimeterRectanguler;
    }
    
    public int calculateAreaRectanguler (int baseRectanguler, int heightRectanguler) {
        
        int areaRectanguler;
        
        areaRectanguler = baseRectanguler * heightRectanguler;
        
        System.out.println("The area of the rectanguler is --> " + areaRectanguler );
        
        return areaRectanguler;
    }
    
    public int calculatePerimeterTriangle (int baseTriangle, int leftSideTriangle, int rightSideTriangle){
    
        int perimeterTriangle;
    
        perimeterTriangle = (baseTriangle + leftSideTriangle + rightSideTriangle);
        
        System.out.println("The perimeter of the rectanguler is --> " + perimeterTriangle );
                
        return perimeterTriangle;
    }
    
    public int calculateAreaTriangle (int baseTriangle, int heightTriangle){
        
        int areaTriangle;
        
        areaTriangle = ( baseTriangle * heightTriangle ) / 2;
        
        System.out.println("The area of the triangle is --> " + areaTriangle );
        
        return areaTriangle;
    }
    
    public double calculatePerimeterCircle (double radioCircle){
        
        double perimeterCircle;
        double pi;
        
        pi = 3.1416;
        perimeterCircle = (2 * pi * radioCircle);
        
        System.out.println("The perimeter of the circle is --> " + perimeterCircle);
        
        return perimeterCircle;
    }
    
    public double calculateAreaCircle (double radioCircle){
        
        double areaCircle;
        double pi;
        
        pi =  3.1416;
        areaCircle = ( pi * ( radioCircle * radioCircle ));
        
        return areaCircle;
    }
}
