
package ec.edu.espe.vinylrecord.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Vinyl {
    
    private int id;
    private String artist;
    private String yearOfRelease;

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
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @return the yearOfRelease
     */
    public String getYearOfRelease() {
        return yearOfRelease;
    }

    /**
     * @param yearOfRelease the yearOfRelease to set
     */
    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Vinyl(int id, String artist, String yearOfRelease) {
        this.id = id;
        this.artist = artist;
        this.yearOfRelease = yearOfRelease;
    }

    
    
}
