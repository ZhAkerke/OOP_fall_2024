package problem_6;

class Student extends Person {
    String major;

    Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public String getOccupation() {
        return "Student (" + major + ")";
    }

    @Override
    public void speak() {
        System.out.println(getOccupation());
    }
}
