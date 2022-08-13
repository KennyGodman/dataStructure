package chapter9;

import java.util.Arrays;
import java.util.Random;
public class Shuffling {

    public static void rand(int[] array) {

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int r = random.nextInt(array.length);
            int temp = array[r];
            array[r] = array[i];
            array[i] = temp;

        }

        System.out.println(Arrays.toString(array));
    }
}






