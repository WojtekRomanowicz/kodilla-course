package com.kodilla.patterns.strategy.social;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User milenials = new Millenials("Adam");
        User oldGuy = new YGeneration("Janusz");
        User youngGirl = new ZGeneration("Ada");

        //When
        String milenialsUse = milenials.sharePost();
        System.out.println("Milenials for share post " + milenialsUse);
        String oldGuyUse = oldGuy.sharePost();
        System.out.println("People from YGeneration for share post " + oldGuyUse);
        String youngerUse = youngGirl.sharePost();
        System.out.println("People from ZGeneration for share post " + youngerUse);

        //Then
        assertEquals("use Facebook", milenialsUse);
        assertEquals("use Twitter", oldGuyUse);
        assertEquals("use Snapchat", youngerUse);

    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User adam = new Millenials("Adam");

        //When
        String adamUse = adam.sharePost();
        System.out.println("Adam from milenials generetion should for share post " + adamUse);
        adam.setSocialPublisher(new SnapchatPublisher());
        adamUse = adam.sharePost();
        System.out.println("But Adam like make short video so he " + adamUse);

        //Then
        assertEquals("use Snapchat", adamUse);

    }
}
