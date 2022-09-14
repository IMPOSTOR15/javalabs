package lab1;

public class task8 {
    public static void main(String[] arg) {
        eighthTask();
    }
    public static void eighthTask() {
        int[] numbers = {1,-10,5,6,45,23,45,-34,0,32,56,-1,2,-2};
        int max = numbers[0];
        int positivSum = 0;
        int negativEvenSum = 0;
        int positivCount = 0;
        int NegativSum = 0;
        int negativEvenCount = 0;
        int avgNegativ = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
            max = numbers[i];
            }
            if (numbers[i] > 0){
            positivSum = positivSum + numbers[i];
            positivCount = positivCount + 1;
            }
            else if (numbers[i] < 0){
            if (numbers[i] % 2 == 0){
                negativEvenSum = negativEvenSum + numbers[i];
            }
            NegativSum = NegativSum + numbers[i];
            negativEvenCount = negativEvenCount + 1;
            }
        }
        avgNegativ = NegativSum / negativEvenCount;
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Сумма положительных элементов: " + positivSum);
        System.out.println("Сумма отрицательных четных элементов: " + negativEvenSum);
        System.out.println("Колличество положительных элементов: " + positivCount);
        System.out.println("Среднее арифметическое отрицательных элементов: " + avgNegativ); 
    }
}