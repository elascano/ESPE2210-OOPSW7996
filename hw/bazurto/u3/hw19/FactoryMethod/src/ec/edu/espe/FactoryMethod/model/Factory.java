
package ec.edu.espe.FactoryMethod.model;
/**
 *
 *  @author christopher bazurto, DeltaTeam,DCCO-ESPE
 */
public abstract class Factory {

    public Factory() {
        protected abstract connection createConnection(String type); //Factory method
    }
}
