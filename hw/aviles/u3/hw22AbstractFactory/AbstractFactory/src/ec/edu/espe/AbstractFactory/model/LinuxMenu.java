package ec.edu.espe.AbstractFactory.model;

public class LinuxMenu extends Menu{
    
    @Override
    public String paint(){
        return("LinuxMenu: "+caption);
    }
}
