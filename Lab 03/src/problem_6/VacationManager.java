package problem_6;

class VacationManager {
    public static void leavePetWith(Person owner, Person caretaker) {
        if (!owner.hasPet()) {
            System.out.println(owner.name + " has no pet to leave.");
            return;
        }

        if (caretaker instanceof PhDStudent && owner.pet instanceof Dog) {
            System.out.println("PhD Students cannot take care of Dogs.");
            return;
        }

        caretaker.assignPet(owner.pet);
        owner.removePet();
    }

    public static void retrievePet(Person owner, Person caretaker) {
        if (!caretaker.hasPet()) {
            System.out.println(caretaker.name + " has no pet to return.");
            return;
        }

        owner.assignPet(caretaker.pet);
        caretaker.removePet();
    }
}
