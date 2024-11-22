import java.util.random.RandomGenerator;

public class Student extends Person implements CanHavePizza, CanHaveParty, CanHaveDrink, Movable {
    private String studentID;

    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public void eatPizza() {
        System.out.println(getName() + " is eating pizza.");
    }

    public void move() {
        System.out.println(getName() + " is moving.");
    }

    public void dance() {
        if(getAge() > 18) {
            System.out.println(getName() + " can enter dance pool.");
        }
        else {
            System.out.println(getName() + " is under 18 and can not party(");
        }
    }

    public void drink() {
        if(getAge() > 21) {
            System.out.println(getName() + " can have drink.");
        }
        else {
            System.out.println(getName() + " is under 21 and can not drink.");
        }
    }

    public void  gotRetake() {
        System.out.println("Oh no. Poor " + getName() + "had retake(");
    }

    public void attendLibrary() {
        System.out.println(getName() + " is attending library for study.");
    }
}