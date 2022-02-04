package ro.fasttrackit.curs16.homework.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop <T extends ShopItem> {
    private final List<T> items = new ArrayList<>();

    public Shop(List<T> objects) {
        if (objects != null) {
            this.items.addAll(objects);
        }
    }

    public void addItem(T item) throws IllegalArgumentException {
        if (item == null) {
            throw new IllegalArgumentException("Cannot add a null item!");
        }
        items.add(item);
    }

    public List<T> findByCategory(Category cat) throws IllegalArgumentException {
        if (cat == null) {
            throw new IllegalArgumentException("The category cannot be null!");
        }
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.category() == cat) {
                result.add(item);
            }
        }
        return result;
    }

    public List<T> findWithLowerPrice(int maxPrice) throws IllegalArgumentException {
        if (maxPrice < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.price() <= maxPrice) {
                result.add(item);
            }
        }
        return result;
    }

    public Optional<T> findByName (String name) {
        if (name != null) {
            for (T item : items) {
                if (item.name().equals(name)) {
                    return Optional.of(item);
                }
            }
        }
        return Optional.empty();
    }

    public Optional<T> removeItem (String name) {
        if (name != null) {
            for (T item : items) {
                if (item.name().equals(name)) {
                    items.remove(item);
                    return Optional.of(item);
                }
            }
        }
        return Optional.empty();
    }
    public List<T> getItems() {
        return new ArrayList<>(items);
    }
}
