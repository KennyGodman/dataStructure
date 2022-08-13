import java.util.Arrays;
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
        int[] godman = new int[5];
        for (int i = 0; i < godman.length; i++) {
            System.out.println("Enter any number");
            int num = input.nextInt();
            godman[i] = num;
        }

        System.out.println(Arrays.toString(godman));

        int largerNumber = godman[0];
        int lowestNumber = godman[0];
        int total = godman[0];
        int average = godman[0];
        for (int i = 1; i < godman.length; i++) {
            if (largerNumber < godman[i]) {
                largerNumber = godman[i];
            }
            if (lowestNumber > godman[i]) {
                lowestNumber = godman[i];
            }
            total += godman[i];
            average = total / godman.length;
        }
        for (int i = 0; i < godman.length; i++) {


        }
        System.out.println("The larger number is : "+ largerNumber);
        System.out.println("The lowest number is : "+ lowestNumber);
        System.out.println("The average number is : "+ average);

//            System.out.println(Arrays.toString(godman));

        }




    }











//        int lowest = godman[0];
//        int highest =  godman[godman.length - 1];
//        System.out.println(lowest);
//        System.out.println(highest);
//}
