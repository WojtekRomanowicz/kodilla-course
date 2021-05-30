package com.kodilla.exception.test;

import java.util.List;

public class FlightSearcherRunner {
    public static void main(String[] args) {

        FilghtSearcher flightSearcher = new FilghtSearcher();
        flightSearcher.prepareFlightRoute();
        Flight flight1 = new Flight("Amsterdam", "New York");
        Flight flight2 = new Flight("Sandomierz", "Radom");

        try {
            flightSearcher.findFilght(flight1);
        } catch (RouteNotFoundException e) {
           System.out.println("Flight doesn't exist");
        }

        try {
            flightSearcher.findFilght(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight doesn't exist");
        }

    }
}
