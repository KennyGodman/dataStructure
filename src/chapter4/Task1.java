package chapter4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        System.out.println("Enter either 1 or 2 to break loop");
        int num = input.nextInt();
        while (true){
            counter = counter + 1;

            if (num != 1 && num !=2){
                System.out.println("Enter either 1 or 2 to break loop");
                num = input.nextInt();
            }
            else {
                break;
            }

        }
    }
}
