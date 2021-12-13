package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int minStation = 0;
    private final int maxStation = 9;
    private final int minVolume = 0;
    private final int maxVolume = 10;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int targetStation) {
        if (targetStation < minStation) {
            return;
        }
        if (targetStation > maxStation) {
            return;
        }
        this.currentStation = targetStation;
    }

    public int nextStation() {

        if (currentStation < maxStation) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        }
        return this.currentStation;
    }

    public int prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        }
        else {
            currentStation = currentStation - 1;
        }
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int targetVolume) {
        if (targetVolume < minVolume) {
            return;
        }
        if (targetVolume > maxVolume) {
            return;
        }
        this.currentVolume = targetVolume;
    }

    public int addVolume() {
        if (currentVolume == maxVolume) {
            return this.currentVolume = maxVolume;
        }

        this.currentVolume = currentVolume + 1;
        return this.currentVolume;
    }

    public int dropVolume() {
        if (this.currentVolume == minVolume) {
            return currentVolume;
        }

        currentVolume = currentVolume - 1;

        return currentVolume;
    }

}
