package c322.Homeworks.homework2;

class WeatherStation {
//    private WeatherData NewWeather;
//    public void setWeatherData(float temperature, float humidity, float pressure) {
//        NewWeather = new WeatherData(temperature, humidity, pressure);
//    }
//
//    public float getTemperature() {
//        return NewWeather.getTemperature();
//    }
//
//    public float getHumidity() {
//        return NewWeather.getHumidity();
//    }
//
//    public float getPressure() {
//        return NewWeather.getPressure();
//    }
    private WeatherData currentWeather;
    private CurrentConditionsDisplay currentConditionsDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecast;
    public void setWeatherData(float temperature, float humidity, float pressure) {
        currentWeather = new WeatherData(temperature, humidity, pressure);
        currentWeather.setMeasurements(temperature, humidity, pressure);
        currentConditionsDisplay = new CurrentConditionsDisplay();
        statisticsDisplay = new StatisticsDisplay();
        forecast = new ForecastDisplay();
        currentConditionsDisplay.update(currentWeather);
        statisticsDisplay.update(currentWeather);
        forecast.update(currentWeather);
    }
}
public class WeatherData {
    //    private float Temperature;
//    private float Humidity;
//    private float Pressure;
//    static float Min = 0, Max = 0, Avg = 0;
//    static int counter = 0;
//    static int size = 3;
//    static String comment;
//    public WeatherData(float Temperature, float Humidity, float Pressure) {
//        this.Temperature = Temperature;
//        this.Humidity = Humidity;
//        this.Pressure = Pressure;
//    }
//    public float getTemperature(){
//        return Temperature;
//    }
//    public float getHumidity(){
//        return Humidity;
//    }
//    public float getPressure(){
//        return Pressure;
//    }
//    public void measurementsChanged(){
//        counter = counter + 1;
//        if(Max < getTemperature()){
//            Max = Temperature;
//        }
//        if (Min > getTemperature()){
//            Min = getTemperature();
//        }
//        Avg = (Avg + getTemperature()) / counter;
//
//    }
    private float temperature;
    private float humidity;
    private float pressure;
    private float minTemperature;
    private float maxTemperature;
    private float totalTemperature;
    private int numReadings;
    public WeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.minTemperature = temperature;
        this.maxTemperature = temperature;
        this.totalTemperature = temperature;
        this.numReadings = 1;
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.totalTemperature += temperature;
        this.numReadings++;
        if (temperature > maxTemperature) {
            this.maxTemperature = temperature;
        }
        if (temperature < minTemperature) {
            this.minTemperature = temperature;
        }
    }
    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
    public float getMinTemperature() {
        return minTemperature;
    }
    public float getMaxTemperature() {
        return maxTemperature;
    }
    public float getAvgTemperature() {
        return totalTemperature / numReadings;
    }
}
class CurrentConditionsDisplay {
    private WeatherData weatherData;
    public void update(WeatherData weatherData) {
        this.weatherData = weatherData;
        display();
    }
    public void display() {
        System.out.println("Current conditions: " + weatherData.getTemperature() + "F degrees and " +
                weatherData.getHumidity() + "% humidity");
    }
}
class StatisticsDisplay {
    private WeatherData weatherData;
    public void update(WeatherData weatherData) {
        this.weatherData = weatherData;
        display();
    }
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + weatherData.getAvgTemperature() + "/" +
                weatherData.getMaxTemperature() + "/" + weatherData.getMinTemperature());
    }
}
class ForecastDisplay {
    private WeatherData weatherData;
    private String forecast;
    public void update(WeatherData weatherData) {
        this.weatherData = weatherData;

        if(weatherData.getTemperature() >= 80){
            forecast = "Improving weather on the way!";
        }
        else if(weatherData.getTemperature() > 50){
            forecast = "Watch out for cooler, rainy weather";
        }
        else{
            forecast = "More of the same";
        }
        display();
    }
    public void display() {
        System.out.println("Forecast: " + forecast);
    }
}
//class Display extends {
//    public static void main(String[] args) {
//        String[] display = new String[3];
//        display[0] = "Current Conditions: " + get + "F degrees and " + Humidity + "% humidity";
//        display[1] = "Abg/Max/Min temperature = " + Avg + Max + Min;
//        display[2] = "Forecast: " + comment;
//
//        size = size + 1;
//        String[] NewDisplay = new String [size];
//        for(int i = 0; i < size; i++){
//            NewDisplay[i] = display[i];
//        }
//        Scanner AddComment = new Scanner(System.in);
//        String NewComment = AddComment.nextLine();
//        NewDisplay[size - 1] = NewComment;
//    }
//}
class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.setWeatherData(80.0f, 65.0f, 30.4f);
    }
}
