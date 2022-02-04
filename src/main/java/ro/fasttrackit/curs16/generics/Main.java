package ro.fasttrackit.curs16.generics;

public class Main {
    public static void main(String[] args) {
        OldBox old1 = new OldBox("Ana");
        OldBox old2 = new OldBox(1);

        Object item = old1.getItem();
        boxUser(old1);
        //boxUser(old2);

        Box<String> new1 = new Box<>("Ana");
        Box<Integer> new2 = new Box<>(1);

        String newItem = new1.getItem();
        newBoxUser(new1);
        //newBoxUser(new2); //nu pot pt ca met vrea sa ii dau String, nu int

        PersonBox<Person> personBox = new PersonBox<>(new Person("Ana"));
        PersonBox<Employee> employeeBox = new PersonBox<>(new Employee("Radu",100));
        PersonBox<Person> employee2 = new PersonBox<>(new Employee("Mihai",100));


        Person ana = new Person ("Ana");
        Pair<String, Integer> stirngPair = new Pair<>("abc",5);
        Pair<Person, Double> personPair = new Pair<>(ana,2.3);
        System.out.println(stirngPair.getSecond());
        System.out.println(personPair.getSecond());



    }

    private static void newBoxUser(Box<String> box) {
        String item = box.getItem();
        System.out.println(item.length());
    }

    private static void boxUser(OldBox box) {
        String value =(String) box.getItem();
        System.out.println(value.length());
    }
}
