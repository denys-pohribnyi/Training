package week1;

import java.util.Scanner;

public class Task5 {
    // Написать программу, которая выводит реверсивную строку
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 5");
        System.out.println("Enter some text to reverse it");
        String s = scanner.nextLine();                      // Запишем вводимый текст в переменную
        char[] array = s.toCharArray();                     // Преобразуем в массив символов
        String reversed = "";                               // Создадим строку в которую запишем результат
        for (int i = array.length-1; i >= 0 ; i--) {        // Пробежимся по массиву с конца
            reversed = reversed + array[i];                 // И перепишем каждый элемент на место последующего
        }
        System.out.println("Reversed text is: "+ reversed);
    }
}
//Enter some text to reverse it
//Some input text for example
//Reversed text is: elpmaxe rof txet tupni emoS
