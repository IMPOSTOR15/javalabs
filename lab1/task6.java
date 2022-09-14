package lab1;
import java.util.Scanner;

public class task6 {
    public static void main(String[] arg) {
        sixthTask();
    }
    public static void sixthTask() {
        try (Scanner SC = new Scanner(System.in)) {
            String parity;
            String negativity;
            System.out.println("Введите число: "); 
            int number = SC.nextInt();
            if (number == 0) {
                System.out.println("Нулевое число "); 
                return;
            }
            if (number % 2 == 0){
                parity = "четное";
            }
            else {
                parity = "нечетное";
            }
            if (number > 0) {
                negativity = " положительное";
            }
            else{
                negativity = " отрицательное";
            }
            System.out.println(parity + negativity + " число"); 
        }
    }
}
