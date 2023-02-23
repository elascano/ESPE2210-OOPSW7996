package ec.edu.espe.Specification.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class NotSpecification implements Specification{
    
    Specification wrapped;

    public NotSpecification(Specification wrapped) {
        this.wrapped = wrapped;
    }
     
    @Override
    public boolean isSatisfiedBy(Object object) {
       return !wrapped.isSatisfiedBy(object);
    }
    
}
