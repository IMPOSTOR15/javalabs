package repo;

import dto.item.Item;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class ItemRepo {

    private static List<Item> items = new ArrayList<>();

    public static List<Item> findAll() {
        return items;
    }

    public static Item findByName(String name) throws NoSuchElementException {
        return items.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst().orElseThrow();
    }

    public static void add(Item item) throws KeyAlreadyExistsException {
        items.add(item);
    }

    public static void update(Item item) throws NoSuchElementException {
        Item item2 = items.stream()
                .filter(c -> c.getName().equals(item.getName()))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
        if (item.getPrice() != null) item2.setPrice(item.getPrice());
        if (item.getCatalog() != null) item2.setCatalog(item.getCatalog());
    }

    public static void deleteByName(String name) {
        items = items.stream()
                .filter(c -> !c.getName().equals(name))
                .collect(Collectors.toList());
    }

}
