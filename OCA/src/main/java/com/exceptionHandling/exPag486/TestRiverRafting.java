package com.exceptionHandling.exPag486;

public class TestRiverRafting {
    public static void main(String[] args) {
        RiverRafting riverRafting = new RiverRafting();
        try {
            riverRafting.crossRapid(7);
            riverRafting.rowRaft("happy");
            System.out.println("Enjoy river rafting");
        } catch (FallInRiverException e1) {
            System.out.println("Get back in the raft");
        } catch (DropOarException e2) {
            System.out.println("Do not panic");
        } finally {
            System.out.println("Pay for the sport");
        }
        System.out.println("After the try block");
    }
}
