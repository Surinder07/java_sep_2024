package oct15;

public class StringDemo {
    public static void main(String[] args) {

     // StringBuffer                StringBuilder[1.5]       Mutable
     // Thread safe                 not thread safe


        // account A                           account B
        // 2000         ----->                   0
// 2000


        StringBuilder sb = new StringBuilder("Pragra");
        System.out.println(sb);

        sb.append(" Inc");
        System.out.println(sb);
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse);


        // javac   Student.java
        // java Student   abc xyz


    }
}
