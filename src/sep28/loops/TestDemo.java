package sep28.loops;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {

        // System.out::println


        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(10);
        list.add(15);

        list.stream().filter( x -> x%3 ==0 ).forEach(System.out::println);
    }
}

/*
   1   2    3   4   5
   2   4    6   8   10
   3   6    9   12  15
   4   8    12  16  20
   5   10   15  20  25


   *
   **
   ***
   ****
   *****


 */



/*

i = 0
i < 5
print statmeent
increment decrement





 */