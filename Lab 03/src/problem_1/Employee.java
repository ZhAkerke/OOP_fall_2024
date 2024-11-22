package problem_1;

class Employee extends Person implements WashingFood {
    public String name;
    public int age;
    public String department;
    public int salary;

    public Employee(String name, int age) {
        super(name, 18);
    }

    void work() {
        System.out.println("Employee works");
    }

    public void washFood() {
        System.out.println("Employee also wash food");
    }

    void degree() {
        System.out.println("Employee have degree");
    }
}