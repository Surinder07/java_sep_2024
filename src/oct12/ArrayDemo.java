package oct12;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements for the Array ");

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scanner.nextInt();
            //arr[0] = 10
            // arr[1] = 20

        }
        System.out.println("Display the elements in array ");


        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

       //  Reverse an Array
        // 10 20 30 40 50 60 70

        // reversed array
        // 70 60 50 40 30 20 10


    }
}
