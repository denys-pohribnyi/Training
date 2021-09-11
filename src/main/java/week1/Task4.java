package week1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Проверить, является ли строка палиндромом (используя массив символов)
        System.out.println("Task4");
        System.out.println("Please, enter some word to check palindrome");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println("You've entered " + x);
        System.out.println("Checking...");
        char[] array = x.toCharArray();
        boolean truefalse;
        truefalse = palindromeCheck(array);
        if(!truefalse){
            System.out.println("This text is not palindrome!");
        }else{
            System.out.println("This text is palindrome!!");
        }
    }

    public static boolean palindromeCheck(char[] array) {
        int a = 0;
        int b = array.length - 1;
        while(b > a){
            if(array[a] != array[b])
                return false;
            a++;
            b--;
        }
        return true;
    }
}
