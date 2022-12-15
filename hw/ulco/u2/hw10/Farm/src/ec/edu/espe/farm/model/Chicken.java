package ec.edu.espe.farm.model;

import java.time.LocalDate;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Chicken extends FarmAnimal {

    private boolean isMolting;
    private int howManyEggIBet;

    public Chicken(boolean isMolting,int howManyEggIBet, int id, String breed, LocalDate bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.howManyEggIBet = howManyEggIBet;
    }
    @Override
    public void feed (float amountOfFood){
        System.out.println("Feeding a Chicken with a float "+ amountOfFood);
    }
    
    public void feed (int amountOfFood){
        System.out.println("Feeding a Chicken with a int "+ amountOfFood);
    }
    
    public void feed (float amountOfFood, String typeOfFood){
        System.out.println("Feeding a Chicken with food -->" + typeOfFood + ", amount: "+ amountOfFood );
    }
    @Override
    public String toString() {
        String chicken = "";
        chicken = "Chicken{" + getId() + ","
                + getBreed() + "," + getBornOn() + ","
                + " isMolting = " + isMolting + "," + " howManyEggIBet = " + howManyEggIBet +'}';
        return chicken;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    /**
     * @return the laidEggs
     */
    public int gethowManyEggIBet() {
        return howManyEggIBet;
    }

    /**
     * @param laidEggs the laidEggs to set
     */
    public void sethowManyEggIBet(int laidEggs) {
        this.howManyEggIBet = laidEggs;
    }

}
