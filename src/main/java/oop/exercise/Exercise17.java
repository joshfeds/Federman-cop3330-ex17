package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 Create a program that prompts for your weight, gender, total alcohol consumed (in ounces),
 * and the amount of time since your last drink. Calculate your blood alcohol content (BAC) using this formula

BAC = (A × 5.14 / W × r) − .015 × H
where

A is total alcohol consumed, in ounces (oz).
W is body weight in pounds.
r is the alcohol distribution ratio:
0.73 for men
0.66 for women
H is number of hours since the last drink.
Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.

Example Output
Your BAC is 0.08
It is not legal for you to drive.
Constraint
Prevent the user from entering non-numeric values.
 */
public class Exercise17
{
    static Scanner input = new Scanner(System.in);
    public static String getWeight() {
        System.out.print("What is your weight?");
        String weight = input.nextLine();
        while(!weight.matches("[0-9]+")) {
            System.out.print("Please enter a numerical value only.");
            weight = input.nextLine();
        }
        return weight;
    }
    public static void main( String[] args ) {

    }
}
