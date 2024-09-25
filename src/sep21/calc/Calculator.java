package sep21.calc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("****************");
        System.out.println("Welcome to My calcualtor");
        System.out.println("****************");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("5. Modulus ");
        System.out.println("0. exit.  ");

        // User input

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your choice ");
        int option = scanner.nextInt();

        if(option == 1 && option != 0) {
            // take user input for numbers as well

            int x = 10;
            int y = 20;
            int sum = x + y;
            System.out.println("Sum of two numbers is " + sum);

        }
        else if(option == 2) {
            int x = 10;
            int y = 20;
            int sub = x - y;
            System.out.println("Sub of two numbers is " + sub);

        }
        else if(option == 3) {
            System.out.println("Multiplication");
        }
        else if(option == 4) {
            System.out.println("Div");
        }
        else if(option == 5) {
            System.out.println("Modu");
        }








    }
}
