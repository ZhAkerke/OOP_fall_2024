package problem_6;

import java.io.Serializable;

abstract class Animal implements Serializable, Speakable, Interactable {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();

    @Override
    public String toString() {
        return name + " (" + getSound() + ")";
    }

    @Override
    public void interact(Person person) {
        System.out.println(name + " interacts with " + person.name);
    }

    @Override
    public void speak() {
        System.out.println(name + " makes a sound: " + getSound());
    }
}