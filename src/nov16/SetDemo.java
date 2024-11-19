package nov16;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        set.add(200001);
        set.add(2010);
        set.add(232);
        set.add(323232);

        System.out.println(set);

        Set<String> set2 = new TreeSet<>();
        set2.add("Aagan");
        set2.add("Aagra");
        set2.add("Anmol");

        System.out.println(set2);

        // Lambdas and streams


        //










    }
}
