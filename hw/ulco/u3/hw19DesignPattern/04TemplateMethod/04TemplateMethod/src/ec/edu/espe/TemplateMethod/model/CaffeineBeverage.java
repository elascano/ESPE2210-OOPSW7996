package ec.edu.espe.TemplateMethod.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public abstract class CaffeineBeverage {

    public void prepareRecipe() { //template method

        boilWater();
        brew();
        pourInCup();

        if (wantsCodiments()) {
            addCondiments();
        }
    }

    public void boilWater() {
        System.out.println("Boiling water");

    }

    public abstract void brew();

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void addCondiments();

    public boolean wantsCodiments() {
        return true;
    }//a hook operation

}
