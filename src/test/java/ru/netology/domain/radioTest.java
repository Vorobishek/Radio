package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    @Test

    public void shouldSetStation() {
        Radio radio = new Radio();
        int currentStation = 17;
        int expected = 1;
        int actual = 0;

    //    assertNull(radio.getCurrentStation());
        radio.setCurrentStation(currentStation);


        actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }

    public void shouldGetStation() {

    }

    public void shouldSetVolume(){
        Radio radio = new Radio();
        radio.currentVolume = 1;
        int expexted = 1;
        int actual = 0;

        actual = radio.getCurrentVolume();

        assertEquals(expexted, actual);
    }

    public void shouldGetVolume(){

    }
}




