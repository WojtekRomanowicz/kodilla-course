package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;                         // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;                      // [3]
import org.junit.jupiter.api.Assertions;                                      // [4]
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;                                            // [5]
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;                                                        // [6]
import java.util.Map;                                                            // [7]
import java.util.Random;

import static org.mockito.Mockito.mock;                                          // [8]
import static org.mockito.Mockito.when;                                          // [9]

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite{                                              // [7]

    @Mock
    private Temperatures temperaturesMock;

    public Map<String, Double> temperaturesMapF(){
        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1);

        return temperaturesMap;
    }



    @Test                                                                      // [8]
    void testCalculateForecastWithMock() {                                     // [9]
        //Given
        Map<String, Double> temperaturesMap = temperaturesMapF();

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            // [20]
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);// [11]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                          // [13]
    }

    @Test
    void testGetAverageTemp(){
        //Given
        Map<String, Double> temperaturesMap = temperaturesMapF();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageTemp = 25.56;


        //Then
        Assertions.assertEquals(averageTemp, weatherForecast.getAverageTemp());
    }

    @Test
    void testGetMedianTmp(){
        //Given
        Map<String, Double> temperaturesMap = temperaturesMapF();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double mediana = 25.5;
        double medianaMock = weatherForecast.getMedianTemp();
        //Then
        Assertions.assertEquals(mediana, medianaMock);

    }
}