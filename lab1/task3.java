package lab1;
import java.util.Scanner;

public class task3 {
    public static void main(String[] arg) {
        thirdTask();
    }
    public static void thirdTask() {
        System.out.print("Введите число: ");
        try (Scanner SC = new Scanner(System.in)) {
            int number = SC.nextInt();
            if (number > 0) {
            number = number + 1;
            }
            System.out.println("Результат: " + number);
        }
    }
}