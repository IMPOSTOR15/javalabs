package dto.item.impl;

import dto.Catalog;
import dto.item.GroceryItem;
import dto.item.Item;

import java.util.Date;

public class MilkItem extends GroceryItem {

    private final double richness;
    private final String type;

    public MilkItem(String name, double price, Catalog catalog, Date expiration, double richness, String type) {
        super(name, price, catalog, expiration);
        this.richness = richness;
        this.type = type;
    }
}
