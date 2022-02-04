package ro.fasttrackit.curs16.generics;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Optional<String> ana = Optional.of("Ana");
//        Optional.of(null);
        Optional<String> name = getName();

        if(name.isPresent()) {
            System.out.println(name.get());
        } else {
            System.out.println("Optional is empty");
        }

        System.out.println(name.orElse("Nu a venit!")); //daca nu exista valoarea, returneaza mesajul scris in parametru

        paramOptional(null); //da exceptie
    }

    private static Optional<String> getName() {
        if(System.nanoTime()%2==0){
            return Optional.empty();
        } else {
            return Optional.of("Hello");
        }
    }

    private static void paramOptional(Optional<String> input){ //niciod nu foloses Optional ca parametru pt ca nu are sesn
        if (input != null) {
            if (input.isPresent()) {
                System.out.println(input.get());
            }
        }
    }
}
