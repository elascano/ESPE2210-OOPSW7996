
package ec.edu.espe.AreaCalculator.model;

import ec.edu.espe.AreaCalculator.utils.DivideAreaIntoZero;

public class DivideTwoAreas
{
    private float firstArea;
    private float secondArea;

    public DivideTwoAreas(float firstArea, float secondArea) {
        this.firstArea = firstArea;
        this.secondArea = secondArea;
    }
    public float split() throws DivideAreaIntoZero
    {
        float area;
        if(secondArea==0)
        {
            throw new DivideAreaIntoZero("the second area is 0");
        }
        else
        {
            area=firstArea/secondArea;
        }
        return area;
    }
    
    
    
}
