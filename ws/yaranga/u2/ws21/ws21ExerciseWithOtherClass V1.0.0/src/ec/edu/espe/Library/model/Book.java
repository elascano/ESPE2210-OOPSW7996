
package ec.edu.espe.Library.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Book {
    private int id;
    private String autor;
    private String title;
    private String publisher;
    private Short year;

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", autor=" + autor + ", title=" + title + ", publisher=" + publisher + ", year=" + year + '}';
    }
    
    public Book() {
        id = 0;
        autor = "";
        title = "";
        publisher = "";
        year = 0;
    }

    public Book(int id, String autor, String title, String publisher, Short year) {
        this.id = id;
        this.autor = autor;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
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
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the year
     */
    public Short getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(Short year) {
        this.year = year;
    }

   
    
    
    
}
