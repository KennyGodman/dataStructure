package com.Godman;

public class Practice {
    public static void main(String[] args) {
        int [] number = new int[10];
        number[0] = 3;
        number[1] = 5;
        number[2] = 8;
        number[3] = 9;
        number[4] = 8;
        number[5] = 4;
        number[6] = 2;
        number[7] = 4;
        number[8] = 7;
        number[9] = 6;
        for (int i = 0; i < number.length; i++) {
            System.out.println("Index "+i+ " = "+ number[i] );

        }
        System.out.println();

        int [] number1 = new int[10];
        for (int i = 0; i < number1.length; i++) {
            number1[i] = i + 1;
            System.out.println("Index " + i + " = " + number1[i]);
        }
//        even number
        int var = 2;
        int [] number2 = new int[10];
        for (int i = 0; i < number2.length; i++) {
            number2[i] = var;
            System.out.println("Index "+i+ " = "+ number2[i] );
            var +=2;
        }

//        odd number
        int vary = 1;
        int[] number4 = new int[10];
        for (int i = 0; i < number4.length; i++) {
            number4[i] = vary;
            System.out.println("Index " + i + " = " + number4[i]);
            vary += 2;
        }
        System.out.println();
        // replacing the array elements
        number [5] = 12;
        number [7] = 16;
        number[9] = 21;
        System.out.println("Index  5 " +   number[5]);
        System.out.println("Index  7 " +  number[7]);
        System.out.println("Index  9 " +  number[9]);

    }
}
