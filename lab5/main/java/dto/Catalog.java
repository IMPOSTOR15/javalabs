package dto;

import dto.item.Item;
import enums.SortEnum;
import lombok.Data;
import repo.CatalogRepo;
import repo.ItemRepo;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Data
public class Catalog {

    private final List<Item> items = new ArrayList<>();

    private String name;

    public Catalog(String name) {
        this.name = name;
    }

    public static void showAllCatalogs() {
        AtomicLong num = new AtomicLong(0);
        CatalogRepo.findAll()
                .forEach(c -> System.out.printf("%d. Название каталога: %s. Размер %d\n", num.getAndIncrement(),c.getName() , c.size()));
    }

    public int size() {
        return items.size();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> printAndSortCatalogItems(SortEnum sortBy) {
        return switch (sortBy) {
            case NAME -> print(Comparator.comparing(Item::getName));
            case PRICE -> print(Comparator.comparing(Item::getPrice));
        };
    }

    private List<Item> print(Comparator<Item> comparator) {
        AtomicLong num = new AtomicLong(0);
        return ItemRepo.findAll().stream()
                .filter(i -> i.getCatalog().getName().equals(this.name))
                .sorted(comparator)
                .peek(item -> System.out.printf("%d. Название товара: %s. Цена: %.2f\n", num.getAndIncrement(), item.getName(), item.getPrice()))
                .collect(Collectors.toList());
    }

}
