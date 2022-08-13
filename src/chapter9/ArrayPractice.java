package chapter9;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

            int[] array1 = new int[]{6, 4, 2, 11, 42, 87, 46, 51, 17, 100, 89, 74};

            sortArray(array1);
        }

    public static void sortArray(int[]array1){
            for (int i = 0; i < array1.length; i++) {
                for (int j = i + 1; j < array1.length; j++) {
                    int array = 0;
                    if (array1[i] > array1[j]) {
                        array = array1[i];
                        array1[i] = array1[j];
                        array1[j] = array;

                    }
                }

            }
       // System.out.println(Arrays.toString(array1));
            for (int i = 0; i < array1.length; i++) {
                System.out.println(array1[i]);
            }
        }
    }
