package nov5.customexceptiondemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        try {
            // checked exception
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            arrayTest();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }
        public static void arrayTest() throws ArrayIndexOutOfBoundsException{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the elements ");

            int[] arr = new int[4];


            for (int i = 0; i < 5 ; i++) {
                    arr[i] = scanner.nextInt();
            }
            System.out.println("Last line..");
    }
}

/*


Voting ... 18
Voting app
ask user to enter the age
if age is less than 18 , throw InvalidAgeException








 */
