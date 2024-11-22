package problem_6;

import java.io.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person me = new Employee("Akerke", 18, "IT engineer");
        Animal myCat = new Cat("Miya", 1);

        me.speak();
        myCat.speak();

        myCat.interact(me);

        Person clonedMe = (Person) me.clone();
        System.out.println("Cloned Person: " + clonedMe);

        //Write the object to a file(serialize).
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            out.writeObject(me);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Read the object back(deserialize).
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person deserializedJohn = (Person) in.readObject();
            System.out.println("Deserialized Person: " + deserializedJohn);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}