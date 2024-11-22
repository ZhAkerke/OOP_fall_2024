package problem_2;

class Shark implements Swimmable {
    String name;
    int age;

    public Shark(String name, int age) {
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

    @Override
    public void move() {
        System.out.println("Shark is moving.");
    }
    @Override
    public void swim() {
        System.out.println("Shark is swimming in the ocean!");
    }
}