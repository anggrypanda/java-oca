package com.flowControl.exPag337;

public class IfStatements {
    public static void main(String[] args) {
        int bill = 2000;
        int qty = 10;
        int days = 10;
        int discount = (bill > 1000) ? ((qty > 11) ? 10 : 9) : 5;
        int discount1 = (bill >1000) ?
                            (qty > 11) ?
                                10
                                 : days > 9 ? 20: 30
                            : 5;
        System.out.println(discount);
        System.out.println(discount1);
    }
}
