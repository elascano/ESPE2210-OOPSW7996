/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ecu.espe.studentcsassignment.model;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class HighSchoolUser {
    protected String name;
    protected int id;
    protected String password;
    protected String email;

    public HighSchoolUser(String name, int id, String password, String email) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "HighSchoolUser{" + "name=" + name + ", id=" + id + ", password=" + password + ", email=" + email + '}';
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
