package ro.fasttrackit.curs16.generics;
//in OldBox e mereu Object, aici poate fi orice object, dar doar cel pe care l-ai instantiat
public class Box<T> {
    private T item;

    public Box(T item){ //T va fi decis cand instantiez un obiect
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
