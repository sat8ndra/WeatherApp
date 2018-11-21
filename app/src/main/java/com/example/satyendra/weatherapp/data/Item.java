package com.example.satyendra.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by satyendra on 1/3/2018.
 */

public class Item implements JsonPopulator {
    private Condition condition;

    public Condition getCondition() {
        return condition;
    }

    @Override
    public void populate(JSONObject data) {
        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));

    }
}
