package lab1;

import java.util.Arrays;

public class task9 {
    public static void main(String[] arg) {
        ninthTask();
    }
    public static void ninthTask() {
            int[] numbers = {15,10,51, 6, 5,3, 10,-34,0,32,56, 12,24, 52};
            for (int i = 0; i < numbers.length / 2; i++) {
                int temp = numbers[i];
                numbers[i] = numbers[numbers.length - 1 - i];
                numbers[numbers.length - 1 - i] = temp;
            }
            System.out.print("Перевернутый массив: " + Arrays.toString(numbers));
        }
    }