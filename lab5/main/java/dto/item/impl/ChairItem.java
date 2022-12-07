package dto.item.impl;

import dto.Catalog;
import dto.item.AbstractItem;
import dto.item.Item;

public class ChairItem extends AbstractItem {

    private final String material;
    private final String style;

    public ChairItem(String name, double price, Catalog catalog, String material, String style) {
        super(name, price, catalog);
        this.material = material;
        this.style = style;
    }
}
