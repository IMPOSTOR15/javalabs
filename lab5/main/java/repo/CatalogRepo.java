package repo;


import dto.Catalog;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class CatalogRepo {

    private static List<Catalog> catalogs = new ArrayList<>();

    public static List<Catalog> findAll() {
        return catalogs;
    }

    public static Catalog findByName(String name) throws NoSuchElementException {
        return catalogs.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst().orElseThrow();
    }

    public static void save(Catalog catalog) throws KeyAlreadyExistsException {
        boolean isPresent = catalogs.stream()
                .anyMatch(c -> c.getName().equals(catalog.getName()));
        if (!isPresent) catalogs.add(catalog);
        else throw new KeyAlreadyExistsException();
    }

    public static void deleteByName(String name) {
        catalogs = catalogs.stream()
                .filter(c -> !c.getName().equals(name))
                .collect(Collectors.toList());
    }

}
