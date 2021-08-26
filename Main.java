import.java.util.Scanner;

package com.company;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Year;
        int Second_Year;
        int First_divisor;
        int Second_divisor;


        YearRange myFirstRange = new YearRange(1314, 2014);
        myFirstRange.setRangeType(1);

        //Get all leap years.
        YearRange mySecondRange = new YearRange(1100, 3150);
        mySecondRange.setRangeType(2);

        //Get all Olympic years divisible by 3
        YearRange myThirdRange = new YearRange(1500, 1890);
        myThirdRange.setRangeType(3);


        System.out.println(“List of all years divisible by“+ myFirstRange.getFirstDivisor() + “ and “ + myFirstRange.getSecondDivisor());
        myFirstRange.printYears();


        if(year%4 = 0){
            System.out.println(“List of all leap years between ” + mySecondRange.getFirstYear() + “ and “ +mySecondRange.getSecondYear());
            mySecondRange.printYears();
            System.out.println(“List of all Olympic years between ” + myThirdRange.getFirstYear() + “ and “ + myThirdRange.getSecondYear() +“ that are divisible by “ + myThirdRange.getFirstDivisor());
            myThirdRange.printYears();
        }
    }