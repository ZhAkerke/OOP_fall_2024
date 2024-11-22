package problem_4;

import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee1 = new Employee("Akyl", 360000, new Date(2021, Calendar.MAY, 27), "INS123");
        Employee employee2 = new Employee("Aiko", 230000, new Date(2019, Calendar.FEBRUARY, 15), "INS456");
        Manager manager = new Manager("Banu", 500000, new Date(2020, Calendar.MARCH, 10), "INS789", 10000);

        manager.team.add(employee1);
        manager.team.add(employee2);


        System.out.println(employee1);
        System.out.println(manager);

        System.out.println(employee1.equals(employee2));


        List<Employee> employees = Arrays.asList(employee1, employee2, manager);
        employees.sort(new NameComparator());
        System.out.println("Sorted by name: " + employees);

        employees.sort(new HireDateComparator());
        System.out.println("Sorted by hire date: " + employees);

        Manager clonedManager = (Manager) manager.clone();
        System.out.println("Cloned manager: " + clonedManager);
    }
}
