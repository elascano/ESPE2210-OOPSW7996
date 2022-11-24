
package encapsulationandabstraction.view;

import encapsulationandabstraction.model.Chicken;

/**
 *
 * @author Karla Ansatuña
 */
public class ChickenFarm {
    public static void main (String[] args){
        System.out.println("==============");
        System.out.println("Karla Ansatuña");
        Chicken chicken;
        chicken= new Chicken();
        chicken.setId(1);
        chicken.setAge(0);
        chicken.setColor("");
        chicken.setMolting(false);
        System.out.println("chicken --> "+chicken);
        chicken.doStuff(4);
        System.out.println("==============");
        //solo atravez de las clases publicas
 
    }
}
