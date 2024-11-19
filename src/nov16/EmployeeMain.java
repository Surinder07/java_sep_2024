package nov16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> l=new ArrayList<>();
        Employee e1=new Employee("amit","amit@gmail.com",23,123,"canada");
        Employee e2=new Employee("rohit","rohit@gmail.com",26,124,"usa");
        Employee e3=new Employee("prateek","prateek@gmail.com",27,125,"india");
        Employee e4=new Employee("robin","robin@gmail.com",28,126,"australia");

        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);

        Iterator<Employee> it=l.iterator();
        while(it.hasNext()) {
            Employee e=it.next();
            if(e.getAge()>25) {
                System.out.print(e.getName() + " ");
            }
        }

    }
}
