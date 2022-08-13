package Chapter7;

import java.security.SecureRandom;

public class BarChart {
    public static void main(String[] args) {
    //barChart();
        studentPoll();
    }
    public static void barChart(){

        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        for(int counter = 0; counter < array.length; counter++){

            if(counter == 10){
                System.out.printf("%5d: ", 100);
            } else{
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
            }

            for (int star = 0; star < array[counter]; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rollDie() {
        SecureRandom randomNumber = new SecureRandom();
        int[] frequency = new int[7];

        for(int roll = 1; roll <= 60_000_000; roll++){
            ++frequency[1 + randomNumber.nextInt(6)];
        }

        System.out.printf("%s%10s%n", "Face", "Frequency");

        for(int face = 1; face < frequency.length; face++){
           System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }

    public static void studentPoll(){

        int[] response = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequency = new int[6];

        for (int answer = 0; answer < response.length; answer++){
            try {
                ++frequency[response[answer]];
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("responses[%d] = %d%n%n", answer, response[answer]);
            }
        }
        System.out.printf("%s%10s%n", "Rating", "Frequency");

        for(int rating = 0; rating < frequency.length; rating++){
            System.out.printf("%5d%10d%n", rating, frequency[rating]);
        }
    }
    }
