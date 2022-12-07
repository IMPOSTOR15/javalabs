package dto.item.impl;

import dto.Catalog;
import dto.item.AbstractItem;

public class LampItem extends AbstractItem {

    private final String material;
    private final String style;
    private final String typeOfLamp;

    public LampItem(String name, double price, Catalog catalog, String material, String style, String typeOfLamp) {
        super(name, price, catalog);
        this.material = material;
        this.style = style;
        this.typeOfLamp = typeOfLamp;
    }
}
