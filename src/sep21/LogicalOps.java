package sep21;

public class LogicalOps {
    public static void main(String[] args){
        int x = 20;
        int y = 25;
        int a = 20;
        int b = 19;
        int c = 25;

                        // 20 != 25
        System.out.println( (x != y)  || x <=a);
                        // 20 >= 25
        System.out.println( (x >= y)  && a >=b);



        System.out.println( (x == a)  && x > b);



                        // F    ||     F
        System.out.println( (x != a) ||   y == b );




                            // T
        System.out.println( (b != y)  || x <=a);


        System.out.println( (x != c)  && x <=a);

        System.out.println(!((x != c)  && x <=a));



       /*
       OR
       T      T   =  T
       T      F   =  T
       F     T    =   T
       F     F    =    F


       NOT  !






        */


    }
}
