package homework.ex2;

import org.assertj.core.api.AssertionsForClassTypes;
import org.assertj.core.internal.bytebuddy.pool.TypePool;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.curs16.homework.ex2.*;
import org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static ro.fasttrackit.curs16.homework.ex2.Category.*;

public class ShopTest {
    @Test
    @DisplayName("WHEN a null item is added THEN throw exception")
    void testAddNullItem() {
        //SETUP
        Shop shop = new Shop(List.of(
                new Clothes("dress",300, ON_SALE),
                new Electronics("camera",500, REFURBISHED),
                new Fruits("oranges",40)
        ));
        //RUN
        IllegalArgumentException exc1 = assertThrows(IllegalArgumentException.class,
                () -> shop.addItem(null));
        //ASSERT
        assertThat(exc1.getMessage()).isEqualTo("Cannot add a null item!");
    }
    @Test
    @DisplayName("WHEN an item is provided THEN add it in the list of items")
    void testAddItem() {
        Shop<Clothes> shop1 = new Shop(List.of(
                new Clothes("dress",400, ON_SALE),
                new Clothes("gloves",500, NEW)
        ));
        Clothes clt1 = new Clothes("dress",400, ON_SALE);
        Clothes clt2 = new Clothes("gloves",500, NEW);
        Clothes clt3 = new Clothes("scarf",300,ON_SALE);

        //RUN
        shop1.addItem(new Clothes("scarf",300,ON_SALE));
        //ASSERT
        org.assertj.core.api.Assertions.assertThat(shop1.getItems()).hasSize(3)
                .containsExactlyInAnyOrder(clt1, clt2, clt3);
    }

    @Test
    @DisplayName("WHEN category is null then throw exception")
    void testFindByNullCategory() {
        //SETUP
        Shop<Electronics> shop2 = new Shop(List.of(
                new Electronics("washing machine",1000,REFURBISHED),
                new Electronics("vaccum cleaner",800,NEW)
        ));
        //RUN
        IllegalArgumentException exc1 = assertThrows(IllegalArgumentException.class,
                () -> shop2.findByCategory(null));
        //ASSERT
        assertThat(exc1.getMessage()).isEqualTo("The category cannot be null!");
    }
    @Test
    @DisplayName("WHEN category is given THEN find item and add it to List<T>")
    void testFinfByCategory() {
        //SETUP
        Shop<Electronics> shop2 = new Shop(List.of(
                new Electronics("washing machine", 1000, REFURBISHED),
                new Electronics("vacuum cleaner", 800, NEW)
        ));
        //RUN
        List<Electronics> actual = shop2.findByCategory(NEW);
        //ASSERT
        org.assertj.core.api.Assertions.assertThat(actual).hasSize(1)
                .containsExactlyInAnyOrder(new Electronics("vacuum cleaner",800,NEW));
    }

    @Test
    @DisplayName("WHEN price is negative THEN throw exception")
    void testFindWithNegativePrice() {
        //SETUP
        Shop<Fruits> shop3 = new Shop(List.of(
                new Fruits("pomegranate",50),
                new Fruits("star-fruit",70)
        ));
        //RUN
        IllegalArgumentException exc1 = assertThrows(IllegalArgumentException.class,
                () -> shop3.findWithLowerPrice(-70));
        //ASSERT
        assertThat(exc1.getMessage()).isEqualTo("Price cannot be negative");
    }
    @Test
    @DisplayName("WHEN a maxPrice is given THEN return items with lower price")
            void testFindWithLowerPrice() {
        //SETUP
        Shop<Fruits> shop3 = new Shop(List.of(
                new Fruits("pomegranate", 50),
                new Fruits("star-fruit", 70),
                new Fruits("orange", 25)
        ));
        //RUN
        List<Fruits> actual = shop3.findWithLowerPrice(50);
        //ASSERT
        org.assertj.core.api.Assertions.assertThat(actual).hasSize(2)
                .containsExactlyInAnyOrder(new Fruits("pomegranate", 50),
                                           new Fruits("orange", 25));
    }

    @Test
    @DisplayName("WHEN null/inexistent name is given THEN return Optional.empty(), else return Optional<T>")
    void testFindByName() {
        //SETUP
        Shop<Electronics> shop2 = new Shop(List.of(
                new Electronics("washing machine", 1000, REFURBISHED),
                new Electronics("vacuum cleaner", 800, NEW)
        ));
        //RUN
        Optional<Electronics> actual1 = shop2.findByName("water");
        Optional<Electronics> actual2 = shop2.findByName("washing machine");
        Optional<Electronics> actual3 = shop2.findByName(null);
        //ASSERT
        assertThat(actual1).isEqualTo(Optional.empty());
        assertThat(actual2.get()).isEqualTo(new Electronics("washing machine",1000, REFURBISHED));
        assertThat(actual3).isEqualTo(Optional.empty());
    }

    @Test
    @DisplayName("WHEN null/inexistent name is given THEN return Optional.empty(), else remove item and return Optional<T>")
    void testRemoveName() {
        //SETUP
        Shop<Fruits> shop3 = new Shop(List.of(
                new Fruits("pomegranate", 50),
                new Fruits("star-fruit", 70),
                new Fruits("orange", 25)
        ));
        //RUN
        Optional<Fruits> actual1 = shop3.removeItem("coconut");
        Optional<Fruits> actual2 = shop3.removeItem(null);
        Optional<Fruits> actual3 = shop3.removeItem("pomegranate");
        //ASSERT
        assertThat(actual1).isEqualTo(Optional.empty());
        assertThat(actual2).isEqualTo(Optional.empty());
        assertThat(actual3.get()).isEqualTo(new Fruits("pomegranate", 50));
    }
}
