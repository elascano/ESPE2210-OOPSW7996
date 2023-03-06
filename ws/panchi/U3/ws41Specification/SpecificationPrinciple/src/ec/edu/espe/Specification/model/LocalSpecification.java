package ec.edu.espe.Specification.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class LocalSpecification implements Specification{
    
    private String location;

    public LocalSpecification(String location) {
        this.location = location;
    }

    @Override
    public boolean isSatisfiedBy(Object object) {
        User user = (User) object;
        return user.getLocation().equals(location);
    } 
}
