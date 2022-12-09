package ec.edu.espe.urbanizationtreasury.model;

import java.util.ArrayList;

/**
 *
 * @author WebMasterTeam, DCCO-ESPE
 */
public class Treasury {
    
  private long dni = 1722263009;
  private String name = "Joel Rivera";
  private ArrayList<Resident> residents = new ArrayList();

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
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

    public ArrayList<Resident> getResidents() {
        return residents;
    }

    public void setResidents(ArrayList<Resident> residents) {
        this.residents = residents;
    }

    
  
}
