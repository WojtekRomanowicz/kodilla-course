package com.kodillagoodpatterns.FligchtSearchEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchEngine {
    private final ArrayList<Airport> airports = new ArrayList<>();

    public FlightSearchEngine(){ }

    public void addAirport(Airport airport){
        airports.add(airport);
    }

    public List<Airport> findFlight(String departureCityName, String arrivalCityName){
        List<Airport> departureCityAirports = findDepartureFlightsFromCity(departureCityName) ;
        List<Airport> arrivalCityAirports = findArrivalFlightToCity(arrivalCityName);

        List<Airport> findedFlightsFromTo = departureCityAirports.stream()
                .filter(n -> arrivalCityAirports.contains(n)).collect(Collectors.toList());

        return findedFlightsFromTo;
    }

    public List<Airport> findDepartureFlightsFromCity(String cityName){
        List<Airport> departureFlights = airports.stream().filter(t -> t.getCity().equals(cityName))
                .flatMap(n -> n.getDepartures().stream()).collect(Collectors.toList());

        return departureFlights;
    }
    public List<Airport> findArrivalFlightToCity(String cityName){
        Airport arrivalAirport = new Airport(cityName);
        List<Airport> arrivalFlights = airports.stream().filter(n -> n.getDepartures().contains(arrivalAirport))
                .collect(Collectors.toList());

        return arrivalFlights;
    }

}
