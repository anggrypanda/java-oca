package com.exceptionHandling.exPag486;

public class RiverRafting {
    void crossRapid(int degree) throws FallInRiverException {
        System.out.println("Cross Rapid");
        if (degree > 10)
            throw new FallInRiverException();
    }

    void rowRaft(String state) throws DropOarException {
        System.out.println("Row Raft");
        if (state.equals("nervous"))
            throw new DropOarException();
    }
}
