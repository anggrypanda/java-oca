package com.workingWithInheritance.exPag397;

import java.time.LocalDateTime;

public class Office {
    public static void main(String[] args) {
        Interviewer[] interviewers = new Interviewer[]{
                new Manager(),
                new HRExecutive(),
        };

        for (Interviewer interviewer : interviewers) {
            if (interviewer instanceof Manager) {
                int teamSize = (((Manager) interviewer).teamSize);
                if (teamSize > 10) {
                    interviewer.conductInterview();
                } else {
                    System.out.println("Manager can't interview if team size < 10");
                }
            } else if (interviewer instanceof HRExecutive) {
                interviewer.conductInterview();
            }
        }

        Programmer prg = new Programmer();
        Manager mng = new Manager();
        HRExecutive hr = new HRExecutive();
        hr.name = "Hr Maria";
        hr.specialization = new String[]{"Staffing", "Firing people"};
        System.out.println(hr.name + "'s specialization is " + hr.specialization[0]);

        prg.attendTraining();
        mng.attendTraining();
        Interviewer.bookConferenceRoom(LocalDateTime.now(), 2);
    }
}
