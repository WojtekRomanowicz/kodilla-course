package com.kodillagoodpatterns.FligchtSearchEngine;

import java.util.ArrayList;

public final class Airport {
    private final String city;
    private final ArrayList<Airport> departures = new ArrayList<>();

    public Airport(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public ArrayList<Airport> getDepartures() {
        return departures;
    }

    public void addDeparturesCity(Airport departureCity){
        departures.add(departureCity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return city.equals(airport.getCity());
    }

    @Override
    public int hashCode() {
        return city.hashCode();
    }
}
