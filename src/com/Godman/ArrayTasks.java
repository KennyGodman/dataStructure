package com.Godman;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int user_input = input.nextInt();
        int [] godman = {6, 8, 9, 8, 8,5,6,8,7,3};
        Arrays.sort(godman);

        int lowest = godman[0];
        int highest =  godman[godman.length - 1];
        System.out.println(lowest);
        System.out.println(highest);
    }
}
