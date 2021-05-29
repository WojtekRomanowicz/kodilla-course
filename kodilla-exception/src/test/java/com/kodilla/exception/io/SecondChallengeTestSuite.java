package com.kodilla.exception.io;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

public class SecondChallengeTestSuite {

    @Test
    void testSecondChallenge(){

        //Given
        SecondChallenge challenge = new SecondChallenge();
        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(1, 1.5)),
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(2, 2)),
                () -> assertDoesNotThrow(() -> challenge.probablyIWillThrowException(1, 5))
        );
    }


}
