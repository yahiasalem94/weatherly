package example.com.weatherly.model;

import java.io.Serializable;

public class Forecast implements Serializable {

    private String city;
    private String Country;
    private String region;

    private String date;
    private String currentTemperature;
    private String weatherDecription;

    private String forecastDate;
    private String forecastDay;
    private String forecastHighTemp;
    private String forecastLowTemp;
    private String forecastWeatherDescription;

    private String descriptionHTML;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(String currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public String getWeatherDecription() {
        return weatherDecription;
    }

    public void setWeatherDecription(String weatherDecription) {
        this.weatherDecription = weatherDecription;
    }

    public String getForecastDate() {
        return forecastDate;
    }

    public void setForecastDate(String forecastDate) {
        this.forecastDate = forecastDate;
    }

    public String getForecastDay() {
        return forecastDay;
    }

    public void setForecastDay(String forecastDay) {
        this.forecastDay = forecastDay;
    }

    public String getForecastHighTemp() {
        return forecastHighTemp;
    }

    public void setForecastHighTemp(String forecastHighTemp) {
        this.forecastHighTemp = forecastHighTemp;
    }

    public String getForecastLowTemp() {
        return forecastLowTemp;
    }

    public void setForecastLowTemp(String forecastLowTemp) {
        this.forecastLowTemp = forecastLowTemp;
    }

    public String getForecastWeatherDescription() {
        return forecastWeatherDescription;
    }

    public void setForecastWeatherDescription(String forecastWeatherDescription) {
        this.forecastWeatherDescription = forecastWeatherDescription;
    }

    public String getDescriptionHTML() {
        return descriptionHTML;
    }

    public void setDescriptionHTML(String descriptionHTML) {
        this.descriptionHTML = descriptionHTML;
    }
}
