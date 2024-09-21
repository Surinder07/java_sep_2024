package sep21.calc;


import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        // Scanner Object
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int num1 = obj.nextInt();

        System.out.println("Enter the second number :");
        int num2 = obj.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of two numbers is " + sum);



    }
}
