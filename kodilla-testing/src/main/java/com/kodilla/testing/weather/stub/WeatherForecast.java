package com.kodilla.testing.weather.stub;

import java.sql.Array;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double getAverageTemp(){
        double averageTmp = 0;
        int size = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            averageTmp += temperature.getValue() ;
            size++;
        }

        return averageTmp = averageTmp / size;
    }

    public double getMedianTemp(){


        List<Double> mediana = new ArrayList<Double>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            mediana.add(temperature.getValue());

        }
        Collections.sort(mediana);
        double middle ;
        if (mediana.size()%2 == 0) {
            middle = (mediana.get(mediana.size()/2) + mediana.get(mediana.size()/2 - 1)/2);
        } else {
            middle = mediana.get(mediana.size() / 2);
        }

        return middle;
    }
}