package lab1;
import java.util.Scanner;

public class task7 {
    public static void main(String[] arg) {
        seventhTask();
    }
    public static void seventhTask() {
        try (Scanner SC = new Scanner(System.in)) {
            System.out.println("Введите код города: "); 
            int number = SC.nextInt();
            if (number == 905)
                System.out.println("Москва. Стоимость разговора: " + 4.15*10);
            else if (number == 194)
                System.out.println("Ростов. Стоимость разговора: " + 1.98*10);
            else if (number == 491)
                System.out.println("Краснодар. Стоимость разговора: " + 2.69*10);
            else if (number == 800)
                System.out.println("Киров. Стоимость разговора: " + 5*10); 
            else
                System.out.println("Регион не найден"); 
        }
    }
}