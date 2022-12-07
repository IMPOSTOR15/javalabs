package dto.item.impl;

import dto.Catalog;
import dto.item.GroceryItem;
import lombok.Getter;

import java.util.Date;

public class BreadItem extends GroceryItem {

    @Getter
    private final String type;

    public BreadItem(String name, double price, Catalog catalog, Date expiration, String type) {
        super(name, price, catalog, expiration);
        this.type = type;
    }
}
