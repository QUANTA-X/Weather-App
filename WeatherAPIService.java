import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class WeatherAPIService {
    private static final String API_KEY = "2930539f7a7d16cdfe0b280b8ddbf1ee"; 
    private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather?q=";
    private static final String FORECAST_URL = "http://api.openweathermap.org/data/2.5/forecast?q=";

    // Method to get current weather data for a location
    public static JSONObject getWeather(String location) throws Exception {
        String urlString = WEATHER_URL + location + "&appid=" + API_KEY;
        return getJSONResponse(urlString);
    }

    // Method to get forecast data for a location
    public static JSONObject getForecast(String location) throws Exception {
        String urlString = FORECAST_URL + location + "&appid=" + API_KEY;
        return getJSONResponse(urlString);
    }

    // Helper method to connect to the API and return JSON response
    private static JSONObject getJSONResponse(String urlString) throws Exception {
        URL url = URI.create(urlString).toURL();  // Convert URI to URL
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        
        return new JSONObject(response.toString());
    }
}
