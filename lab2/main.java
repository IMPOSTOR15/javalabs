import java.util.ArrayList;
import java.util.List;


public class main {
    public static void Main(String[] args) {

        List<Student> studentList = new ArrayList<>();//Создание массива
        //1

            studentList.add(new Student(3.5));
            studentList.add(new Student(3));
            studentList.add(new Student(3.5));
            studentList.add(new Student(4));
            studentList.add(new Aspirant(4.5));
            studentList.add(new Student(4.4));
            studentList.add(new Aspirant(5));
            studentList.add(new Aspirant(5));
            studentList.add(new Student(4.1));

        for (Student student : studentList) {
            System.out.println(" " + student.getScholarship());
        }

        System.out.println("--------------");

        //2

        List<Animal> animals = new ArrayList<>();


        animals.add(new Cat("food1", "1"));
        animals.add(new Dog("food2", "2"));
        animals.add(new Horse("food3", "3"));
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }

        System.out.println("--------------");

        //3
        Phone phone1 = new Phone("12345678900", "1", 110);
        Phone phone2 = new Phone("01237585983", "2", 120);
        Phone phone3 = new Phone("09876543211", "3", 130);

        System.out.println(phone1.getModel() + " " + phone1.getNumber() + " " + phone1.getWeight());
        System.out.println(phone2.getModel() + " " + phone2.getNumber() + " " + phone2.getWeight());
        System.out.println(phone3.getModel() + " " + phone3.getNumber() + " " + phone3.getWeight());

        phone1.receiveCall("андрей");
        phone1.receiveCall("Андрей", "12345678900");
        phone2.sendMessage("12345678900", "01237585983", "09876543211");
    }
}



//1
class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(double averageMark) {
        this.averageMark = averageMark;
    }

    public short getScholarship() {
        if (this.averageMark == 5) return 100;
        else return 80;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}


class Aspirant extends Student {

    private String nameOfScienceWork;

    public Aspirant(double averageMark) {
        super(averageMark);
    }

    @Override
    public short getScholarship() {
        if (this.getAverageMark() == 5) return 200;
        else return 180;
    }
}


//2


class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("");
    }

    public void eat() {
        System.out.println("еда");
    }

    public void sleep() {
        System.out.println("сон");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}

class Cat extends Animal{

    private short cat;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот спит");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест" + this.getFood());
    }
}

class Dog extends Animal {

    private short dog;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест" + this.getFood());
    }
}
class Horse extends Animal {

    private short horse;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь спит");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест" + this.getFood());
    }
}

class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("Еда: " + animal.getFood()
                + " Локация: " + animal.getLocation());
    }

}

//3
class Phone {

    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String callerName) {
        System.out.println("Имя " + callerName);
    }

    public void receiveCall(String callerName, String number) {
        System.out.println("Имя " + callerName + " номер: " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("");
        for (String number : numbers)
            System.out.println("номер " + number);

    }

    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
}