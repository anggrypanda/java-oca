package com.workingWithInheritance.exPag397;

import java.time.LocalDateTime;

public interface Interviewer {
    void conductInterview();

    default Object submitInterviewStatus() {
        System.out.println("Accept");
        return null;
    }

    static void bookConferenceRoom(LocalDateTime dateTime, int duration) {
        System.out.println("Interview scheduled on: " + dateTime);
        System.out.println("Book conference room for: " + duration + " hours");
    }
}
