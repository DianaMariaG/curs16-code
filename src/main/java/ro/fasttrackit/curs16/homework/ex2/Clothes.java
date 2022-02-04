package ro.fasttrackit.curs16.homework.ex2;

import java.util.Objects;

import static ro.fasttrackit.curs16.homework.ex2.StringUtils.*;

public class Clothes implements ShopItem{
    private final String clothesName;
    private final int clothesPrice;
    private final Category clothesCat;

    public Clothes (String clothesName, int clothesPrice, Category clothesCat) {
        this.clothesName = ensureNotEmpty(clothesName);
        this.clothesPrice = validPrice(clothesPrice);
        this.clothesCat = clothesCat;
    }

    @Override
    public String name() {
        return clothesName;
    }

    @Override
    public int price() {
        return clothesPrice;
    }

    @Override
    public Category category() {
        return clothesCat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return clothesPrice == clothes.clothesPrice && Objects.equals(clothesName, clothes.clothesName) && clothesCat == clothes.clothesCat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clothesName, clothesPrice, clothesCat);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "clothesName='" + clothesName + '\'' +
                ", clothesPrice=" + clothesPrice +
                ", clothesCat=" + clothesCat +
                '}';
    }
}
