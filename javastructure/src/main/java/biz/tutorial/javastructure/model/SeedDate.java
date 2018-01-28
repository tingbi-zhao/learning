package biz.tutorial.javastructure.model;

public class SeedDate {
    int year;
    int month;
    int date;

    public SeedDate(int m, int d, int y) {
        month = m;
        date = d;
        year = y;
    }

    public int getYear() {
        return year;
    }

    public int getShortYear() {
        return year - 1900;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }
}
