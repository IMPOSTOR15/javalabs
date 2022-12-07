package dto.item;

import dto.Catalog;
import lombok.Data;

@Data
public abstract class AbstractItem implements Item {

    private String name;
    private Double price;
    private Catalog catalog;

    public AbstractItem(String name, Double price, Catalog catalog) {
        this.name = name;
        this.price = price;
        this.catalog = catalog;
    }

    @Override
    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
        catalog.addItem(this);
    }
}
