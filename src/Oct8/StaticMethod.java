package Oct8;

public class StaticMethod {
    public static void test(){
        System.out.println("This is test method... "); // no
    }
    static {
        System.out.println("This is static block "); // 1
    }
    StaticMethod(){
        System.out.println("This is the constructor"); // 3   // 4
    }
    {
        System.out.println("Instance block "); //4      , // 3
    }
    public void myMethod(){
        System.out.println("non static method.... "); // 5
    }
    static  {
        System.out.println("Second static block.."); // 2
    }
}
class Main {
    public static void main(String[] args) {

        //javac
        // java

    }
}
