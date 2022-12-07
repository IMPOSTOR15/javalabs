package dto;

import dto.item.Item;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import repo.ItemRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@ToString
@EqualsAndHashCode
public class Cart {

    private final List<Item> items = new ArrayList<>();

    public boolean addItem(String name) {
        try {
            Item item = ItemRepo.findByName(name);
            ItemRepo.deleteByName(name);
            return this.items.add(item);
        } catch (NoSuchElementException e) {
            System.out.printf("Товара '%s' нет в наличии", name);
            return false;
        }
    }

    public Item getItem(int index) {
        try {
            return items.get(index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public double getSummary() {
        return items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }

    public boolean doOrder() {
        System.out.println("Вы купили:");
        items.forEach(item -> System.out.println(item.getName()));
        items.clear();
        return true;
    }

    public int size() {
        return items.size();
    }


}
