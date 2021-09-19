package week1;

import java.util.Arrays;
import java.util.Random;

public class Dice {
    /* Игра “Кости”
1. Бросьте кубик за пользователя (сгенерируйте случайное число от 1 до 6) и
продвиньте пользователя на это количество делений на игровом поле.
2. После каждого броска вывести инфо в консоль пользователю, на каком игровом
поле он находится и сколько еще мест ему нужно пройти, чтобы выиграть.
3. Всего 5 бросков
4. Если пользователь набирает 20 до 5 бросков, завершите игру - он выиграл.
5. Если пользователь набирает больше или меньше 20 точно, то он проигрывает.
6. Помните, что на доске всего 20 делений, поэтому сообщение типа «Вы
продвинулись на позицию 22» - это баг) */
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[5];
        int sum = 0;
        int currentPlace = 0;
        int leftStepsToWin = 20;
        int currentTry = 0;
        for (int i = 0; i < arr.length; i++) {          // 5 попыток воспроизведем через цикл
            currentTry = i;
            System.out.print("Try #" + (currentTry + 1) + " "); // Отобразим актуальную попытку
            int r = rnd.nextInt(6) + 1;             // Роллим число игральной кости
            sum = arr[i] + r;
            leftStepsToWin = leftStepsToWin - sum;      // Определяем, сколько шагов осталось до победы
            if (leftStepsToWin <= -1) {           // Ограничим поле только в 20 шагов
                System.out.println("You loose! Your dice is " + sum + " but maximum range on this field is 20.");
                break;  // брейк для того, чтобы выйти из цикла если шаги остаются, но мы выхоим за рамки поля
            }
            currentPlace = currentPlace + sum;            // Определяем на каком мы шаге
            System.out.println("The rolling stone shows " + sum + ". You are on " + currentPlace + "'th place. " + leftStepsToWin + " steps left to win");
            if (i >= 4 && leftStepsToWin != 0) {
                System.out.println("Sorry, you loose, because max quantity of tries is 5 -_-");
                break;
            } else if (i >= 4 && leftStepsToWin == 0) {
                System.out.println("Winner!");
                break;
            }
        }
    }
}
//Try #1 The rolling stone shows 4. You are on 4'th place. 16 steps left to win
//Try #2 The rolling stone shows 4. You are on 8'th place. 12 steps left to win
//Try #3 The rolling stone shows 1. You are on 9'th place. 11 steps left to win
//Try #4 The rolling stone shows 5. You are on 14'th place. 6 steps left to win
//Try #5 The rolling stone shows 6. You are on 20'th place. 0 steps left to win
//Winner!
//-------------------------------------------------------------------
//Try #1 The rolling stone shows 4. You are on 4'th place. 16 steps left to win
//Try #2 The rolling stone shows 4. You are on 8'th place. 12 steps left to win
//Try #3 The rolling stone shows 1. You are on 9'th place. 11 steps left to win
//Try #4 The rolling stone shows 1. You are on 10'th place. 10 steps left to win
//Try #5 The rolling stone shows 4. You are on 14'th place. 6 steps left to win
//Sorry, you loose, because max quantity of tries is 5 -_-
//-------------------------------------------------------------------
//Try #1 The rolling stone shows 5. You are on 5'th place. 15 steps left to win
//Try #2 The rolling stone shows 6. You are on 11'th place. 9 steps left to win
//Try #3 The rolling stone shows 6. You are on 17'th place. 3 steps left to win
//Try #4 The rolling stone shows 2. You are on 19'th place. 1 steps left to win
//Try #5 You loose! Your dice is 2 but maximum range on this field is 20.