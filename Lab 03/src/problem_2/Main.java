package problem_2;

public class Main {
    public static void main(String[] args) {
        Swimmable shark = new Shark("Baby Shark", 6);
        shark.move();
        shark.swim();

        Swimmable swimmer = new Swimmer("Kuralai", 9, "Kazakhstan");
        swimmer.move();
        swimmer.swim();
    }
}