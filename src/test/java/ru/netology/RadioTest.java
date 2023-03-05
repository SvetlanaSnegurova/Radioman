package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setUpNumberStation() {
        ru.netology.Radio radio = new ru.netology.Radio();

        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingStationUnderMinStation() {
        ru.netology.Radio radio = new ru.netology.Radio();

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingStationOverMaxStation() {
        ru.netology.Radio radio = new ru.netology.Radio();

        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCurrentStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(8);

        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevCurrentStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(9);

        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increateNextOverMaxStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(10);

        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevUnderMinStation() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentStation(0);

        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingValidVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingPrevMinVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(-1);

        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCurrentVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(8);

        radio.nextVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingOverMaxVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(11);

        radio.nextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingUnderMinVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(0);

        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevCurrentVolume() {
        ru.netology.Radio radio = new ru.netology.Radio();
        radio.setCurrentVolume(8);

        radio.prevVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
