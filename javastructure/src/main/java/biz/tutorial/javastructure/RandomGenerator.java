package biz.tutorial.javastructure;

import java.util.Random;

public class RandomGenerator {

    public static int generateYear () {
        Random r = new Random();
        int years = (Math.abs(r.nextInt()) % 198) + 1;

        return 1900 + years;
    }

    public static int generateLeapYear () {
        Random r = new Random();
        int years = (Math.abs(r.nextInt()) % 49) + 1;

        return 1900 + years * 4;
    }

    public static int generateMonth () {
        Random r = new Random();
        return (Math.abs(r.nextInt()) % 12) + 1;
    }

    public static int generateDate(int month) {
        Random r = new Random();

        int maxDays;

        switch (month) {
            case 2:
                maxDays = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
        }

        return (Math.abs(r.nextInt()) % maxDays) + 1;
    }
}
