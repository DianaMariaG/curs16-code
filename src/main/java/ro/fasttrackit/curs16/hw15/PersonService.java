package ro.fasttrackit.curs16.hw15;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public Person addPerson(Person person) throws IllegalArgumentException {
        if (person == null) {
            throw new IllegalArgumentException("Person cannot be null");
        }
        Person newPerson = new Person(count()+1,person.name(),person.age());
        persons.add(newPerson);
        return newPerson;
    }

    public int count() {
        return persons.size();
    }
}
