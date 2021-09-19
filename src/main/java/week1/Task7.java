package week1;

import java.util.Random;

public class Task7 {
    //Написать программу, которая переворачивает массив
    public static void main(String[] args) {
        System.out.println("Task 7");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {                  // Отобразим в консоли
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        reverse(arr);
        System.out.println("Reversed array is: ");
        for (int i = 0; i < arr.length; i++) {                  // Отобразим в консоли
            System.out.print(arr[i] + " ");
        }

    }

    public static void reverse(int[] arr) {
        int a = 0;
        int b = arr.length - 1;
        while (a < b) {
            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
            a++;
            b--;
        }
    }
}
//Task 7
//1 2 3 4 5 6 7 8 9
//Reversed array is:
//9 8 7 6 5 4 3 2 1
