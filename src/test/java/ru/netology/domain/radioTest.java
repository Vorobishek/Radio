package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    @Test

    public void shouldSetStation() {
        Radio radio = new Radio();
        int currentStation = 17;
        int expected = 0;
        int actual;

        //    assertNull(radio.getCurrentStation());
        radio.setCurrentStation(currentStation);


        actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation(){
        Radio radio = new Radio();
        int currentStation = 9;
        int expected = 0;
        int actual;

       // currentStation = radio.getCurrentStation();
        actual = radio.nextStation(currentStation);

        assertEquals(expected,actual);
    }

    //   public void shouldGetStation() {

    //   }
    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        int currentVolume = 3;
        int expected = 3;
        int actual;

        radio.setCurrentVolume(currentVolume);

        actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    public void shouldGetVolume() {

    }

    @Test
    public void shouldAddVolume(){
        Radio radio = new Radio();
        int currentVolume = 10;
        int expected = 10;
        int actual;

        actual = radio.addVolume(currentVolume);

        assertEquals(expected,actual);
    }
}




