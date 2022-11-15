package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public boolean getIsMolting() {
        return isMolting;
    }
    
    public void setIsMolting(boolean isMolting){
        this.isMolting = isMolting;
    }
    
}
