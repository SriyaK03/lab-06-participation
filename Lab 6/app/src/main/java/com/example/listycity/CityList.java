package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List <City> getCities() {
        List <City> cityList = cities;
        Collections.sort(cityList);
        return cityList;
    }

    /**
     * This checks if the city is in the list
     * @param city
     * this is the city to be checked
     * @return
     * return true if the city is in the list
     */
    public boolean hasCity( City city){
        return cities.contains(city);
    }
}
