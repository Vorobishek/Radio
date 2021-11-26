package ru.netology.domain;

public class Radio {
    public int currentStation;
    public int currentVolume;
    int minStation = 0;
    int maxStation = 9;
    int minVolume = 0;
    int maxVolume = 10;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int nextStation(int currentStation){
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 9){
            currentStation = 0;
        }
        this.currentStation = currentStation;
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume){
            return;
        }
        if (currentVolume > maxVolume){
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int addVolume(int currentVolume){
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }


}
