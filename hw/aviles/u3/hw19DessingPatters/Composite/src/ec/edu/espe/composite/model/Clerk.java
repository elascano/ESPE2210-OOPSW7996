package ec.edu.espe.composite.model;

public class Clerk extends Employee{
    public Clerk(String aName){
        this();
        name = aName;
    }
    
    @Override
    public void stateName(){
        super.stateName();
    }
    
    public Clerk(){
        title="Clerk";
    }
}
