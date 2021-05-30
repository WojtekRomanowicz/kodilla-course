package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilghtSearcher {

    Map<String, Boolean> airports = new HashMap<>();

    public void findFilght(Flight flight) throws RouteNotFoundException {

          if(! airports.containsKey(flight.getArrivalAirport())) {
              throw new RouteNotFoundException();
          } else{
              System.out.println("Flight found!");
          }


    }

    public void addFlight(Flight flight){
        airports.put(flight.getArrivalAirport(), true);
        airports.put(flight.getDepartureAirport(), false);
    }

    public void prepareFlightRoute(){
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warsaw", "Barcelona"));
        flightList.add(new Flight("Amsterdam", "New York"));
        flightList.add( new Flight("London", "Dubai"));
        flightList.add(new Flight("Tokio", "Wroclaw"));
        flightList.add(new Flight("Mexico", "Rome"));

        for(Flight flight : flightList){
            addFlight(flight);
        }

    }


}
