package ru.netology.domain;

public class Radio {
    public int currentStation = 1;
    int currentVolume;
    int minStation = 1;
    int maxStation = 9;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation){
            return;
        }
        if (currentStation > maxStation){
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}
