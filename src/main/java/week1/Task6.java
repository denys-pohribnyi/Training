package week1;

import java.util.Random;

public class Task6 {
    //Написать программу, которая подсчитывает количество элементов массива int*ов,
    //которые делятся на 2, но не делятся на 3 и выводит в консоль
    public static void main(String[] args) {
        System.out.println("Task 6");
        /*
        * Есть числовой массив -  Создать массив
        * Числа в массиве должны делиться на 2, при этом не делятся на 3
        * Выводить в консоль эти числа
        *
        *  */
        Random random = new Random();
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            int rnd = random.nextInt(100);
            arr[i] = rnd;
        }
        for (int i = 0; i < arr.length; i++) {  // Просто распечатаем созданный массив
            System.out.print(arr[i]+" ");
        }
        // Пробежимся по массиву и поделим каждое число на 2 и на 3
        for (int i = 0; i < arr.length; i++) {

        }





    }
}
