public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void hello() {
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old.");
    }
    public void eatPizza() {
        System.out.println("I am eating pizza.");
    }

    public void sleep() {
        System.out.println("I am sleeping.");
    }

    public void drink() {
        System.out.println("I am drinking.");
    }
}