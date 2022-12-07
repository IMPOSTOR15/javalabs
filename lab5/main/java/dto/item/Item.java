package dto.item;

import dto.Catalog;

public interface Item {

    String getName();

    void setName(String name);

    Double getPrice();

    void setPrice(Double price);

    Catalog getCatalog();

    void setCatalog(Catalog catalog);

}
