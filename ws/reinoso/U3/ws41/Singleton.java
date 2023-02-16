public class Singleton {
    private static Singleton instance;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void printMessage(String message) {
        System.out.println(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.printMessage("This is the first message.");
        
        Singleton anotherSingleton = Singleton.getInstance();
        anotherSingleton.printMessage("This is the second message.");
        
        if (singleton == anotherSingleton) {
            System.out.println("Both instances are the same!");
        }
    }
}
