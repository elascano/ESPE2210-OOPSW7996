package ec.edu.espe.AbstractFactory.model;

public class WinButton extends Button{
    @Override
    public String paint(){
        return("WinButton: "+caption);
    }
}
