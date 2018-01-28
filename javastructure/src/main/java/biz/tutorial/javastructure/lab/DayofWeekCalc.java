package biz.tutorial.javastructure.lab;


import biz.tutorial.javastructure.model.Association;
import biz.tutorial.javastructure.model.SeedDate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DayofWeekCalc {
    static List<Association> map = new ArrayList<>();
    static Map<Integer, String> wdayMap = new HashMap<>();

    static {
        map.add(new Association(1,1));
        map.add(new Association(2,4));
        map.add(new Association(3,4));
        map.add(new Association(4,0));
        map.add(new Association(5,2));
        map.add(new Association(6,5));
        map.add(new Association(7,0));
        map.add(new Association(8,3));
        map.add(new Association(9,6));
        map.add(new Association(10,1));
        map.add(new Association(11,4));
        map.add(new Association(12,6));

        wdayMap.put(1, "Sunday");
        wdayMap.put(2, "Monday");
        wdayMap.put(3, "Tuesday");
        wdayMap.put(4, "Wednesday");
        wdayMap.put(5, "Thursday");
        wdayMap.put(6, "Friday");
        wdayMap.put(0, "Saturday");

    }

    public DayofWeekCalc() {
    }

    private static int getOffset (int month) {
        for (Association pair : map) {
            if (month == (int) pair.getKey()) {
                return (int) pair.getValue();
            }
        }

        return 0;
    }

    public String calcWeekday(int month, int date, int year) {
        SeedDate sDate = new SeedDate(month, date, year);

        int shortYear = sDate.getShortYear();

        int times = shortYear / 4;
        int leap = shortYear % 4;

        int wday = getOffset(sDate.getMonth()) + sDate.getDate() + shortYear + times;

        wday = wday % 7;

        if (leap==0 && sDate.getMonth() < 3) wday = wday==0? 6 : wday-1;

        return wdayMap.get(wday);
    }

}
