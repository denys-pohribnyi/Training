package week1;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Проверить, является ли строка палиндромом (используя массив символов)
        System.out.println("Task4");
        System.out.println("Please, enter some word to check palindrome");
        Scanner scanner = new Scanner(System.in);  // Будем принимать значение на ввод для проверки палиндром.
        String x = scanner.nextLine();              // Вводим текст в переменную х
        System.out.println("You've entered " + x);
        System.out.println("Checking...");
        char[] array = x.toLowerCase().toCharArray();   // Интерпретируем строку в массив символов с нижнем регистре(для корректной проверки)
        boolean truefalse;                              // Проверка будет либо ДА либо НЕТ, сделаю через boolean
        truefalse = palindromeCheck(array);             // Применим метод на нашем массиве
        if(!truefalse){                                             // Создадим условие ЕСЛИ НЕ палиндром
            System.out.println("This word is not palindrome!");
        }else{                                                      // Создадим условие ЕСЛИ ДА (в остальных случаях)
            System.out.println("This word is palindrome!!");
        }
    }

    public static boolean palindromeCheck(char[] array) {       // Создадим метод который вернет Да\Нет, на ввод принимает массив симв
        int a = 0;                                      // Сравниваем первый и последний символ
        int b = array.length - 1;
        while(b > a){                                   // Пробежимся по массиву сравнивая первый и последний
            if(array[a] != array[b])
                return false;
            a++;                                        // Каждая итерация идет по массиву с концов к середине
            b--;
        }
        return true;
    }
}
//Please, enter some word to check palindrome
//Hannah
//You've entered Hannah
//Checking...
//This word is palindrome!!
//---------------------------
//Please, enter some word to check palindrome
//qweuiyfash
//You've entered qweuiyfash
//Checking...
//This word is not palindrome!