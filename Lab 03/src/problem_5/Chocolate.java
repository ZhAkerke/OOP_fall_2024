package problem_5;

class Chocolate implements Comparable<Chocolate> {
    String name;
    int weight;

    Chocolate(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Chocolate: Name=" + name + ", Weight=" + weight + " g.";
    }
}