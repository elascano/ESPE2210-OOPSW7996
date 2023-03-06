package ec.edu.espe.composite.model;

public abstract class Employee {
    String name;
    String title;
    
    public void stateName(){
        System.out.println(title+" "+name);
    }
}
