package ec.edu.espe.AbstractFactory.model;

public class WinMenu extends Menu{
    @Override
    public String paint(){
        return("WinMenu: "+caption);
    }
}
