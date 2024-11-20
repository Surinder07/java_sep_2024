package nov19;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        // insert into map

        map.put("Name", "Anmol");  // this key value pair is called is entry
        map.put("Email ", "anmol@gmail.com");
        map.put("Phone ", "1212121212");
        map.put("Address ", "Toronto");

        System.out.println(map);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        map.putIfAbsent("name1 ", "Alok");

        System.out.println(map);

        // fetch from map
        String name = map.getOrDefault("name", "xyz"); // if the key is not present, its going to return default value
        System.out.println(name);

        System.out.println(name.toUpperCase());

        // key is present

        boolean name1 = map.containsKey("name");  // check if the key is present or not
        System.out.println(name1);

        Set<String> set = map.keySet();  // this is going to return set of keys in map

        System.out.println("set of all the keys "+set );

        //fetch collection of values
        Collection<String> values = map.values(); // this is going to return set of values in map
        System.out.println(values);


        System.out.println("1111");

        // Map is outer class/interface , Entry is inner class/interface
        // OuterClass.InnerClass - to access inner class element, Outer class is used
        Set<Map.Entry<String, String>> entrySet = map.entrySet();  // map.entrySet will fetch all the set of entry

        for (Map.Entry<String, String>  entry:  entrySet) {
            //System.out.println(entry);   // this is going to give entry which inclues, key and value
            System.out.println(entry.getKey());   // list all the keys
            System.out.println(entry.getValue()); // list all the values

        }


        // parent class ----- list, set , queue    child class

        /*

        Company Name
        Name : CEO

        Microsoft : Satya Nadella
        Tesla : Elon Musk
        Google : Sundar Pichai
        Zomato : Deepinder Goyal
        Pragra : Atin Singh

        1. list all the keys
        2. list all the values
        3. traverse on entry set and fetch the keys and values .  for loop


Problem 2 :
        Product --- Quantity
        Laptop      100
        Mobile      150
        Mouse      250
        Keyboard   124
        cvables     29

        keyset --- [Laptop, Mobile , Mouse..]
        values [100, 150, 250.... ]
        entry set [laptop = 100, Moble = 150 ]



        1. find the product with highest stock - String


        int max = 0;

         for (  entry : entrySet ){

         entry.getvalue() > max

         max =  entry.getvalue()







        2. find the highest stock - Integer




        3. find the average stock - Integer


{
"name":"",


}

      Problem 3 :

        Customized HashMap
        Product
        id, name, Stock, price

        Map<Integer, Product>



















         */
    }

}

/*


Name - Alok
email - alok@gmail.com
address - Toronto
address - Toronto
phone - 23123412341
null - test
 */