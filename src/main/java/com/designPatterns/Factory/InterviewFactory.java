package com.designPatterns.Factory;

public class InterviewFactory {

    public Interviewer getInterviewer(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Developer")) {
            return new Developer();

        } else if (type.equalsIgnoreCase("Tester")) {
            return new Tester();

        }
        return null;
    }
}
