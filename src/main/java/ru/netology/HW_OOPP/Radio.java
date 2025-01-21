package ru.netology.HW_OOPP;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int maxNumberRadioStation = 9;
    private int minNumberRadioStation = 0;
    private int numberCurrentRadioStation = minNumberRadioStation;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int currentVolume = minSoundVolume;


    public Radio(int size) {
        maxNumberRadioStation = minNumberRadioStation + size - 1;
        maxSoundVolume = minSoundVolume + size;
    }


    public int getMaxSoundVolume() {
        return maxNumberRadioStation;
    }

    public int getMinSoundVolume() {
        return minNumberRadioStation;
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation > maxNumberRadioStation) {
            return;
        }
        if (newNumberCurrentRadioStation < minNumberRadioStation) {
            newNumberCurrentRadioStation = maxNumberRadioStation;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxSoundVolume) {
            newCurrentVolume = maxSoundVolume;
        }
        if (newCurrentVolume < minSoundVolume) {
            newCurrentVolume = minSoundVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void maxNumberCurrentRadioStation() {
        numberCurrentRadioStation = maxNumberRadioStation;
    }

    public void nextRadioStation() {
        if (numberCurrentRadioStation >= maxNumberRadioStation) {
            numberCurrentRadioStation = minNumberRadioStation;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        }
    }

    public void prevRadioStation() {
        if (numberCurrentRadioStation <= minNumberRadioStation) {
            numberCurrentRadioStation = maxNumberRadioStation;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        }
    }

    public void maxSoundVolume() {
        currentVolume = maxSoundVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= maxSoundVolume) {
            currentVolume = currentVolume;
        }
        if (currentVolume < maxSoundVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= minSoundVolume) {
            currentVolume = currentVolume;
        }
        if (currentVolume > minSoundVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}

