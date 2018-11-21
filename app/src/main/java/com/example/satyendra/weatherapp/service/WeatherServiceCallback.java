package com.example.satyendra.weatherapp.service;

import com.example.satyendra.weatherapp.data.Channel;

/**
 * Created by satyendra on 1/3/2018.
 */

public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
