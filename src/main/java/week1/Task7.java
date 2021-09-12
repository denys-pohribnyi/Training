package week1;

import java.util.Random;

public class Task7 {
    //Написать программу, которая переворачивает массив
    public static void main(String[] args) {
        System.out.println("Task 7");
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int rnd = random.nextInt(20);
            arr[i] = rnd;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int a = 0;
        int b = arr.length-1;
        for (int i = 0; i < arr.length; i++) {

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
