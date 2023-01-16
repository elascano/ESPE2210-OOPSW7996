/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam2.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
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
