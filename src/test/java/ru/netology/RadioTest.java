package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setUpNumberStation() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(15);
        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingStationUnderMinStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(-1);

        radio.prevStation();
        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCurrentStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(9);

        radio.nextStation();
        int expected = 10;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevCurrentStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(9);

        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increateNextOverMaxStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(20);

        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevUnderMinStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);

        radio.prevStation();
        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingValidVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingPrevMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.nextVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingOverMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);

        radio.nextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingUnderMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.prevVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
