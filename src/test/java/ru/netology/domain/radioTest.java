package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        int currentStation = 1;
        int expected = 1;
        int actual;

        radio.setCurrentStation(currentStation);
        actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMoreMax() {
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
    public void shouldSetStationLessMin() {
        Radio radio = new Radio();
        int currentStation = -1;
        int expected = 0;
        int actual;

        radio.setCurrentStation(currentStation);
        actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation(){
        Radio radio = new Radio();
        int currentStation = 0;
        int expected = 1;
        int actual;

        actual = radio.nextStation(currentStation);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldNextStationMax(){
        Radio radio = new Radio();
        int currentStation = 9;
        int expected = 0;
        int actual;

        actual = radio.nextStation(currentStation);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldPrevStation(){
        Radio radio = new Radio();
        int currentStation = 3;
        int expected = 2;
        int actual;

        actual = radio.prevStation(currentStation);

        assertEquals(expected,actual);
    }
    @Test
    public void shouldPrevStationMin(){
        Radio radio = new Radio();
        int currentStation = 0;
        int expected = 9;
        int actual;

        actual = radio.prevStation(currentStation);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldPrevStationMax(){
        Radio radio = new Radio();
        int currentStation = 9;
        int expected = 8;
        int actual;

        actual = radio.prevStation(currentStation);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldPrevStationMoreMax(){
        Radio radio = new Radio();
        int currentStation = 16;
        int expected = 0;
        int actual;

        actual = radio.prevStation(currentStation);

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

    @Test
    public void shouldSetVolumeMoreMax() {
        Radio radio = new Radio();
        int currentVolume = 12;
        int expected = 0;
        int actual;

        radio.setCurrentVolume(currentVolume);

        actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLessMin() {
        Radio radio = new Radio();
        int currentVolume = -1;
        int expected = 0;
        int actual;

        radio.setCurrentVolume(currentVolume);

        actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

//    public void shouldGetVolume() {
//
//   }

    @Test
    public void shouldAddVolume(){
        Radio radio = new Radio();
        int currentVolume = 0;
        int expected = 1;
        int actual;

        actual = radio.addVolume(currentVolume);

        assertEquals(expected,actual);
    }
    @Test
    public void shouldAddVolumeMax(){
        Radio radio = new Radio();
        int currentVolume = 10;
        int expected = 10;
        int actual;

        actual = radio.addVolume(currentVolume);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldDropVolume(){

        Radio radio = new Radio();
        int currentVolume = 9;
        int expected = 8;
        int actual;
        radio.setCurrentVolume(currentVolume);

        actual = radio.dropVolume();

        assertEquals(expected,actual);
    }
   @Test
    public void shouldDropVolumeMin(){
        // arrange
        Radio radio = new Radio();
        int currentVolume = 0;
        int expected = 0;
        int actual;

        radio.setCurrentVolume(currentVolume);

       // act
       actual = radio.dropVolume();

       // assert
        assertEquals(expected, actual);
   }

}




