package biz.tutorial.javastructure.lab;

import biz.tutorial.javastructure.RandomGenerator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.testng.Assert.assertEquals;

public class DayofWeekCalcTest {

    DayofWeekCalc testCalc = new DayofWeekCalc();

    @BeforeMethod
    public void setUp() throws Exception {
    }

    @Test
    public void testDayofWeekTiger() {

        String dow = testCalc.calcWeekday(12, 30, 1975);

        assert dow.equals("Tuesday");

        dow = testCalc.calcWeekday(2, 1, 1928);

        assertEquals(dow, "Wednesday");

        dow = testCalc.calcWeekday(2, 23, 2080);

        assertEquals(dow, "Wednesday");
    }

    @Test
    public void testDayofWeekCalc() throws ParseException {
        for(int i=0; i<100; i++) {
            int year = RandomGenerator.generateLeapYear();
            int month = RandomGenerator.generateMonth();
            int date = RandomGenerator.generateDate(month);

            System.out.printf("Generated date: %1$d/%2$d/%3$d %n", month, date, year);

            String dow = testCalc.calcWeekday(month, date, year);
            System.out.printf("Its weekday is a %s \n", dow);

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date fullDate = dateFormat.parse(String.format("%1$d/%2$d/%3$d", year, month, date));
            dateFormat = new SimpleDateFormat("EEEE");
            String sysDow = dateFormat.format(fullDate);

            assertEquals(dow, sysDow);
        }
    }
}