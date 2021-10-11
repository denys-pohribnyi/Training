package week5_3;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDouble {
    Double tryParseDouble(String temp) {
        try {
            return new Double(temp);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some 5 values (only Double type) :");
        double sum = 0;
        double value = 0;
        String temp = "";
        double tempVal = 0.0;
        for (int i = 0; i < 5; i++) {
            int iterator = i;
            // Записать вводимое число в temp, проверить что это дабл и только потом учитывать.
            temp = scanner.nextLine();
            try {
                tempVal = Double.parseDouble(temp);
            } catch (NumberFormatException e) {
                System.out.println("Error! Only type 'Double' is allowed here!");
                i--;  // В случае ошибки вернемся на одну итерацию назад
            }
            value = tempVal;
            sum = value + sum;
            System.out.println("You've entered " + value);
            if (i == 4) {
                System.out.println("Sum of values you entered is: " + sum);
            }
        }
        System.out.println();
    }
}
//1. Написать в main метод который вычисляет сумму 5 double. Получает он их со
//сканера. Сделать это в цикле for. Если пользователь вводит неверный тип
//данных - эта ошибка обрабатывается - выводится в консоль инфо и программа
//продолжает свое действие. Важно чтобы даже если число суммируемых чисел
//было 5 (т е если пользователь ввел неверное знач, то счетчик не
//увеличивается)