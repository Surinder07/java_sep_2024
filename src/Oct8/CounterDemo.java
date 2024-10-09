package Oct8;

public class CounterDemo {
    static int counter = 0;

    CounterDemo(){
        counter ++;
        System.out.println(counter);
    }

    public static void main(String[] args) {
        new CounterDemo();
        new CounterDemo();
        new CounterDemo();
    }
}
