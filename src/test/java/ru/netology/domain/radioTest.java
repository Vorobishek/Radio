package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(7,3);
        int expected = 3;
        int actual;

        radio.setCurrentStation(radio.currentStation);
        actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationFromRemote() {
        Radio radio = new Radio(3);
        int expected = 3;
        int actual;

        radio.setCurrentStation(radio.currentStation);
        actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationDefault() {
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
        Radio radio = new Radio(10,21);
        int expected = 9;
        int actual;

        radio.setCurrentStation(radio.currentStation);

        actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationFromRemoteMoreMax() {
        Radio radio = new Radio(11);
        int expected = 9;
        int actual;

        radio.setCurrentStation(radio.currentStation);
        actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMoreMaxDefault() {
        Radio radio = new Radio();
        int currentStation = 17;
        int expected = 9;
        int actual;

        radio.setCurrentStation(currentStation);
        actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationLessMinDefault() {
        Radio radio = new Radio();
        int currentStation = -1;
        int expected = 0;
        int actual;

        radio.setCurrentStation(currentStation);
        actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationFromRemoteLessMin() {
        Radio radio = new Radio(-1);
        int expected = 0;
        int actual;

        radio.setCurrentStation(radio.currentStation);
        actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationLessMin() {
        Radio radio = new Radio(4,-1);
        int currentStation = -1;
        int expected = 0;
        int actual;

        radio.setCurrentStation(currentStation);
        actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

     @Test
    public void shouldNextStation(){
        Radio radio = new Radio(8,2);
        int expected = 3;
        int actual;

        radio.setCurrentStation(radio.currentStation);
        actual = radio.nextStation();

        assertEquals(expected,actual);
    }


    @Test
    public void shouldNextStationDefault(){
        Radio radio = new Radio();
        int currentStation = 8;
        int expected = 9;
        int actual;

        radio.setCurrentStation(currentStation);
        actual = radio.nextStation();

        assertEquals(expected,actual);
    }

    @Test
    public void shouldNextStationMax(){
        Radio radio = new Radio(15,14);
        int expected = 0;
        int actual;

        radio.setCurrentStation(radio.currentStation);
        actual = radio.nextStation();

        assertEquals(expected,actual);
    }

    @Test
    public void shouldNextStationMaxDefault(){
        Radio radio = new Radio();
        int currentStation = 9;
        int expected = 0;
        int actual;

        radio.setCurrentStation(currentStation);
        actual = radio.nextStation();

        assertEquals(expected,actual);
    }

    @Test
    public void shouldPrevStation(){
        Radio radio = new Radio(10,5);
        int expected = 4;
        int actual;

        radio.setCurrentStation(radio.currentStation);
        actual = radio.prevStation();

        assertEquals(expected,actual);
    }

    @Test
    public void shouldPrevStationDefault(){
        Radio radio = new Radio();
        int currentStation = 1;
        int expected = 0;
        int actual;

        radio.setCurrentStation(currentStation);
        actual = radio.prevStation();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldPrevStationMin(){
        Radio radio = new Radio(13,0);
        int expected = 12;
        int actual;

        radio.setCurrentStation(radio.currentStation);
        actual = radio.prevStation();

        assertEquals(expected,actual);
    }

    @Test
    public void shouldPrevStationMinDefault(){
        Radio radio = new Radio();
        int currentStation = 0;
        int expected = 9;
        int actual;

        radio.setCurrentStation(currentStation);
        actual = radio.prevStation();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldPrevStationMax(){
        Radio radio = new Radio(3, 2);
        int expected = 1;
        int actual;

        radio.setCurrentStation(radio.currentStation);
        actual = radio.prevStation();

        assertEquals(expected,actual);
    }

    @Test
    public void shouldPrevStationMaxDefault(){
        Radio radio = new Radio();
        int currentStation = 9;
        int expected = 8;
        int actual;

        radio.setCurrentStation(currentStation);
        actual = radio.prevStation();

        assertEquals(expected,actual);
    }

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
        int currentVolume = 101;
        int expected = 100;
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

    @Test
    public void shouldAddVolume(){
        Radio radio = new Radio();
        int currentVolume = 56;
        int expected = 57;
        int actual;

        radio.setCurrentVolume(currentVolume);
        actual = radio.addVolume(currentVolume);

        assertEquals(expected,actual);
    }
    @Test
    public void shouldAddVolumeMax(){
        Radio radio = new Radio();
        int currentVolume = 100;
        int expected = 100;
        int actual;

        radio.setCurrentVolume(currentVolume);
        actual = radio.addVolume(currentVolume);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldAddVolumeMaxMoreThenMax(){
        Radio radio = new Radio();
        int currentVolume = 101;
        int expected = 100;
        int actual;

        radio.setCurrentVolume(currentVolume);
        actual = radio.addVolume(currentVolume);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldDropVolume(){

        Radio radio = new Radio();
        int currentVolume = 67;
        int expected = 66;
        int actual;

        radio.setCurrentVolume(currentVolume);
        actual = radio.dropVolume(currentVolume);

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
        actual = radio.dropVolume(currentVolume);

        assertEquals(expected, actual);
   }

    @Test
    public void shouldDropVolumeMinMoreThenMin(){
        // arrange
        Radio radio = new Radio();
        int currentVolume = -1;
        int expected = 0;
        int actual;

        radio.setCurrentVolume(currentVolume);
        actual = radio.dropVolume(currentVolume);

        assertEquals(expected, actual);
    }

}




