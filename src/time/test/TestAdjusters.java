package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 10);
        DayOfWeek firstDay = date.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
        DayOfWeek lastDay = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDay = " + firstDay);
        System.out.println("lastDay = " + lastDay);
    }
}
