package ro.fasttrackit.curs16.homework.ex2;

import java.util.Objects;

import static ro.fasttrackit.curs16.homework.ex2.StringUtils.*;

public class Electronics implements ShopItem{
    private final String electroName;
    private final int electroPrice;
    private final Category electroCat;

    public Electronics(String electroName, int electroPrice, Category electroCat) {
        this.electroName = ensureNotEmpty(electroName);
        this.electroPrice = validPrice(electroPrice);
        this.electroCat = electroCat;
    }

    @Override
    public String name() {
        return electroName;
    }

    @Override
    public int price() {
        return electroPrice;
    }

    @Override
    public Category category() {
        return electroCat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electronics that = (Electronics) o;
        return electroPrice == that.electroPrice && Objects.equals(electroName, that.electroName) && electroCat == that.electroCat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(electroName, electroPrice, electroCat);
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "electroName='" + electroName + '\'' +
                ", electroPrice=" + electroPrice +
                ", electroCat=" + electroCat +
                '}';
    }
}
