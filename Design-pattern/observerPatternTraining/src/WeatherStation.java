
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        @SuppressWarnings("unused")
        CurrentConditionsDisplay currentDisplay1 = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay currentDisplay2 = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(15, 30);
        
        weatherData.deleteObserver(currentDisplay2);
        
        weatherData.setMeasurements(20, 40);
        
        weatherData.addObserver(currentDisplay2);
        
        weatherData.setMeasurements(10, 40);
    }
}
