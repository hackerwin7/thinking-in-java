package com.github.hackerwin7.thinking.in.java.chapter.two.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/04/07
 * Time: 6:04 PM
 * Desc:
 */
public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow at = new AllTheColorsOfTheRainbow();
        at.changeTheHueOfTheColor(3);
    }
}
