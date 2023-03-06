/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.SoccerTeam.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class SoccerTeam {
    private int id;
    private String nameSoccerTeam;
    private int yearOfFoundation;

    public SoccerTeam(int id, String nameSoccerTeam, int yearOfFoundation) {
        this.id = id;
        this.nameSoccerTeam = nameSoccerTeam;
        this.yearOfFoundation = yearOfFoundation;
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
     * @return the nameSoccerTeam
     */
    public String getNameSoccerTeam() {
        return nameSoccerTeam;
    }

    /**
     * @param nameSoccerTeam the nameSoccerTeam to set
     */
    public void setNameSoccerTeam(String nameSoccerTeam) {
        this.nameSoccerTeam = nameSoccerTeam;
    }

    /**
     * @return the yearOfFoundation
     */
    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    /**
     * @param yearOfFoundation the yearOfFoundation to set
     */
    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }
    
    
          
}
