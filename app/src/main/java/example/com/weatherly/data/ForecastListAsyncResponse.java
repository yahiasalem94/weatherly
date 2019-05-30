package example.com.weatherly.data;

import java.util.ArrayList;

import example.com.weatherly.model.Forecast;

public interface ForecastListAsyncResponse {
    void processFinished(ArrayList<Forecast> forecastArrayList);
}
