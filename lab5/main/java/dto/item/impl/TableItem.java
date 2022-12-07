package dto.item.impl;

import dto.Catalog;
import dto.item.AbstractItem;

public class TableItem extends AbstractItem {

    private final String material;
    private final String style;

    public TableItem(String name, double price, Catalog catalog, String material, String style) {
        super(name, price, catalog);
        this.material = material;
        this.style = style;
    }
}
