package lab1;
import java.util.Scanner;

public class task2 {
    public static void main(String[] arg) {
        secondTask();
    }
    public static void secondTask() {
        System.out.println("Введите трехзначное число");
        try (Scanner SC = new Scanner(System.in)) {
            int number = SC.nextInt();
            int third_digit = number % 10;
            int second_digit = (number / 10) % 10;
            int first_digit = (number / 100) % 10;
            int sum  = first_digit+second_digit+third_digit;
            System.out.println("Результат: " + sum);
        }
    }
}
