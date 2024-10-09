package Oct8;

public class Employee {

    int id;
    String name;
    String email;
    static String companyName = "Microsoft";

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void printEmployee(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(companyName);
    }
}
// heap, method area = static