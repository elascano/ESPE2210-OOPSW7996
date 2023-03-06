package ec.edu.espe.Specification.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class OrSpecification implements Specification {
    
    Specification one;
    Specification other;

    public OrSpecification(Specification one, Specification other) {
        this.one = one;
        this.other = other;
    }
    @Override
    public boolean isSatisfiedBy(Object object) {
        return one.isSatisfiedBy(object) || other.isSatisfiedBy(object);
    }
    
}
