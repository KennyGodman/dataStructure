import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Copy {
        public static void main(String[] args) {
            // Write a Java program to copy one array list into another.
            String[] names = {"Panic", "Nnamdi", "Vector", "Acha", "Barack", "Ibrana"};
            String[] copyNames = new String[names.length];
            System.arraycopy(names, 0, copyNames, 0, names.length);
            for(String name : copyNames){
                System.out.println(name);
            }
            sortArray();
            printPosition();
            cloneArray();
            replaceSecondElement();
        }
        public static void sortArray(){
            // Write a Java program to reverse elements in a array list.
            Random rand = new Random();
            ArrayList<Integer> numbers = new ArrayList<>();

            for(int x = 0; x <= 10; x++){
                int randNum = 1 + rand.nextInt(10);
                numbers.add(randNum);
            }
            System.out.println("INITIAL ARRAY \n" + numbers);

            Collections.sort(numbers);
            System.out.println("SORTED ARRAY \n" + numbers);

            Collections.reverse(numbers);
            System.out.println("REVERSED ARRAY \n" + numbers);
        }

        public static void printPosition(){
            // Write a Java program to print all the elements of a ArrayList using the position of the elements.
            ArrayList<String> games = new ArrayList<>();
            games.add("Ghost Recon");
            games.add("Mortal Kombat");
            games.add("Rainbow six");
            games.add("Metal Gear");
            games.add("Battle Field");

            for(String game : games){
                System.out.println(game);
            }
        }

        public static void cloneArray(){
            // Write a Java program to clone an array list to another array list.
            String[] sports = {"Football", "BasketBall", "Cricket", "Snooker", "FomularOne"};
            String[] cloneSport = sports.clone();

            for(String x : cloneSport){
                System.out.println(x);
            }
        }

        public static void replaceSecondElement(){
            // Write a Java program to replace the second element of a ArrayList with the specified element.
            ArrayList<String> sports = new ArrayList<>();

            sports.add("Football");
            sports.add("BasketBall");
            sports.add("Cricket");
            sports.add("Snooker");
            sports.add("FomularOne");

            for(int x = 0; x < sports.size(); x++){
                if(x == 2){
                    sports.remove(2);
                    sports.add(2, "Kenny GodMan");
                }
                System.out.println(sports.get(x));
            }
        }
    }

