package ec.edu.espe.CompositePattern.model;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
class Client{
    public static Employee employee;
    public static void doClientTask(){
        employee.stateName();
    }
}