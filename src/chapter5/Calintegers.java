package chapter5;

import java.util.Scanner;

public class Calintegers {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.printf("The number is divisible by three within 1 - 30: %d%n", i);
            }
        }
    }
}
