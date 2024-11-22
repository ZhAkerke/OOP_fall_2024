public class Restaurant {
    public String name;

    boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (eater instanceof Person) {
            System.out.println("You have to pay!");
            System.out.println("Processing payment...");
            return true;
        }
        else if (eater instanceof Animal) {
            System.out.println("You can have a slice for free!");
            return true;
        }
        return false;
    }

    boolean serveDrink(CanHaveDrink drinker) {
        drinker.drink();
        if (drinker instanceof Person) {
            System.out.println("Processing payment...");
            return true;
        }
        else if (drinker instanceof Animal) {
            System.out.println("You can not drink");
            return false;
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void heading() {
        System.out.println("Heading: " + name);
    }
}