package example.com.weatherly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import example.com.weatherly.data.ForecastData;
import example.com.weatherly.data.ForecastListAsyncResponse;
import example.com.weatherly.model.Forecast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ForecastData forecastData = new ForecastData();
        forecastData.getForecast(new ForecastListAsyncResponse() {
            @Override
            public void processFinished(ArrayList<Forecast> forecastArrayList) {

                for (int i = 0; i < forecastArrayList.size(); i++) {

                }
            }
        });
    }
}
