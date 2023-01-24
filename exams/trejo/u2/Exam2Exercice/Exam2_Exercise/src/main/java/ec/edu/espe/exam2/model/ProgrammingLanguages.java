
package ec.edu.espe.exam2.model;

/**
 *
 * @author Alex_22
 */
public class ProgrammingLanguages {
    
    private int id;
    private String nameOfTheProgrammingLanguage;
    private int yearOfCreation;
    private String nameOfTheCreator;     

    public ProgrammingLanguages(int id, String nameOfTheProgrammingLanguage, int yearOfCreation, String nameOfTheCreator) {
        this.id = id;
        this.nameOfTheProgrammingLanguage = nameOfTheProgrammingLanguage;
        this.yearOfCreation = yearOfCreation;
        this.nameOfTheCreator = nameOfTheCreator;
    }
    
    
    public ProgrammingLanguages() {
        id = 0;
        nameOfTheProgrammingLanguage = "";
        yearOfCreation = 0;
        nameOfTheCreator = "";
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfTheProgrammingLanguage() {
        return nameOfTheProgrammingLanguage;
    }

    public void setNameOfTheProgrammingLanguage(String nameOfTheProgrammingLanguage) {
        this.nameOfTheProgrammingLanguage = nameOfTheProgrammingLanguage;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public String getNameOfTheCreator() {
        return nameOfTheCreator;
    }

    public void setNameOfTheCreator(String nameOfTheCreator) {
        this.nameOfTheCreator = nameOfTheCreator;
    }
    
    
    
    
}
