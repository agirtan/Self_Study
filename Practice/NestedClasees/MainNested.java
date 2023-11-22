package Practice.NestedClasees;

import java.util.ArrayList;
import java.util.List;

public class MainNested {

    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10050, "Carole", 2021),
                new Employee(10022, "Jane", 2020),
                new Employee(13151, "Laura", 2020),
                new Employee(10005, "Jim", 2018)));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);

        employees.sort(new Employee.EmployeeComparator<>("yearStarted")); // employees are sorted according to year

        for (Employee e: employees
             ) {
            System.out.println(e);

        }

    }
}
