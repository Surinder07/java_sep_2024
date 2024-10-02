package sep28.loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("**** Calculator *****");
        System.out.println("1. Addition ");
        System.out.println("2. Multiplication ");
        System.out.println("3. Subtraction ");
        System.out.println("4. Division ");
        System.out.println("5. Modulus ");
        System.out.println("6. Exit ");
        char choice;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select 1 choice from above..... ");
            int input = scanner.nextInt();

        do {
            switch (input) {
                case 1:
                    System.out.print("Enter the first number  : ");
                    int num1 = scanner.nextInt();

                    System.out.print("Enter the second number  : ");
                    int num2 = scanner.nextInt();
                    int sum = num1 + num2;
                    System.out.println("Sum of num1 and num2 " + sum);
                    break;

                case 2:
                    num1 = 10;
                    num2 = 20;
                    int mul = num1 * num2;
                    System.out.println("Sum of num1 and num2 " + mul);
                    break;

                case 3:
                    System.out.println("Sub");
                    break;

                case 4:
                    System.out.println("Div");
                    break;
            }
            System.out.println("Do you want to continue ???  ");
            System.out.println("Press y  for yes, n for no");
            choice = scanner.next().charAt(0);

        }while (choice == 'y' || choice ==  'Y');
    }

    public static class ProblemSol {
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
}
