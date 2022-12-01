
package ec.edu.espe.ExamPractice.model;
import java.util.Scanner;
/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class Cellphone {

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
     * @return the brandNamePhone
     */
    public String getBrandNamePhone() {
        return brandNamePhone;
    }

    /**
     * @param brandNamePhone the brandNamePhone to set
     */
    public void setBrandNamePhone(String brandNamePhone) {
        this.brandNamePhone = brandNamePhone;
    }

    /**
     * @return the modelPhone
     */
    public String getModelPhone() {
        return modelPhone;
    }

    /**
     * @param modelPhone the modelPhone to set
     */
    public void setModelPhone(String modelPhone) {
        this.modelPhone = modelPhone;
    }
    private int id;
    private String brandNamePhone;
    private String modelPhone;
    
    public void setCellphone(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Write Cellphone ID: ");
        id = sc.nextInt();
        System.out.println("Write Brand Phone: ");
        brandNamePhone= sc.nextLine();
        System.out.println("Write Model Phone: ");
        modelPhone = sc.nextLine();
       
    }
}
