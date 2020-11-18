package com.flowControl.exPag359;

public class WhileStatements {
    public static void main(String[] args) {
        int num = 9;
        boolean divBy7 = false;

        while (!divBy7) {
            System.out.println(num);
            if (num % 7 == 0)
                divBy7 = true;
            --num;
        }

        System.out.println("-----");

        int num1 = 9;
        boolean divBy5 = false;

        do {
            System.out.println(num1);
            if (num1 % 5 == 0)
                divBy5 = true;
            num1 --;
        } while (divBy5 == false);

        System.out.println("-----");

        int num2 = 10;
        int num3;

        do {
            num2++;
            num3 = num2;
        } while (++num2 > 20);

        while (++num3 > 20)
            num3++;
        System.out.println(num2 + " " + num3);
    }
}
