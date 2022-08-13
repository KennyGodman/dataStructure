package com.Godman;

import java.util.Scanner;

public class Number {
    private int numberFind;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter FirstNumber");
        int firstNumber = input.nextInt();
        System.out.println("Enter SecondNumber");
        int secondNumber = input.nextInt();
        System.out.println("Enter ThirdNumber");
        int thirdNumber = input.nextInt();
        System.out.println("Enter FourthNumber");
        int fourthNumber = input.nextInt();
        System.out.println("Enter FifthNumber");
        int fifthNumber = input.nextInt();

        System.out.println("The largest number :" + Math.max(firstNumber,(Math.max(secondNumber,Math.max(thirdNumber,Math.max(fourthNumber,fifthNumber))))));
        System.out.println("The largest number :" + Math.min(firstNumber,(Math.min(secondNumber,Math.min(thirdNumber,Math.min(fourthNumber,fifthNumber))))));
    }
}



