package lab1;
import java.util.Scanner;

public class task4 {
    public static void main(String[] arg) {
        fourthTask();
    }
    public static void fourthTask() {
        System.out.print("Введите число: ");
        try (Scanner SC = new Scanner(System.in)) {
            int number = SC.nextInt();
            if (number > 0) {
                number = number + 1;
            }
            else if (number < 0){
                number = number - 2;
            }
            else{
                number = 10;
            }
            System.out.println("Результат: " + number);
        }
    }
}
