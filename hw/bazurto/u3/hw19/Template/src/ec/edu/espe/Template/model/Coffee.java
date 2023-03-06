
package ec.edu.espe.Template.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 *  @author christopher bazurto, DeltaTeam,DCCO-ESPE
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println( "Dripping coffee through filter");
                
    }

    @Override
    void addCondiments() {
       System.out.println( "Adding sugar and milk" );
    }
    public boolean wantsCondiments() { // a hook operation
        String answer = getUserInput();
        if ( answer.toLowerCase().startsWith( "y" )) {
            return true;
        }
        else { return false; }
    }
    private String getUserInput() {
        String answer = null;
        System.out.println ( "Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in = new BufferedReader ( new InputStreamReader( System.in ));
        // try-catch block
        return answer;
    }
}

