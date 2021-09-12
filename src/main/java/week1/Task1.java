package week1;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
// Написать программу, которая находит минимальное значение в массиве
        System.out.println("Task 1");
        Random random = new Random();
        int[] arr = new int[10];                    // Создадим массив, заполним случайными числами
        for (
                int i = 0;
                i < arr.length; i++) {
            int x = random.nextInt(100);      // будем генерировать рандомные числа
            arr[i] = i + x;                         // чтобы каждый раз были новые расчеты
        }
        for (
                int i = 0;
                i < arr.length; i++) {
            System.out.print(arr[i] + " ");           // выведем в консоль получившийся массив в одну строку
        }
        int minValue = arr[0];                      // Создадим переменную, которая будет хранить мин значение, зададим 0
        for (
                int i = 0;
                i < arr.length; i++) {      // Теперь пробежимся по массиву сравнивая элементы
            if (arr[i] < minValue) {                  // Сформируем условие при котором будут сравниваться элементы с мин значением
                minValue = arr[i];                  // Если сработает сравнение, то запишем меньшее значение в переменную minValue
            }
        }
        System.out.println();
        System.out.println("The lowest number in array is: " + minValue);  // Выведем на экран результат
    }
}
//74 54 78 79 88 89 11 36 23 102
//The lowest number in array is: 11
