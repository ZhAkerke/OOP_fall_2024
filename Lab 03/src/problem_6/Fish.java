package problem_6;

class Fish extends Animal {
    Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Blub";
    }
}