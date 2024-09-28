package sep28;

import java.util.Scanner;

public class ProblemSol {
    public static void main(String[] args) {


        // sum of n natural nos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit upto you want to print");
        int limit = scanner.nextInt();

        int x = 0;
        int sum = 0;

        do {
            sum = sum + x;

            x++;
        } while (x <= limit);

        System.out.println(sum);
    }
}
