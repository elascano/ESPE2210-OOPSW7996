
package serviceactivator;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class ServiceActivator {
    public static void main(String[] args) {
    ServiceActivatorCode activator = new ServiceActivatorCode();
    Service service = new MyService();
    activator.setService(service);
    activator.activateService();
    // Use the service
    activator.deactivateService();
  }
}
