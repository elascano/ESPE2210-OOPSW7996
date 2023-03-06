
package ec.edu.espe.soccerplayer.model;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class SoccerPlayer {

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
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" + "name=" + name + ", nationality=" + nationality + ", age=" + age + '}';
    }

    public SoccerPlayer(String name, String nationality, String age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }
    
    private String name;
    private String nationality;
    private String age;
    
}
