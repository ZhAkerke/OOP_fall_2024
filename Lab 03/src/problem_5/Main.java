package problem_5;

import problem_4.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Chocolate> chocolates = new ArrayList<>(Arrays.asList(
                new Chocolate("Twix", 55),
                new Chocolate("Kazakhstan", 100),
                new Chocolate("Albeni", 40)
        ));
        Sort.bubbleSort(chocolates);
        System.out.println("Sorted Chocolates: " + chocolates);

        List<problem_5.Time> times = new ArrayList<>(Arrays.asList(
                new Time(2, 32, 34),
                new Time(1, 45, 12),
                new Time(3, 0, 0)
        ));
        Sort.mergeSort(times);
        System.out.println("Sorted Times: " + times);

        List<problem_4.Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Akyl", 360000, new Date(2021, Calendar.MAY, 27), "INS123"),
                new Employee("Aiko", 230000, new Date(2019, Calendar.FEBRUARY, 15), "INS456")
        ));
        Sort.mergeSort(employees);
        System.out.println("Sorted Employees: " + employees);
    }
}
