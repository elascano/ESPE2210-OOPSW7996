package ec.edu.espe.AbstractFactory.model;

public class WinMenu extends Menu{
    @Override
    public void paint(){
        System.out.println("I'm a WindowsMenu: "+caption);
    }
}
