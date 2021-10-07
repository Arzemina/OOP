package com.mycompany.helloworldapp;

import java.util.Scanner;
public class Zadaca {
    public static void main(String [] args){
        /*1. Create a program that prints 
             your name to the screen.*/
        System.out.println("Arzemina Brackovic");
        
        //2. Create a program that prints out the following:
        System.out.println("Hello World!");
        System.out.println("(And all the people of the world(");
        
        /*3. Create a program that counts how many seconds there are in a year.
             You can assume that a year consists of 365 days 
             (therefore the year is not a leap year).*/
        int min, hour, day, year;
        min=60;
        hour=60;
        day=24;
        year=365;
        
        int secondsInAYear=year*day*hour*min;
        System.out.println("There are "+secondsInAYear+" seconds in a year");
        
        /*4. Create a program that asks the user for two integers and then 
        prints their sum. */
        
        Scanner reader=new Scanner(System.in);
        
        System.out.println("Enter first integer: ");
        int number1=Integer.parseInt(reader.nextLine());
        
        System.out.println("Enter second integer: ");
        int number2=Integer.parseInt(reader.nextLine());
        
        int sum=number1+number2;
        
        System.out.println("The sum of these two integers is "+sum);
        
        /*5. Create a program that asks the user for a number and tells if the 
             number is positive (i.e. greater than zero).*/
        
        //Scanner reader=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number=Integer.parseInt(reader.nextLine());
        
        if(number==0){
            System.out.println("The number is equal to zero.");
        }else if(number>0){
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is negative.");
        }
        
        /*6. Create a program that asks the user for two numbers and prints the
             greater of those two. The program should also handle the case in 
             which the two numbers are equal. */
        
        //Scanner reader=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=Integer.parseInt(reader.nextLine());
        
        System.out.println("Enter second number: ");
        int num2=Integer.parseInt(reader.nextLine());
        
        if(num1==num2){
            System.out.println("The numbers are equal.");
        }else if(num1>num2){
            System.out.println("First number is greater.");
        }else{
            System.out.println("Second number is greater.");
        }
        
        
                
        
        
        
        
    }
    
}
