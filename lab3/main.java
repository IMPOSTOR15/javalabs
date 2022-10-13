import java.util.HashMap;
import java.util.Map;

class main {

    public static void main(String[] arg) {
        System.out.println("------Task 1------");
        Task1();
        System.out.println("------Task 2------");
        Task2();
        System.out.println("------Task 3------");
        Task3();
        System.out.println("------Task 4------");
        Task4();
        System.out.println("------Task 5------");
        Task5();
        System.out.println("------Task 6------");
        Task6();
        System.out.println("------Task 7------");
        Task7();
        System.out.println("------Task 8------");
        Task8();
        System.out.println("------Task 9------");
        Task9();
        System.out.println("------Task 10------");
        Task10();
        System.out.println("------Task 11------");
        Task11();
        System.out.println("------Task 12------");
        Task12();
        System.out.println("------Task 13------");
        Task13();
        System.out.println("------Task 14------");
        Task14();
        System.out.println("------Task 15------");
        Task15();
        System.out.println("------Task 16------");
        Task16();
        System.out.println("------Task 17------");
        Task17();
        System.out.println("------Task 18------");
        Task18();
    }

    //Задание 1
    //Написать программу, которая проверяет, является ли строка палиндромом

    public static void Task1() {
        
        String word = "reliefpfpfeiller";
        char[] simArr = word.toCharArray(); 
        int i1 = 0;
        int i2 = simArr.length - 1;
        boolean check = false;
        while (i2 > i1) {
            if (simArr[i1] != simArr[i2]) {
                check = false;
            }
            ++i1;
            --i2;
        }
        check = true;
        System.out.println(check);
    }

    //Задание 2
    //Реализовать удаление повторяющихся символов в строке

