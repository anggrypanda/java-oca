package com.flowControl.exPag341;

public class SwitchStatements {
    public static void main(String[] args) {
        String day = new String("SUN");
        switch (day){
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
                System.out.println("Time to work!");
                break;
            case "FRI":
                System.out.println("Nearing weekend");
                break;
            case "SAT":
            case "SUN":
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Invalid day?");
        }

        System.out.println("-----");

        long dayCount = 31;
        switch ((int) dayCount){
            case 28:
            case 29:
                System.out.println("Feb");
                break;
            case 30:
                System.out.println("Apr");
                break;
            case 31:
                System.out.println("Jan");
                break;
        }

        System.out.println("-----");

        int number = 44;
        String size;

        switch (number) {
            case 36:
                size = "Small";
                break;
            case 38:
                size = "Medium";
                break;
            case 40:
                size = "Large";
                break;
            case 42:
                size = "Extra Large";
                break;
            default:
                size = "Unknown";
                break;
        }
        System.out.println("Size: " + size);
    }
}
