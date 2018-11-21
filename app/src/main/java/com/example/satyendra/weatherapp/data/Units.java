package com.example.satyendra.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by satyendra on 1/3/2018.
 */

public class Units implements JsonPopulator {
    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {
        temperature = data.optString("temperature");

    }
}
