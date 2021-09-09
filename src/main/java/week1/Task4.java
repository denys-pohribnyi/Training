package week1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Проверить, является ли строка палиндромом (используя массив символов)
        System.out.println("Task4");
        System.out.println("Please, enter some word to check palindrome");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println("You've entered "+x);
        System.out.println("Checking...");
        char[] array = x.toCharArray();

        int first = array[0];
        int last = array[array.length-1];
        while(first<last){

                if(first != last){
                    System.out.println("It is not palindrome");
                    break;
                }

            first++;
            last--;
        }
    }
}
