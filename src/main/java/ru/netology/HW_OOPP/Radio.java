package ru.netology.HW_OOPP;

public class Radio {

    private int numberCurrentRadioStation;             // Текущая радиостанция
    private int currentVolume;                         // Текущая громкость

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation > 9) {
            return;
        }
        if (newNumberCurrentRadioStation < 0) {
            newNumberCurrentRadioStation = 9;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void maxNumberCurrentRadioStation() {
        numberCurrentRadioStation = 9;
    }

    public void nextRadioStation() {
        if (numberCurrentRadioStation >= 9) {
            numberCurrentRadioStation = 0;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        }
    }

    public void prevRadioStation() {
        if (numberCurrentRadioStation <= 0) {
            numberCurrentRadioStation = 9;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        }
    }

    public void maxSoundVolume() {
        currentVolume = 100;
    }

    public void increaseVolume() {
        if (currentVolume >= 100) {
            currentVolume = 100;
        }
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

