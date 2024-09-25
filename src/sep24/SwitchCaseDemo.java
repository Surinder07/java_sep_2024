package sep24;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");

        int input = scanner.nextInt();

        switch (input) {
            case 1 :

                if(true){

                }else {

                }
                System.out.println("Case 1 ");
                break;
            case 2 :
                System.out.println("Case 2 ");
                break;
            case 3 :
                System.out.println("Case 3 ");
                break;
            case 4 :
                System.out.println("Case 4 ");
                break;
            case 5 :
                System.out.println("Case 5 ");
                break;
            case 6 :
                System.out.println("Case 6 ");
                break;
            default:
                System.out.println("Invalid choice!!");


        }

    }
}
