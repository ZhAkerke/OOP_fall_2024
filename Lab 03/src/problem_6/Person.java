package problem_6;

import java.io.Serializable;

abstract class Person implements Cloneable, Serializable, Speakable {
    //Serialization allows objects to be saved to a file or sent over a network.
    String name;
    int age;
    Animal pet;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
        System.out.println(name + " now owns " + pet.name);
    }

    public void removePet() {
        if (pet != null) {
            System.out.println(name + " no longer owns " + pet.name);
            this.pet = null;
        } else {
            System.out.println(name + " doesn't own a pet.");
        }
    }

    public boolean hasPet() {
        return pet != null;
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        return name + " (" + getOccupation() + "), Age: " + age +
                (pet != null ? ", Pet: " + pet.name : ", No pet");
    }

    @Override
    public void speak() {
        System.out.println(name + " is speaking to " + pet.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
        //Shallow clone copies the references to other objects, not the objects itself.
        //Deep clone copies the object and all referenced objects.
    }
}