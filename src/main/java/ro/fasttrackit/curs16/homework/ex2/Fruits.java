package ro.fasttrackit.curs16.homework.ex2;

import java.util.Objects;

import static ro.fasttrackit.curs16.homework.ex2.Category.*;
import static ro.fasttrackit.curs16.homework.ex2.StringUtils.*;

public class Fruits implements ShopItem{
    private final String fruitName;
    private final int fruitPrice;
    private final Category fruitCat;

    public Fruits(String fruitName, int fruitPrice) {
        this.fruitName = ensureNotEmpty(fruitName);
        this.fruitPrice = validPrice(fruitPrice);
        this.fruitCat = NEW;
    }

    @Override
    public String name() {
        return fruitName;
    }

    @Override
    public int price() {
        return fruitPrice;
    }

    @Override
    public Category category() {
        return NEW;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruits fruits = (Fruits) o;
        return fruitPrice == fruits.fruitPrice && Objects.equals(fruitName, fruits.fruitName) && fruitCat == fruits.fruitCat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruitName, fruitPrice, fruitCat);
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitPrice=" + fruitPrice +
                ", fruitCat=" + fruitCat +
                '}';
    }
}
