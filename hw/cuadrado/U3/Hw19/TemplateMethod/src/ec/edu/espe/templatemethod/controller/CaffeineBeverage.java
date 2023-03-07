package ec.edu.espe.templatemethod.controller;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourlnCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }

    //Methods Hook
    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public abstract void brew();

    public void pourlnCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void addCondiments();

    public boolean wantsCondiments() {
        return true;
    }
}
