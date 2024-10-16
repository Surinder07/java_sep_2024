package oct15;

public class Test {
    public static void main(String[] args) {
        String s1 = "Pragra";
        String s2 = "Pragra";
        String s3 = new String("Pragra");

        s2 = "test";

         // = =   check the 1. reference and 2. values , both
        // .equals()   - only check the values


        System.out.println(s1 == s2);   // true
        System.out.println(s1 == s3);   // false
        System.out.println(s1.equals(s2));   // true
        System.out.println(s1.equals(s3));  // true


        char[] myArray = s1.toCharArray();

        for (char element: myArray) {
            System.out.print(" "+element);

        }




    }
}
