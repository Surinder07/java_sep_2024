package oct12;

public class StringDemo1 {
    public static void main(String[] args) {

        String name = "PPragra";
        System.out.println(name);
        int length = name.length();

        System.out.println(length);


        boolean pragra = name.equals("Pragra");
        System.out.println(pragra);

        String trim = name.trim();
        System.out.println(trim);
        char c = name.charAt(0);

        System.out.println(c);

        char[] myArray = name.toCharArray();


        for (char element: myArray) {
            System.out.println(element);
        }

        String concat = name.concat(" Incorp");
        System.out.println(concat);


        String substring = name.substring(1, 3);
        System.out.println(substring);

        int p = name.indexOf('P');
        System.out.println(p);

    }

    //   String companyName = "Pragra"


// reverse this string ...





}
