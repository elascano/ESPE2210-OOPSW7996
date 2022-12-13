package ec.edu.espe.CellPhoneProvider.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class CellPhone {

    private int id;
    private String cellPhoneBrand;
    private String color;
    private int numberOfCellPhones;

    public CellPhone() {
        id = 0;
        cellPhoneBrand = "";
        color = "";
        numberOfCellPhones = 0;
    }

    @Override
    public String toString() {
        return "Fork{" + "id=" + id + ", MaterialFork=" + cellPhoneBrand + ", colorFork=" + color + ", amountFork=" + numberOfCellPhones + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCellPhoneBrand() {
        return cellPhoneBrand;
    }

    public void setCellPhoneBrand(String cellPhoneBrand) {
        this.cellPhoneBrand = cellPhoneBrand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfCellPhones() {
        return numberOfCellPhones;
    }

    public void setNumberOfCellPhones(int numberOfCellPhones) {
        this.numberOfCellPhones = numberOfCellPhones;
    }
    

}
