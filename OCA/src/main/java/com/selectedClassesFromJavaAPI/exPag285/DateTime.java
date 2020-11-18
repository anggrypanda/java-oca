package com.selectedClassesFromJavaAPI.exPag285;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(9, 10, 0);
        LocalDate date = LocalDate.of(2020, 11, 18);
        LocalDateTime dateTime = time.atDate(date);
        System.out.println(dateTime);

        System.out.println("-----");

        LocalDateTime ceremony = LocalDateTime.parse("2021-01-08T10:00:00");
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("The date and time of the ceremony is " + ceremony);
        if (ceremony.getMonthValue() == 1)
            System.out.println("Can't attend.");
        else
            System.out.println("Can attend!");

        LocalDateTime specialGuestDeparture = LocalDateTime.parse("2021-01-08T10:30:00");
        if (ceremony.plusHours(2).isAfter(specialGuestDeparture))
            System.out.println("Special guest will be leaving before the ceremony is over.");
        LocalDateTime eventMngArrival = LocalDateTime.of(2021, 1, 8, 10, 30, 0);
        if (eventMngArrival.isAfter(ceremony.minusHours(3)))
            System.out.println("Manager is supposed to arrive 3 hours earlier.");

        System.out.println("-----");

        LocalDateTime dateTime2 = LocalDateTime.parse("2021-01-31T10:37:00");
        System.out.println("DATE: " + dateTime2);
        System.out.println("Substract 4 weeks: " + dateTime2.minus(Period.ofWeeks(4)));
        System.out.println("Add 1 month: " + dateTime2.plus(Period.ofMonths(1)));

        LocalDateTime d1 = dateTime2.plus(Period.ofYears(3));
        LocalDateTime d2 = d1.plus(Period.ofMonths(1));

        LocalDateTime d3 = dateTime2.plus(Period.ofMonths(1));
        LocalDateTime d4 = d3.plus(Period.ofYears(3));

        System.out.println("Add 3 years: " + d1);
        System.out.println("Add 1 month, then add 3 years: " + d4);
        System.out.println("Add 3 years, then add 1 month: " + d2);

        System.out.println("-----");

        Period per10Days = Period.of(0, 0, 10);
        Period per1Month = Period.of(0, 1, 0);

        System.out.println(per10Days.minus(per1Month));
        System.out.println(per10Days.minusDays(5));
        System.out.println(per10Days.minusMonths(5));
        System.out.println((per10Days.minusYears(5)).minusDays(20));

        System.out.println("-----");

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        LocalDate date1 = LocalDate.of(2020, 11, 18);
        System.out.println(formatter.format(date1));
    }
}