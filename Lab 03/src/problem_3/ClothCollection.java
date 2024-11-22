package problem_3;

import java.util.ArrayList;

class ClothCollection<T> implements MyCollection<T> {
    ArrayList<T> wardrobe;

    public ClothCollection() {
        this.wardrobe = new ArrayList<>();
    }
    @Override
    public void add(T element) {
        wardrobe.add(element);
        System.out.println(element + " added to the wardrobe");
    }

    @Override
    public void remove(T element) {
        wardrobe.remove(element);
        System.out.println(element + " removed from the wardrobe");
    }

    @Override
    public boolean contains(T element) {
        return wardrobe.contains(element);
    }

    @Override
    public int size() {
        return wardrobe.size();
    }
}