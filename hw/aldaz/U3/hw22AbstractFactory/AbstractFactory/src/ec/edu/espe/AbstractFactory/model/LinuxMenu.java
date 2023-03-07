package ec.edu.espe.AbstractFactory.model;

public class LinuxMenu extends Menu{
    
    @Override
    public void paint(){
        System.out.println("I'm a LinuxMenu: "+caption);
    }
}
