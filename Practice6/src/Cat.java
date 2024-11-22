class Cat extends Animal implements CanHavePizza {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " : Meow!");
    }

    public void eatPizza() {
        System.out.println(getName() + " is eating pizza.");
    }

    public void walk() {
        System.out.println(getName() + " is going for a walk.");
    }
}