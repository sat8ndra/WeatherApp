package com.example.satyendra.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by satyendra on 1/3/2018.
 */

/**
 * YQL Query Language: select * from weather.forecast where woeid in (select woeid from geo.places(1) where text="nome, ak")
 */


public class Channel implements JsonPopulator{
    private Units unit;
    private Item item;

    public Units getUnit() {
        return unit;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public void populate(JSONObject data) {
        unit = new Units();
        unit.populate(data.optJSONObject("units"));

        item = new Item();
        item.populate(data.optJSONObject("item"));

    }


}
