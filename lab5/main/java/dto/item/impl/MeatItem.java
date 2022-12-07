package dto.item.impl;

import dto.Catalog;
import dto.item.GroceryItem;
import dto.item.Item;

import java.util.Date;

public class MeatItem extends GroceryItem {

    private final String type;

    public MeatItem(String name, double price, Catalog catalog, Date expiration, String type) {
        super(name, price, catalog, expiration);
        this.type = type;
    }
}
