package nov2;

public class Student {
    String name;
    String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void printStudent(){
        System.out.println(name);
        System.out.println(email);
        int x = 10;
        int y = 0;
        int div = x / y;
        System.out.println(div);
    }
}
