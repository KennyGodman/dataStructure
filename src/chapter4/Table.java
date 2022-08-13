package chapter4;

public class Table {
    public static void main(String[] args) {
        System.out.printf("%s%10s%10s%10s%n", "N", "N^2","N^3","N^4");
        for (int i = 1; i <= 5; i++) {
            int numa = i*i;
            int numb = i*i*i;
            int numc = i*i*i*i;


            System.out.printf("%d%10d%10d%10d%n", i, numa, numb, numc);

        }
    }

}
