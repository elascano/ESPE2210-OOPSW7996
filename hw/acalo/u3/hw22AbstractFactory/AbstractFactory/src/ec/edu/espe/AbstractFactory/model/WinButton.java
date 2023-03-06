package ec.edu.espe.AbstractFactory.model;

public class WinButton extends Button{
    @Override
    public void paint(){
        System.out.println("I'm a WinButton: "+caption);
    }
}
