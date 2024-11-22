package problem_3;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> myCollection = new ClothCollection<>();

        // Adding elements
        myCollection.add("Hoodie");
        myCollection.add("Shirt");
        myCollection.add("Jeans");
        myCollection.add("Skirt");

        System.out.println("Collection size: " + myCollection.size());

        System.out.println("Contains 'Shirt': " + myCollection.contains("Shirt"));

        myCollection.remove("Jeans");
        System.out.println("Contains 'Jeans': " + myCollection.contains("Jeans"));

        System.out.println("Collection size: " + myCollection.size());
    }
}
