package oct29;

public class Employee {
    private long id;
    private String name;
    private String email;
    private double salary;
    private Address address;

    public Employee(long id, String name, String email, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.address = address;
    }

    public void displayEmployee(){
        System.out.println("NAME : "+ name);
        System.out.println("EMAIL : "+ email);
        System.out.println("ADDRESS : "+ address);
    }
}

