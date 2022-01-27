package ru.netology.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;


//конструктор по умолчанию
@NoArgsConstructor

public class Radio {
@Getter
    public int currentStation;
    private int currentVolume;
    private int amountOfStations = 10;
    private final int minStation = 0;
    private int maxStation = 9;
    private final int minVolume = 0;
    private final int maxVolume = 100;


//конструктор когда пользователь не задает кол-во станций, но вводит номер радиостанции с пульта

    public Radio(int currentStation) {
        this.currentStation = currentStation;
    }

// конструктор когда пользователь задает и кол-во станций и вводит номер радиостанции с пульта

    public Radio(int amountOfStations, int currentStation) {
        this.amountOfStations = amountOfStations;
        maxStation = this.amountOfStations - 1;
        this.currentStation = currentStation;
    }

    public void setCurrentStation(int targetStation) {
        if (targetStation < minStation) {
            targetStation = 0;
        }
        if (targetStation > maxStation) {
            targetStation = maxStation;
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
        if (targetVolume >= maxVolume) {
            currentVolume = maxVolume;
            return;
        }

        currentVolume = targetVolume;
    }

    public int addVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
            return currentVolume;
        }

        currentVolume = currentVolume + 1;

        return currentVolume;
    }

    public int dropVolume(int currentVolume) {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
            return currentVolume;
        }

        currentVolume = currentVolume - 1;

        return currentVolume;
    }

}
