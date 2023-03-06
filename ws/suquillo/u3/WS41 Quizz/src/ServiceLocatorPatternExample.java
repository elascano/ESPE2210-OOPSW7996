import java.util.HashMap;
import java.util.Map;
// Code sourced from OpenAI's ChatGPT
// Copyright OpenAI, 2023
/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
interface Service {
    public void execute();
}

class Service1 implements Service {
    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}

class Service2 implements Service {
    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}

class ServiceLocator {
    private static Map<String, Service> services = new HashMap<>();

    static {
        services.put("Service1", new Service1());
        services.put("Service2", new Service2());
    }

    public static Service getService(String serviceName) {
        return services.get(serviceName);
    }
}

// Client
public class ServiceLocatorPatternExample {
    public static void main(String[] args) {
        Service service1 = ServiceLocator.getService("Service1");
        service1.execute();

        Service service2 = ServiceLocator.getService("Service2");
        service2.execute();
    }
}
