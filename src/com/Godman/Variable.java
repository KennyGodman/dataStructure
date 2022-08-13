package com.Godman;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Variable {
    private static int newInput;

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        ArrayList<Integer> items = new ArrayList<>();
//
//        for (int i = 0; i < 6; i++) {
//            System.out.println("Please enter any value");
//            newInput = input.nextInt();
//            items.add(newInput);
//        }
//        calculateAverage(items, "The average of the result is");
//
//    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> items = new ArrayList<>();

        do {
            System.out.println("Please enter any value and enter -99 to break the loop");
            newInput = input.nextInt();
            items.add(newInput);

        } while (newInput != -99);

        calculateAverage(items, "The average of the result is");

}

    public static void calculateAverage(ArrayList<Integer> items, String result) {
            System.out.println(result);
            int total = 0;
            int newFinal = 0;
            int i;
            for (i = 0; i < items.size() ; i++) {
            total += items.get(i);
            newFinal = total / (i + 1);
        }
       System.out.printf("The result of our average is %d%n", newFinal);

    }
}
