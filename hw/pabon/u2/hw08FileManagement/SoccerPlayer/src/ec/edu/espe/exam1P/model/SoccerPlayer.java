package ec.edu.espe.exam1P.model;

/**
 *
 * @author Elkin Pabon, GitSoft TEAM, DCCO-ESPE
 */

public class SoccerPlayer implements Comparable<SoccerPlayer> {

    private int playerNumber;
    private String name;
    private String team;
    private int age;
    

    public SoccerPlayer() {
        this.playerNumber = 0;
        this.name = "";
        this.team = "";
        this.age = 0;
        
    }

    public SoccerPlayer(int id, String name, String color, int age) {
        this.playerNumber = id;
        this.name = name;
        this.team = color;
        this.age = age;
        
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + playerNumber + ", name=" + name + ", team=" + team + ", age=" + age + '}';
    }
    

    /**
     * @return the playerNumber
     */
    public int getPlayerNumber() {
        return playerNumber;
    }

    /**
     * @param playerNumber the playerNumber to set
     */
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
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
     * @return the team
     */
    public String getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(String team) {
        this.team = team;
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
     * @return the isMolting
     */
    
    @Override
    public int compareTo(SoccerPlayer o) {
        Integer newId = playerNumber;
        return newId.compareTo(o.getPlayerNumber());
    }

}
