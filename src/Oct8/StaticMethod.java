package Oct8;

public class StaticMethod {

    public static void test(){
        System.out.println("This is test method... ");
    }

    static {
        System.out.println("This is static block ");
    }


    StaticMethod(){
        System.out.println("This is the constructor");
    }

    {
        System.out.println("Instance block ");
    }

    public void myMethod(){
        System.out.println("non static method.... ");
    }
    static  {
        System.out.println("Second static block..");
    }

}

class Main {
    public static void main(String[] args) {
        StaticMethod staticMethod = new StaticMethod();
        staticMethod.myMethod();




    }
}
