
package ec.edu.espe.hw12project.model;

import java.util.ArrayList;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class Service {
    
    private int id;
    private String name;
    private int qualityOfService;

    @Override
    public String toString() {
        return "Service{" + "id=" + id + ", Name=" + name + ", QualityOfService=" + qualityOfService + '}';
    }
    
    public Service(int id, String name, int qualityOfService) {
        this.id = id;
        this.name = name;
        this.qualityOfService = qualityOfService;
    }
    
    public Service() {
        id = 0;
        name = "";
        qualityOfService = 0;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the qualityOfService
     */
    public int getQualityOfService() {
        return qualityOfService;
    }

    /**
     * @param qualityOfService the qualityOfService to set
     */
    public void setQualityOfService(int qualityOfService) {
        this.qualityOfService = qualityOfService;
    }
    
    public static Service toCourse(Object[] serviceList) {
        Service service;

        if (serviceList == null) {
            return null;
        }

        service = new Service((Integer) serviceList[1], (String) serviceList[2], (Integer) serviceList[3]);

        return service;
    }

    public static ArrayList read(ArrayList<Object> servicesList) {
        ArrayList<Service> services;
        Object[] serviceList;

        services = new ArrayList<>();

        for (int i = 0; i < servicesList.size(); i++) {
            serviceList = (Object[]) servicesList.get(i);
            services.add(toCourse(serviceList));
        }

        return services;
    }
}
