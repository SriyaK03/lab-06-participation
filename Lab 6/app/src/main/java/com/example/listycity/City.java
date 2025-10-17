package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {

    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This a function to get the name of the city
     * @return
     * Returns the name of this city
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This is a function to return the province
     * @return
     * return the province
     */
    String getProvinceName(){
        return this.province;
    }


    /**
     * This compares the name of the String
     * @param o the object to be compared.
     * @return
     * return 0 if the names are the same and 1 if they are not.
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
}
