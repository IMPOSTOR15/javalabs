package core;

import core.collection.MyCollection;
import core.model.Apple;
import core.model.Box;
import core.model.Fruit;
import core.model.Orange;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        System.out.println(orangeBox.compare(orangeBox));

    }

}
