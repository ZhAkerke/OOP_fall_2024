package problem_6;

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Meow";
    }
}