package ec.edu.espe.Specification.view;

import ec.edu.espe.Specification.model.AgeSpecification;
import ec.edu.espe.Specification.model.AndSpecification;
import ec.edu.espe.Specification.model.LocalSpecification;
import ec.edu.espe.Specification.model.Specification;
import ec.edu.espe.Specification.model.User;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class SpecificationPattern {
    public static void main(String[] args) {
        
        User user = new User(30, "USA");

        Specification ageSpecification = new AgeSpecification(20);
        Specification locationSpecification = new LocalSpecification("USA");

        Specification ageAndLocationSpecification = new AndSpecification(ageSpecification, locationSpecification);

        System.out.println(ageAndLocationSpecification.isSatisfiedBy(user));
    }
}
