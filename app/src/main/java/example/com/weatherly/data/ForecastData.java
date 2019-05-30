package example.com.weatherly.data;


import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import example.com.weatherly.controller.AppController;
import example.com.weatherly.model.Forecast;

public class ForecastData {

    ArrayList<Forecast> forecastArrayList = new ArrayList<>();

    String url = "https://query.yahooapis.com/v1/public/yql?q=select*from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22spokane wa%22)&format=json&diagnostics=true&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=";


    public void getForecast(final ForecastListAsyncResponse callback) {
        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET,
                url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {

                    JSONObject query = response.getJSONObject("query");
                    JSONObject results = query.getJSONObject("results");
                    JSONObject channel = results.getJSONObject("channel");
                    JSONObject location = channel.getJSONObject("location");


                    JSONObject itemObject = channel.getJSONObject("item");

                    JSONObject conditionObject = itemObject.getJSONObject("condition");
//                    forecast.setDate(conditionObject.getString("date"));
//                    forecast.setCurrentTemperature(conditionObject.getString("temp"));
//                    forecast.setForecastWeatherDescription(conditionObject.getString("text"));

                    JSONArray forecastArray = itemObject.getJSONArray("forecast");
                    for (int i = 0; i < forecastArray.length(); i++) {
                        Forecast forecast = new Forecast();

                        JSONObject forecastObject = forecastArray.getJSONObject(i);

                        forecast.setForecastDate(forecastObject.getString("date"));
                        forecast.setForecastDay(forecastObject.getString("day"));
                        forecast.setForecastHighTemp(forecastObject.getString("high"));
                        forecast.setForecastWeatherDescription(forecastObject.getString("text"));

                        forecastArrayList.add(forecast);
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                } if ( callback != null) {
                    callback.processFinished(forecastArrayList);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.d("Error:",  error.getMessage());
            }
        });

        AppController.getInstance().addToRequestQueue(jsonObjectRequest);

    }
}
