package problem_1;

class Raccoon extends Animal implements WashingFood {
    public String name;
    public int age;

    public Raccoon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    void eat() {
        System.out.println(getName() + " eat");
    }

    public void washFood() {
        System.out.println(getName() + " wash food");
    }
    @Override
    void sound() {
        System.out.println(getName() + " makes raccoon sound");
    }
}