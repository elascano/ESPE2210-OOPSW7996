package ec.edu.espe.AbstractFactory.model;

public class LinuxFactory extends GUIFactory{
    @Override
    public  Button createButton(){
        return (new LinuxButton());
    }
    @Override
    public  Menu createMenu(){
        return (new LinuxMenu());
    }
}
