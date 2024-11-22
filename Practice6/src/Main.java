public class Main {
    public static void main(String[] args) {
        Student meStudent = new Student ("Akerke", 18, "23B030357");
        System.out.println(meStudent.getStudentID());

        Cat myCat = new Cat("Miya", 1);
        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());

        Restaurant restik = new Restaurant();

        myCat.eatPizza();
        meStudent.drink();
    }
}