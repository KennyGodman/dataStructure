package com.Godman;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int number = input.nextInt();

        if(number == 0) {
            System.out.println(1);
        }
        if (number==1){
            System.out.println(0);

        }
    }
}
