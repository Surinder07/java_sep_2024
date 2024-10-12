package oct12;

public class StringDemo {
    public static void main(String[] args) {


        String companyName = "Pragra";  // literal  // String constant pool

        System.out.println(companyName);

        String name = new String("Pragra"); // new keyword    // Heap
        System.out.println(name);


        String upperCase = companyName.toUpperCase();

        System.out.println(upperCase);


        /*char[] ch = {'P','R', 'A','G','R','A'};

        for (char element: ch) {
            System.out.print(element);
        }*/
    }

}


