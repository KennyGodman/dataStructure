package chapter5;

import java.util.Scanner;

public class Calintegers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("please enter any number");
            num = scanner.nextInt();
            if (num % 3 == 0){
                System.out.printf("%d: is divisible by 3%n", num);
            }else {
                System.out.println("Number is not divisible by 3");
            }

        }
    }
}
