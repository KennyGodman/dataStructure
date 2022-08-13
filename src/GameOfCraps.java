import java.security.SecureRandom;
import java.util.stream.IntStream;

    public class GameOfCraps {
        public static void main(String[] args) {
//       int total =  IntStream .rangeClosed(1,10).map(number -> number * 2).sum();
//        System.out.println(total);

            int result = IntStream.rangeClosed(1,10).filter(number -> number % 2 == 0).map(number ->number * 3).sum();
            System.out.println(result);


            SecureRandom random = new SecureRandom();
            int total =  random.ints(100,1,26).sum();
            System.out.println(total);
        }
    }

