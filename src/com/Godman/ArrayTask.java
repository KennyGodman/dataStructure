package com.Godman;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int highNum = 0;
         int lowNum = 10000;
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter any number");
            int number = input.nextInt();

            if(number > highNum){
                highNum = number;
            } else if (number < lowNum) {
                lowNum = number;
            }

        }
        System.out.printf("The highest number is %d%nThe lowest number is %d%n", highNum, lowNum);
    }
//
    public static void highAndLowNumber(){


        Scanner input = new Scanner(System.in);
        int count = 1;
        System.out.println("Enter Number 1");
        int user_input = input.nextInt();
        int lowest_number = user_input;
        int highest_number = user_input;

        while (count < 5) {
            System.out.printf("Enter Number %d%n, count + 1");
            user_input = input.nextInt();
            if (user_input > highest_number) {
                highest_number = user_input;
            } else if (user_input < lowest_number) {
                lowest_number = user_input;
            }
            count = count + 1;
        }
        System.out.printf("The highest number is %d%nThe lowest number is %d%n", highest_number, lowest_number);

            }
        }

