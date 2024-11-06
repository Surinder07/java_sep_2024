package nov5;

public class Test {
    public static void main(String[] args) {

        try {

            try{
                int x = 10;
                int y = 0;
                int div = x/y;
                System.out.println(div);

            }catch (Exception e){
                e.printStackTrace();
            }

            String s = "Pragra";
            s = null;
            System.out.println(s.toLowerCase());
            System.out.println("Hello after exception ");

        }

        catch (Exception e) {
            e.printStackTrace();
        }



        System.out.println("at line 11 ");


    }
}

/*

array - array index out of bound exception
Null pointer
Arithmetic exception
Numformat exception






 */