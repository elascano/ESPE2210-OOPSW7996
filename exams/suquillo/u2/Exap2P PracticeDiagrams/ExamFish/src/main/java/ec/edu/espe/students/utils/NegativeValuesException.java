/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.students.utils;

/**
 *
 * @author Martín Suquillo, TeamWebMaster, DCCO-ESPE
 */
public class NegativeValuesException extends Exception{
    private long serialVersionUID = 700L;

    public NegativeValuesException(String message) {
        super(message);
    }
}
