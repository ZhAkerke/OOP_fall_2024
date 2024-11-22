package problem_2;

class Swimmer implements Swimmable {
    public String name;
    public int speed;
    public String country;

    public Swimmer(String name, int speed, String country) {
        this.name = name;
        this.speed = speed;
        this.country = country;
    }

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public String getCountry() {
        return country;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }
    public void setCountry(String newCountry) {
        country = newCountry;
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming " + getSpeed() + " km/h");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is just moving");
    }
}