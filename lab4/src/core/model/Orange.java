package core.model;

public class Orange implements Fruit {

    // Устанавливаем базовые параметры
    private double weight = 1.5f;
    private int count = 1;

    // Реализуем методы, созданные в интерфейсе
    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

}
