package problem_1;

public class Main {
    public static void main(String[] args) {
        WashingFood employee = new Employee("Akyl", 24);
        WashingFood raccoon  = new Raccoon("Amy", 2);

        System.out.println("Interfaces test:");
        raccoon.washFood();
        employee.washFood();

        System.out.println("Abstract class test:");
        Animal raccoon1 = new Raccoon("Miya", 3);
        raccoon1.sound();
    }
}