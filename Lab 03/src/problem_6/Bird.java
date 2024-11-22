package problem_6;

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Tweet";
    }
}