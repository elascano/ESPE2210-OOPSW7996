package ec.edu.espe.ObserverPattern.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class CurrentConditionsDisplay implements Observer{
    private float temperature;
    private float humidity;
    private Subject weatherData;
  
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    
    public void display() {
        System.out.println("Current conditions: " + temperature 
        + "F degrees and " + humidity + "% humidity");
    }
}