    public static void Task2() {
        String s = "sdfkhdklgjkjjjgfrtyuio";
        StringBuilder noDupes = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String si = s.substring(i, i + 1);
            if (noDupes.indexOf(si) == -1) {
                noDupes.append(si);
            }
        }
        System.out.println(noDupes.toString());
    }

    //Задание 3
    //Реализовать проверку, являются ли две строки анаграммами

    public static void Task3() {
        String s = "new york times";
        String t = "monkeys write";
        t = t.replaceAll(" ", "");
        s = s.replaceAll(" ", "");
        boolean isAnagram;
        if (s.length() != t.length()) {
            isAnagram = false;
        }
    
        int[] letters = new int[256];
    
        char[] s_array = s.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }
    
        for (int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            if (--letters[c] < 0) {
                isAnagram = true;
            }
        }
        isAnagram = true;
        System.out.println(isAnagram);
    }

    //Задание 4
    //Напишите Java-программу для лексикографического сравнения двух строк.
    public static void Task4() {
        String input_string_1 = "Apple";
        System.out.println("The first string: " + input_string_1);
        String input_string_2 = "Orange";
        System.out.println("The second string: " + input_string_2);
        System.out.println("\nThe result of comparing the two strings is: " + input_string_1.compareTo(input_string_2));
    }

    //Задание 5
    //Напишите Java-программу для лексикографического сравнения двух строк, игнорируя различия в регистре.
    public static void Task5() {
        String input_string_1 = "Apple";
        System.out.println("The first string: " + input_string_1);
        String input_string_2 = "Orange";
        System.out.println("The second string: " + input_string_2);
        System.out.println("\nThe result of comparing the two strings without register is: ");
        System.out.println(input_string_1.toLowerCase().compareTo(input_string_2.toLowerCase()));
    }

    //Задание 6
    //Напишите программу на Java для объединения данной строки в конец другой строки.
    public static void Task6() {
        String s = "Apple ";
        String t = "Orange"; 

        s = s.concat(t); 

        System.out.println(s); 
    }

    //Задание 7
    //Напишите Java-программу для сравнения заданной строки с указанной последовательностью символов.
    public static void Task7() {
        String s = "Orange";
        CharSequence t = "Orange";
        if (s.contentEquals(t) == true) {
            System.out.println("Strings equals");
        }
        else {
            System.out.println("Strings different");
        }
    }

    //Задание 8
    //Напишите программу на Java, чтобы проверить, заканчивается ли данная строка содержимым другой строки.
    public static void Task8() {
        String s = "Orange";
        String t = "Tree of Orange";
        System.out.println(t.endsWith(s));
    }

    //Задание 9
    //Напишите программу на Java, чтобы проверить, содержат ли два объекта String одинаковые данные.
    public static void Task9() {
        String s = "orange";
        String t = "egnaro";
        System.out.println(s.equals(t));
    }

    //Задание 10
    //Напишите Java-программу, чтобы получить длину заданной строки.
    public static void Task10() {
        String s = "orange";
        System.out.println("String length: "+ s.length());
    }

    //Задание 11
    //Напишите программу на Java, чтобы преобразовать все символы строки в нижний регистр.
    public static void Task11() {
        String s = "orange";
        System.out.println(s.toLowerCase());
    }

    //Задание 12
    //Напишите программу на Java, чтобы преобразовать все символы в строке в верхний регистр. 
    public static void Task12() {
        String s = "orange";
        System.out.println(s.toUpperCase());
    }

    //Задание 13
    //Напишите программу на Java, чтобы найти второй по частоте символ в данной строке.
    public static void Task13() {
        Map <String, Integer> letters = new HashMap<String,Integer>();
        String words = "oraangeapple";
        int wordLen = words.length();
        for (int i = 0; i < wordLen; ){
            int count=0;
            char t = words.charAt(i);
            int index = i;
            boolean b = true;
            while (b) {
                if(words.indexOf(t, index) != -1) {
                    count++;
                    index++;
                }else{
                    b = false;
                    i=index;
                }
            }
            letters.put(Character.toString(t),count);
        }
        String maxKey = null;
        for (String key : letters.keySet()) {
            if (maxKey == null || letters.get(key) > letters.get(maxKey)) {
                maxKey = key;
            }
        }
        letters.remove(maxKey);
        maxKey = null;
        for (String key : letters.keySet()) {
            if (maxKey == null || letters.get(key) > letters.get(maxKey)) {
                maxKey = key;
            }
        }
        System.out.println(maxKey);
    }

    //Задание 14
    //Напишите программу на Java для печати после удаления дубликатов из заданной строки.
    public static void Task14() {
        String s = "orangeapple";
        String str = s.trim().replace(" ", "");
        StringBuilder sb = new StringBuilder(str);
        StringBuilder deletedSimsSB = new StringBuilder();
        for (int i = 1; i < sb.length(); i++) {
            String ch = String.valueOf(sb.charAt(i - 1));
            while (sb.indexOf(ch, i) != -1) {
                deletedSimsSB.append(sb.charAt(sb.indexOf(ch, i)));
                sb.deleteCharAt(sb.indexOf(ch, i));
            }
        }
        System.out.println(deletedSimsSB.toString());
    }

    //Задание 15
    //Напишите программу на Java, чтобы найти первый неповторяющийся символ в строке.
    public static void Task15() {
        String str = "oorrangeapple";
        boolean f = true;
        for (int i = 0; i < str.length() && f; i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.print( str.charAt(i));
                f = false;
            }
        }
    }

    //Задание 16
    //Напишите программу на Java, которая возвращает true из заданной строки, если первые два символа в строке также появляются в конце.
    public static void Task16() {
        String s = "qwerqw";
        String start = (s.substring(0,2)).toLowerCase();
        String end = (s.substring(s.length()-2)).toLowerCase();
        System.out.println(start.equals(end));
    }

    //Задание 17
    //Напишите программу на Java, которая возвращает количество символов, появляющихся три раза подряд в строке.
    public static void Task17() {
        String s = "orangeapplep";
        int len = s.length();
        int countSim = 0;
        for (int i = 0; i < len; ){
            int count=0;
            char sim = s.charAt(i);
            int index = i;
            boolean check = true;
            while (check) {
                if(s.indexOf(sim, index) != -1) {
                    count++;
                    index++;
                }else{
                    check = false;
                    i=index;
                }
            }
            if(count == 3){
                countSim++;
            }
        }
        System.out.println(countSim);
    }

    //Задание 18
    //Напишите программу на Java, которая возвращает сумму цифр, присутствующих в строке. Если цифр нет, возвращаемая сумма равна 0.
    public static void Task18() {
        String s = "1orange2apples";
        int sum = 0;
        s = s.replaceAll("[^0-9]", "");
        if (s.isEmpty()){
            System.out.println("summ = " + sum);
        }
        else{
            boolean check = true;
            int num = Integer.parseInt(s);
            while (check){
                sum+=num%10;
                num/=10;
                if(num <= 0){
                    check = false;
                }
            }
            System.out.println(sum);
        }
    }
}