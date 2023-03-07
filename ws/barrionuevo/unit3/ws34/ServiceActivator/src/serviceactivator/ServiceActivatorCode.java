
package serviceactivator;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */

interface Service {
  void activate();
  void deactivate();
}

class ServiceActivatorCode {
  private Service service;

  public void setService(Service service) {
    this.service = service;
  }

  public void activateService() {
    service.activate();
  }

  public void deactivateService() {
    service.deactivate();
  }
}

class MyService implements Service {
  @Override
  public void activate() {
    // implementation to activate the service
  }

  @Override
  public void deactivate() {
    // implementation to deactivate the service
  }
}


