package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    int minStation = 0;
    int maxStation = 9;
    int minVolume = 0;
    int maxVolume = 10;

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

    public int nextStation(int targetStation) {
        if (targetStation < maxStation) {
            this.currentStation = targetStation + 1;
        }
        if (targetStation == maxStation) {
            this.currentStation = minStation;
        }
        return this.currentStation;
    }

    public int prevStation(int targetStation) {
        if (targetStation == minStation) {
            this.currentStation = maxStation;
        }
        if (targetStation <= maxStation && targetStation > minStation) {
            this.currentStation = targetStation - 1;
        }
        return this.currentStation;
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

    public int addVolume(int targetVolume) {
        if (targetVolume == maxVolume) {
            return this.currentVolume = maxVolume;
        }

        this.currentVolume = targetVolume + 1;
        return this.currentVolume;
    }

    public int dropVolume() {
        if (this.currentVolume == minVolume) {
            return this.currentVolume;
        }

        this.currentVolume = this.currentVolume - 1;

        return this.currentVolume;
    }

}
