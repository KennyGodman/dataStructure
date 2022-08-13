package chapter4;

import java.util.Scanner;

// Write a program that displays the largest number and the second largest number
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstLargest = 0;
        int secondLargest = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter num %d%n",i);
           int num = input.nextInt();

            boolean firstInput = num > firstLargest;
            if (firstInput) {
                    firstLargest = num;
        }
        if (num > secondLargest && num < firstLargest){
            secondLargest = num;
        }

    }
        System.out.printf("The largest number is:%d%nThe second largest number is:%d%n", firstLargest,secondLargest);
    }

}
