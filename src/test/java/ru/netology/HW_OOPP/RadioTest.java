package ru.netology.HW_OOPP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetRadioStation() {
        Radio rad = new Radio();

        rad.setNumberCurrentRadioStation(8);

        int expected = 8;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio rad = new Radio();

        rad.setNumberCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(-1);

        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStationNumber() {
        Radio rad = new Radio();

        rad.maxNumberCurrentRadioStation();

        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(5);

        rad.nextRadioStation();

        int expected = 6;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMoreMaxRadioStation() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(9);

        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(7);

        rad.prevRadioStation();

        int expected = 6;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLessMinStationNumber() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(0);

        rad.prevRadioStation();

        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(54);

        int expected = 54;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxSoundVolume() {
        Radio rad = new Radio();

        rad.maxSoundVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreSoundVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(52);

        rad.increaseVolume();

        int expected = 53;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMaxSoundVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLessSoundVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(48);

        rad.decreaseVolume();

        int expected = 47;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLessMinSoundVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}