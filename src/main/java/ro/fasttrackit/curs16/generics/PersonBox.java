package ro.fasttrackit.curs16.generics;

public class PersonBox<T extends Person> {
    private final T person;

    public PersonBox(T person) {
        this.person = person;
    }

    public T getPerson() {
        return person;
    }
}
