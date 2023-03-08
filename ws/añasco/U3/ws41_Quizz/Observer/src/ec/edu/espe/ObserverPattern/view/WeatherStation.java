package ec.edu.espe.ObserverPattern.view;

import ec.edu.espe.ObserverPattern.model.CurrentConditionsDisplay;
import ec.edu.espe.ObserverPattern.model.WeatherData;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = 
        new CurrentConditionsDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);
    }
}
