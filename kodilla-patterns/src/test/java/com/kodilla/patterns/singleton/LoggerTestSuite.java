package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger = Logger.INSTANCE;

    @Test
    void testGetLastLog(){

        //Given
        logger.log("plik otwarty");
        //When
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("plik otwarty", lastLog);
    }


}
