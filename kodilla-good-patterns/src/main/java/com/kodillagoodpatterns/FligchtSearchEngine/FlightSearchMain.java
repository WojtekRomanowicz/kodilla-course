package com.kodillagoodpatterns.FligchtSearchEngine;

public class FlightSearchMain {
    public static void main(String[] args){
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        addAirports(flightSearchEngine);
        String city1 = "Wroclaw";
        String city2 = "Tokio";

        System.out.println("From " + city1 + " are available flights to: ");
        flightSearchEngine.findDepartureFlightsFromCity(city1).stream()
                .map(n -> n.getCity()).forEach(System.out::println);

        System.out.println("To " + city2 + " are available flights from: ");
        flightSearchEngine.findArrivalFlightToCity(city2).stream()
                .map(n -> n.getCity()).forEach(System.out::println);

        System.out.println("To " + city1 + " from " + city2 + " you can fly with transfer in: ");
        flightSearchEngine.findFlight(city1, city2).stream()
                .map(n -> n.getCity()).forEach(System.out::println);
    }

   public static void addAirports(FlightSearchEngine flightSearchEngine){
        Airport airport1 = new Airport("Wroclaw");
        Airport airport2 = new Airport("Dublin");
        Airport airport3 = new Airport("New York");
        Airport airport4 = new Airport("London");
        Airport airport5 = new Airport("Sydney");
        Airport airport6 = new Airport("Berlin");
        Airport airport7 = new Airport("Mexico");
        Airport airport8 = new Airport("Tokio");
        Airport airport9 = new Airport("Sydney");

        flightSearchEngine.addAirport(airport1);
        flightSearchEngine.addAirport(airport2);
        flightSearchEngine.addAirport(airport3);
        flightSearchEngine.addAirport(airport4);
        flightSearchEngine.addAirport(airport5);
        flightSearchEngine.addAirport(airport6);
        flightSearchEngine.addAirport(airport7);
        flightSearchEngine.addAirport(airport8);
        flightSearchEngine.addAirport(airport9);

        airport1.addDeparturesCity(airport2);
        airport1.addDeparturesCity(airport3);
        airport1.addDeparturesCity(airport4);

        airport9.addDeparturesCity(airport1);
        airport9.addDeparturesCity(airport2);
        airport9.addDeparturesCity(airport3);

        airport2.addDeparturesCity(airport6);
        airport2.addDeparturesCity(airport7);
        airport2.addDeparturesCity(airport8);

        airport5.addDeparturesCity(airport3);
        airport5.addDeparturesCity(airport4);
        airport5.addDeparturesCity(airport6);

        airport7.addDeparturesCity(airport8);
        airport7.addDeparturesCity(airport5);
        airport7.addDeparturesCity(airport6);

        airport3.addDeparturesCity(airport7);
        airport3.addDeparturesCity(airport8);
        airport3.addDeparturesCity(airport2);
    }
}
