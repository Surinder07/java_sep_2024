package nov16;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(1000);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
/*

        for (Integer element : list) {
            System.out.println(element);
        }
*/


        // Iterator
        // Concurrent modification exception ...

     /*   Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/


        ListIterator<Integer> ls = list.listIterator();

        while (ls.hasPrevious()){
            System.out.println(ls.next());
        }



    }
}
