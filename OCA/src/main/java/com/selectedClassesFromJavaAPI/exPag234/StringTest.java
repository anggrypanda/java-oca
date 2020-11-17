package com.selectedClassesFromJavaAPI.exPag234;

public class StringTest {
    public static void main(String[] args) {
        String day = "SunDday";

        day.replace('D', 'Z').substring(3);
        System.out.println(day);

        day = day.replace('D', 'Z').substring(3);
        System.out.println(day);
    }
}