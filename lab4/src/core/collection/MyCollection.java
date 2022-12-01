package core.collection;

// Создаем коллекцию с generic T
public class MyCollection<T> {

    // Размер списка
    private int size;

    // Ссылка на первый элемент
    private Node<T> first;

    public int size() {
        return size;
    }

    public void add(T item) {
        // Создаем новую Node
        Node<T> node = new Node<>(item);
        // Получаем текущую Node
        Node<T> current = this.first;
        // Увеличиваем размер списка
        size++;
        // Если текущий элемент = null, тогда мы присваиваем ему новый
        if(current == null) {
            first = node;
            return;
        }
        // если нет, мы получаем последний элемент
        while (current.getNext() != null) {
            current = current.getNext();
        }
        // И устанавливаем следующий элемент - новый
        current.setNext(node);
    }

    // Удаление по индексу
    public void remove(int index) {
        // Если размер списка меньше чем искомый индекс зовём Галю делать отмену
        if (index >= size-1) return;
        // Создаём переменную для подсчёта
        int i = 0;
        // Создаем переменную, хранящую текущую Node
        Node<T> current = first;
        // Создаём переменную хранящую прошлую Node
        Node<T> beforeRemoved = null;
        // Пока i не будет равен index двигаемся по списку сохраняя текущую в предыдущую, а текущей приравниваем следующую
        while (i < index) {
            beforeRemoved = current;
            current = current.getNext();
            i++;
        }
        // Когда дойдём, тогда вызываем remove
        remove(beforeRemoved, current);
    }

    // Удаление по элементу
    public void remove(T item) {
        // Так же как и в прошлый раз
        Node<T> current = first;
        Node<T> beforeRemoved = null;

        // Пока текущая не будет равна null, т.е не дойдёт до конца
        while (current != null) {
            // Если текущий равен искомому удаляем
            if (current.getValue() == item) {
                remove(beforeRemoved, current);
                return;
            }
            // Делаем также, как и в прошлой (перемещаемся)
            beforeRemoved = current;
            current = current.getNext();
        }
    }

    // Получение по индексу
    public T get(int index) {
        // Если размер списка меньше чем искомый индекс зовём Галю делать отмену
        if (index >= size) return null;
        // Создаём переменную для подсчёта
        int i = 0;
        // Создаем переменную, хранящую текущую Node
        Node<T> current = first;
        // Двигаемся по списку пока i не будет равен index
        while (i < index) {
            current = current.getNext();
            i++;
        }
        // Возвращаем текущий, найденный индекс
        return current.getValue();
    }

    // Очистка
    public void clear() {
        Node<T> current = first;
        Node<T> next;
        // Пока не дойдём до конца
        while (current != null) {
            // Сохраняем следующий
            next = current.getNext();
            // Текущий очищаем, чтобы он удалился сборщиком мусора
            current.setNext(null);
            current.setValue(null);
            current = next;
        }
        size = 0;
    }

    private void remove(Node<T> beforeRemoved, Node<T> removed) {
        // Если предыдущая не null
        if (beforeRemoved != null) {
            // Устанавливаем ей следующую от той, которую удаляем
            beforeRemoved.setNext(removed.getNext());
        }
        // Удаляемой ставим следующую null, чтобы она почистилась сборщиком мусора
        removed.setNext(null);
        removed.setValue(null);
        // Уменьшаем размер массива
        size--;
    }

    // Данный класс недоступен нигде, кроме как этому классу
    private static class Node<T> {

        // Какое-то значение
        private T value;
        // Ссылка на следующую Node
        private Node<T> next;

        // Конструктор
        public Node(T value) {
            this.value = value;
        }

        // Getters and Setters
        public T getValue() {
            return this.value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return this.next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

    }

    @Override
    public String toString() {
        if(size == 0) return "null";
        StringBuilder result = new StringBuilder();
        Node<T> current = first;
        while (current != null) {
            result.append(current.getValue()).append(" -> ");
            current = current.getNext();
        }
        result.append(" null");
        return result.toString();
    }
}
