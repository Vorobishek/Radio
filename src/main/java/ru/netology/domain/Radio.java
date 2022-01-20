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
        currentStation = targetStation;
    }

    public int nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
        return currentStation;

    }

    public int prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
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

        currentVolume = targetVolume;
    }

    public int addVolume() {
        if (currentVolume == maxVolume) {
            return currentVolume;
        }

        currentVolume = currentVolume + 1;

        return currentVolume;
    }

    public int dropVolume() {
        if (currentVolume == minVolume) {
            return currentVolume;
        }

        currentVolume = currentVolume - 1;

        return currentVolume;
    }

}
