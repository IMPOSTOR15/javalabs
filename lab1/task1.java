package lab1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] arg) {
        firstTask();
    }
    public static void firstTask() {
        System.out.print("Введите число: ");
        try (Scanner SC = new Scanner(System.in)) {
            int a = SC.nextInt();
            System.out.println("Результат: " + a % 10);
        }
    }
}
