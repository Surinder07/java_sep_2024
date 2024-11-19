package nov16;


        /*

        create a custom List , Employee
        Name, Email, Age, Phone , Country
        create a list of 4-5 Employees

        1. find all the employees with age greater than 25
        2. find all the employees from Canada
*/

public class Employee {

    private String name;
    private String email;
    private int age;
    private int phone;
    private String country;

    public Employee(String name, String email, int age, int phone, String country) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
