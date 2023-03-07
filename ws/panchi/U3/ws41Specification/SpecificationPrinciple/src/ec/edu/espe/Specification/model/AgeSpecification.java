package ec.edu.espe.Specification.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class AgeSpecification implements Specification{
    
    private int age;

    public AgeSpecification(int age) {
        this.age = age;
    }
    
    @Override
    public boolean isSatisfiedBy(Object object) {
    User user = (User) object;
    return user.getAge() >= age;
    } 
}
