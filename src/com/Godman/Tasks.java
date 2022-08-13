package com.Godman;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int user_input = input.nextInt();
        int lower_number = user_input;
        int larger_number = user_input;
        int count = 1;
        int total = user_input;
        int average;
        while (count < 5) {
            System.out.printf("Enter Number %d%n", count + 1);
            user_input = input.nextInt();
            if (user_input > larger_number) {
                larger_number = user_input;
            }  if (user_input < lower_number) {
                lower_number = user_input;
            }
            total += user_input;
            count = count + 1;

        }
        average = total / count;


        System.out.printf("The highest number is %d%n The lowest number is %d%n", larger_number, lower_number);
        System.out.printf("The total is %d%n", total);
        System.out.printf("The average is %d%n", average);
    }
}

