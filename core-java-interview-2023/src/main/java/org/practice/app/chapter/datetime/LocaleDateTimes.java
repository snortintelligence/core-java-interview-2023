package org.practice.app.chapter.datetime;

import java.time.LocalDate;

public class LocaleDateTimes {

    public static String getDay(String day, String month, String year) {
        LocalDate dt = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt((day)));
        return dt.getDayOfWeek().name();
    }

    public static void main(String[] args) {
        System.out.println(getDay("26" ,"09", "2023"));
    }
}
