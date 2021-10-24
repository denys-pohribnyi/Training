package week6;

import java.util.Scanner;

public class Task2 {
    public static String withoutFirstAndLastChar(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        sb.deleteCharAt(inputString.length() - 1);
        sb.deleteCharAt(0);
        String result = sb.toString();
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text here: ");
        String inputString = scanner.nextLine();
        System.out.println("This text without first and last character is: ");
        System.out.println(withoutFirstAndLastChar(inputString));
    }
}
//Enter some text here:
//XtextX
//This text without first and last character is:
//text

//Для входящей строки вернуть версию без первого и последнего символов
//строки. Строка может быть любой длины, включая 0.
//public String withoutFirstAndLastChar(String inputString) {}
//"Hello" → "ell"
//"abc" → "b"