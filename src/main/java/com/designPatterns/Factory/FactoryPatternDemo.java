package com.designPatterns.Factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        InterviewFactory interviewFactory = new InterviewFactory();
        Interviewer interviewer = interviewFactory.getInterviewer("Developer");
        interviewer.askQuestions();

        Interviewer interviewer1 = interviewFactory.getInterviewer("Tester");
        interviewer1.askQuestions();
    }
}
