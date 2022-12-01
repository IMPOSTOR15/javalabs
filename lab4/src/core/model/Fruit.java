package core.model;

// Создаём интерфейс для родителя обобщения (можно заменить на класс (нужно будет в Apple и Orange сделать extends вместо implements))
public interface Fruit {

    // Описываем логику получения и добавления параметров фруктов

    double getWeight();

    void setWeight(double weight);

    int getCount();

    void setCount(int count);
}
