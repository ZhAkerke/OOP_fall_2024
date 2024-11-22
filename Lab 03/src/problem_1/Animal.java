package problem_1;

abstract class Animal {
    public String name;

    abstract void sound();

    /*
    Use abstract classes WHEN defining shared structure and behavior in related classes.
    Example: Animals can eat the same way, but their sound are different.
     */

    void eat() {
        System.out.println(name + "is eating"); // Finished method
    }
}