package problem_6;

import java.util.ArrayList;
import java.util.List;

class PersonRegistry {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public List<Person> getPeopleWithPets() {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.hasPet()) result.add(person);
        }
        return result;
    }

    public void printRegistry() {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
