package ec.edu.espe.exercise.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class SDcard {
    private int memory;
    private String trademark;
    private int pins;
    private int numberofserie;

    public SDcard(){
    memory = 0;
    trademark = null;
    pins = 0;
    numberofserie = 0;
}
    @Override
    public String toString() {
        return "SDcard{" + "memory=" + memory + ", trademark=" + trademark + ", pins=" + pins + '}';
    }

    public SDcard(int numberofserie, int memory, String trademark, int pins) {
        this.numberofserie = numberofserie;
        this.memory = memory;
        this.trademark = trademark;
        this.pins = pins;
    }
    
    public int getNumberofserie() {
        return numberofserie;
    }

    public void setNumberofserie(int numberofserie) {
        this.numberofserie = numberofserie;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public int getPins() {
        return pins;
    }

    public void setPins(int pins) {
        this.pins = pins;
    }
 


}
