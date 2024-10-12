package oct12;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {


    }

    public static int[] printArray(int[] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements for the Array ");

         arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }

        System.out.println("Display the elements in array ");

        for (int element : arr) {
            System.out.println(element);
        }
        return arr;
    }

// pass by value
    // pass by ref
}
