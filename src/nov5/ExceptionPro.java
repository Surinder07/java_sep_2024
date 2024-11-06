package nov5;

import nov2.Student;

public class ExceptionPro {
    public static void main(String[] args) {
        test1();
        System.out.println("On line 6");

        Student student = new Student("avbc","acbc");
        student.printStudent();
    }

    public static void test1(){
        test2();
    }
    public static void test2(){
        test3();
    }
    public  static void test3(){
        test4();
    }
    public  static void test4(){
       try {
           int x = 10;
           int y = 0;
           int div = x / y;
           System.out.println(div);
       }
       catch (ArithmeticException e){
           e.printStackTrace();
       }
    }



}
