package week6;

import java.util.Scanner;

public class Task3 {
    public static String repeatRepeatRepeat(String inputString) {
        String result = "";
        if (inputString.length() > 3) {
            result = inputString.substring(0, 3) + inputString.substring(0, 3) + inputString.substring(0, 3);
        } else {
            result = inputString;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = scanner.nextLine();
        System.out.println(repeatRepeatRepeat(input));
    }
}
//Enter text:
//qwertyuiop
//qweqweqwe


//. Если длина строки меньше или равно 3, то она остается без изменений. Если
//больше 3, то нужно вернуть новую строку, которая составляет 3 копии первых
//трех символов
//public String repeatRepeatRepeat(String inputString ) { }
//"Java" → "JavJavJav"
//"Chocolate" → "ChoChoCho"
//"abc" → "abс"