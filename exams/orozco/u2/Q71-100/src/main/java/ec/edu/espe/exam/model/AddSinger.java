
package ec.edu.espe.exam.model;

/**
 *
 * @author Labs-DCCO
 */
public class AddSinger {
    
    private int id;
    private String name;
    private String song;

    public AddSinger(int id, String name, String song) {
        this.id = id;
        this.name = name;
        this.song = song;
    }
    
    public AddSinger() {
        this.id = 0;
        this.name = "";
        this.song = "";
    }
    
    @Override 
    public String toString(){
        return "Singer:\n " + "Id = \t" + getId() + "\nName = \t" + getName() + "\nSong = \n" + getSong();
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
     * @return the song
     */
    public String getSong() {
        return song;
    }

    /**
     * @param song the song to set
     */
    public void setSong(String song) {
        this.song = song;
    }
    
    
    
}
