
package ec.edu.espe.code.model;

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
     * @return the nationatility
     */
    public String getNationatility() {
        return nationatility;
    }

    /**
     * @param nationatility the nationatility to set
     */
    public void setNationatility(String nationatility) {
        this.nationatility = nationatility;
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

    public SoccerPlayer(String name, String nationatility, String age) {
        this.name = name;
        this.nationatility = nationatility;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" + "name=" + getName() + ", nationatility=" + getNationatility() + ", age=" + getAge() + '}';
    }
    
    private String name;
    private String nationatility;
    private String age;
}
