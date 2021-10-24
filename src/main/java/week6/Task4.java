package week6;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static String backAround(String input) {
        StringBuilder sb = new StringBuilder(input);
        char last = input.charAt(input.length() - 1);
        sb.insert(input.length() - 1, last);
        sb.insert(0, last);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String input = scanner.nextLine();
        System.out.println("Result: ");
        System.out.println(backAround(input));
    }
}
//Enter some text:
//text
//Result:
//ttextt

// Взять последний символ в строке и вернуть новую строку с последним
//символом, добавленным спереди и сзади, «cat» -> «tcatt».
//public String backAround(String str) {}
//"cat" → "tcatt"
//"Hello" → "oHelloo"
//"a" → "aaa"