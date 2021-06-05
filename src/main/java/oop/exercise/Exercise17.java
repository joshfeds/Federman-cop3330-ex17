package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman

 */
public class Exercise17
{
    static Scanner input = new Scanner(System.in);
    public static String getWeight() {
        System.out.print("What is your weight?");
        String weight = input.nextLine();
        while(!weight.matches("[0-9.]+"))
        {
            System.out.print("Please enter a numerical value only.");
            weight = input.nextLine();
        }
        return weight;
    }
    public static String getGender() {
        System.out.print("Press 1 if you are a man, Press 2 if you are a woman");
        String gender = input.nextLine();
        while(!gender.matches("[1]+") && !gender.matches("[2]+"))
        {
            System.out.print("Please enter either 1 or 2");
            gender = input.nextLine();
        }
        if(gender.matches("1"))
            return "0.73";
        else
            return "0.66";
    }
    public static String getAlcCons() {
        System.out.print("How much alcohol have you consumed in ounces?");
        String consume = input.nextLine();
        while(!consume.matches("[0-9.]+"))
        {
            System.out.print("Please enter a numerical value only.");
            consume = input.nextLine();
        }
        return consume;
    }
    public static String getHours() {
        System.out.print("How many hours has it been since you have drank alcohol?");
        String time = input.nextLine();
        while(!time.matches("[0-9.]+"))
        {
            System.out.print("Please enter a numerical value only.");
            time = input.nextLine();
        }
        return time;
    }
    public static double doMath(String w, String g, String c, String t){
        float weight = Float.parseFloat(w);
        float gender = Float.parseFloat(g);
        float consumption = Float.parseFloat(c);
        float time = Float.parseFloat(t);
        double total = (consumption * 5.14 / weight * gender) - .015 * time;
        return total;
    }
    public static void testDrive(double total){

        if(total < 0.08)
            System.out.print("It is legal for you to drive.");
        else
            System.out.print("It is not legal for you to drive.");
    }
    public static void main( String[] args ) {
        String weight = getWeight();
        String gender = getGender();
        String consume = getAlcCons();
        String time = getHours();
        double total = doMath(weight,gender,consume,time);
        testDrive(total);
    }
}
