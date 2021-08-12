package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to University Student Admissions");

        System.out.println("Please the students KCSE Grade Points: ");
        double KcseGrades;
        KcseGrades = input.nextDouble();

        System.out.println("Enter the students Interview Score: ");
        int InterviewScore;
        InterviewScore = input.nextInt();
        System.out.println("------------");

        System.out.println("Enter the students confidence Score: ");
        int CofidenceScore;
        CofidenceScore = input.nextInt();
        System.out.println("-----------");

        if (KcseGrades >= 0 && KcseGrades <= 100.0 && InterviewScore >= 0 && InterviewScore <=
                10 && CofidenceScore >= 0 && CofidenceScore <= 10) {
            if (KcseGrades >= 65.0 && InterviewScore >= 6 && CofidenceScore >= 5) {
                System.out.println("Student is ACCEPTED to University!");
                System.out.println("Students KCSE points are " + KcseGrades + " and students Interview score is "
                        + InterviewScore + "and students confidence score is" + CofidenceScore);
            } else {
                System.out.println("Student is NOT ACCEPTED to university!");
                System.out.println("Students KCSE points are " + KcseGrades + " and students Interview score is "
                        + InterviewScore + "and students confidence score is" + CofidenceScore);
            }
        }
        else{
            System.out.println("Please Check KCSE Points, Interview score and Confidence score input!");
            System.out.println("Your inputs are:");
            System.out.println(InterviewScore + " = Interview Score should be between 0 and 10");
            System.out.println(KcseGrades + " = KCSE points should be between 0 and 100.");
            System.out.println(CofidenceScore + " = Confidence Score should be between 0 and 10");
        }
    }
}