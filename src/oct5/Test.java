package oct5;

public class Test {
    public int sum(int a , int b){     // parameters
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        Test test = new Test();
        // arguments
        int sum = test.sum(10, 20);

    }

}
