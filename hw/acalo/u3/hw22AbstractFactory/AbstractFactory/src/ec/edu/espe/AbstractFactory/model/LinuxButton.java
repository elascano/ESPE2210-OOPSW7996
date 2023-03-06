package ec.edu.espe.AbstractFactory.model;

public class LinuxButton extends Button{
    
    @Override
    public void paint(){
        System.out.println("I'm a LinuxButton: "+caption);
    }
}
