package problem_6;

class Employee extends Person {
    String jobTitle;

    Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    @Override
    public String getOccupation() {
        return jobTitle;
    }

    @Override
    public void speak() {
        System.out.println("Welcome to " + getOccupation());
    }
}