package week1;

import java.util.Scanner;

public class Task5 {
    // Написать программу, которая выводит реверсивную строку
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 5");
        System.out.println("Enter some text to reverse it");
        String s = scanner.nextLine();
        char[] array = s.toCharArray();
        int x = array[0];
        int z = array[array.length-1];
        String reversed = "";
        for (int i = array.length-1; i >= 0 ; i--) {
            reversed = reversed + array[i];
        }
        System.out.println("Reversed text is: "+ reversed);
    }
}
