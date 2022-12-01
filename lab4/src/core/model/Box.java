package core.model;

import java.util.ArrayList;
import java.util.List;

// Про <T> послушайте первую часть видео
public class Box<T extends Fruit> {

    // Создаем массив с типом передаваемым в класс Box
    private final List<T> fruits = new ArrayList<>();

    // Метод возвращающий вес фруктов от их количества и веса
    public double getWeight() {
        // Можно реализовать через for, если непонятно.
        // Как оно работает я объясняю в видео
        return fruits.stream()
                .mapToDouble(fruit -> fruit.getWeight() * fruit.getCount())
                .sum();
    }

    // Получаем бокс с <?> какой-то там класс, но не <T>
    public boolean compare(Box<? extends Fruit> o) {
        return this.getWeight() == o.getWeight();
    }

    // Добавление фрукта
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    // Переброска фруктов из этого ящика в принимаемый
    public void dropFruits(Box<T> anotherBox) {
        // Вызываю метод ниже
        anotherBox.addAllFruits(this.fruits);
        // Очищаю текущий массив
        this.fruits.clear();
    }

    // Добавляю в текущий массив все элементы из принимаемого массива
    private void addAllFruits(List<T> list) {
        this.fruits.addAll(list);
    }

}
