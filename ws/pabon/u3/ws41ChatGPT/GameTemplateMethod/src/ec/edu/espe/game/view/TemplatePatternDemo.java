package ec.edu.espe.game.view;

import ec.edu.espe.game.model.Game;
import ec.edu.espe.game.model.Football;
import ec.edu.espe.game.model.Cricket;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class TemplatePatternDemo {
   public static void main(String[] args) {

      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();  
      
   }
}


