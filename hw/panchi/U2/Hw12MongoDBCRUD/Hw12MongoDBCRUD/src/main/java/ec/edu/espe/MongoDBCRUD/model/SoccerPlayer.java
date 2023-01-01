package ec.edu.espe.MongoDBCRUD.model;

import java.util.*;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class SoccerPlayer {
    
    private int id;
    private String name;
    private int age;
    private ArrayList<Integer> goals;

    public SoccerPlayer(){
        id = 0;
        name = "";
        age = 0;
        goals = new ArrayList<>();     
    }
    
    @Override
    public String toString() {
        return "SoccerPlayer{" + "id=" + id + ", name=" + name + ", age=" + age + ", goals=" + goals + '}';
    }
    
    

    public SoccerPlayer(int id, String name, int age, ArrayList<Integer> goals) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.goals = goals;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the goals
     */
    public ArrayList<Integer> getGoals() {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(ArrayList<Integer> goals) {
        this.goals = goals;
    }
    
    
    
}
