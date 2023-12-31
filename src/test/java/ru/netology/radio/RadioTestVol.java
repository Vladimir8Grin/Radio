package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTestVol {

    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setRadioVol(50);

        int expected = 50;
        int actual = radio.getRadioVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio();
        radio.setRadioVol(219);

        int expected = 0;
        int actual = radio.getRadioVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio();
        radio.setRadioVol(-1);

        int expected = 0;
        int actual = radio.getRadioVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio();
        radio.setRadioVol(12);
        radio.setRadioVol(0);


        int expected = 0;
        int actual = radio.getRadioVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        Radio radio = new Radio();
        radio.setRadioVol(1);

        int expected = 1;
        int actual = radio.getRadioVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Radio radio = new Radio();
        radio.setRadioVol(99);

        int expected = 99;
        int actual = radio.getRadioVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        Radio radio = new Radio();
        radio.setRadioVol(100);


        int expected = 100;
        int actual = radio.getRadioVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        Radio radio = new Radio();
        radio.setRadioVol(101);


        int expected = 0;
        int actual = radio.getRadioVol();
        Assertions.assertEquals(expected, actual);
    }
}


