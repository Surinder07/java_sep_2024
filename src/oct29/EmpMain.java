package oct29;

public class EmpMain {
    public static void main(String[] args) {

        Address address = new Address("110 Matheson", "Mississauga", "ON", "L1K 2W3");
        Employee employee = new Employee(101, "Anmol","anmol@gmail.com",121212.12,address);
        employee.displayEmployee();

       // String city = employee.address.getCity();
        // employee.address.

        // System.out.println(city);
        // System.out.println();

    }
}
