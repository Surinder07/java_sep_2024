package oct12;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements for the Array ");

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scanner.nextInt();
        }

        // Logic

        int start = 0;     // 0
        int end = arr.length - 1;   // 4          A         B
                                                // C
//              0 < 4   ,, 1   < 3   , 2 < 2
        while (start < end) {

            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }

        System.out.println("Display the elements in array ");

        // for element integer element in given array , print that element.
        for (int element : arr) {
            System.out.println(element);
        }

        // lambdas --- forEach()

    }
}
