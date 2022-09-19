package lab1;
import java.util.Scanner;

public class task5 {
    public static void main(String[] arg) {
        fifthTask();
    }
    public static void fifthTask() {
        try (Scanner SC = new Scanner(System.in)) {
            System.out.println("Введите первое число:"); 
            int firtstNumber = SC.nextInt();
            System.out.println("Введите второе число:"); 
            int secondNumber = SC.nextInt();
            System.out.println("Введите третье число:"); 
            int thirdNumber = SC.nextInt();
            if (firtstNumber < secondNumber && firtstNumber < thirdNumber)
                System.out.println("Результат: " + firtstNumber);
            else if (secondNumber < secondNumber && secondNumber < thirdNumber)
                System.out.println("Результат: " + secondNumber);
            else if (thirdNumber < secondNumber && thirdNumber < firtstNumber)
                System.out.println("Результат: " + thirdNumber);
            else
                System.out.println("Введите разные числа");
        }
    }
}