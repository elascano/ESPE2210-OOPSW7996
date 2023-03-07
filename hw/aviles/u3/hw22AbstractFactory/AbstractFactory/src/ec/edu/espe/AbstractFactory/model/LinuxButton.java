package ec.edu.espe.AbstractFactory.model;

public class LinuxButton extends Button{
    
    @Override
    public String paint(){
        return("LinuxButton: "+caption);
        
    }
}
