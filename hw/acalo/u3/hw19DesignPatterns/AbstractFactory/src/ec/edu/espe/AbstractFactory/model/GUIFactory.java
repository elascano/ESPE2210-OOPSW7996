package ec.edu.espe.AbstractFactory.model;

public abstract class GUIFactory {
        
    public static GUIFactory getFactory(){
        String os = System.getProperty("os.name").toLowerCase();
        System.out.println(os);
        int sys = 1;
        if (os.contains("win")) {
            sys=0;
        }
        
        if(sys == 0)
            return(new WinFactory());
        else
            return(new LinuxFactory());
        
    }
    
    public abstract Button createButton();
    public abstract Menu createMenu();
}
