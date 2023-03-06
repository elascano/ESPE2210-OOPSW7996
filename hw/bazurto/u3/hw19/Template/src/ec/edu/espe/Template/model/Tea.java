
package ec.edu.espe.Template.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 *  @author christopher bazurto, DeltaTeam,DCCO-ESPE
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println( "Steep the tea" );
    }

    @Override
    void addCondiments() {
        System.out.println( "Adding lemon" );
    }
    @Override
    public boolean wantsCondiments() { // a hook operation
        String answer = getUserInput();
        return answer.toLowerCase().startsWith( "y" );
    }
    private String getUserInput() {
        String answer = null;
        System.out.println ( "Would you like lemon with your tea (y/n)? ");
        BufferedReader in = new BufferedReader ( new InputStreamReader( System.in ));
        // try-catch block
        return answer;
}
    }

