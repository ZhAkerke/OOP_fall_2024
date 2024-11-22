package problem_6;

class PhDStudent extends Student {
    String researchArea;

    PhDStudent(String name, int age, String major, String researchArea) {
        super(name, age, major);
        this.researchArea = researchArea;
    }

    @Override
    public String getOccupation() {
        return "PhD Student (" + researchArea + ")";
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD Students cannot have Dogs.");
        } else {
            super.assignPet(pet);
        }
    }
}