package week1;

import java.util.Arrays;
import java.util.Random;

public class Dice {
    /* Игра “Кости”
1. Бросьте кубик за пользователя (сгенерируйте случайное число от 1 до 6) и
продвиньте пользователя на это количество делений на игровом поле.
код который возвращает рандомное число от 1 до 6
Random random = new Random();
int die = random.nextInt(6) + 1;

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
        for (int i = 0; i < arr.length; i++) {
            int r = rnd.nextInt(6)+1;
            sum = arr[i] + r;
            leftStepsToWin = leftStepsToWin - sum;
            currentPlace = currentPlace+sum;
            System.out.println("The rolling stone shows "+sum+". "+leftStepsToWin+" steps left to win");
            if(leftStepsToWin == 0){
                System.out.println("Congratulations! You win!");
            }else if(currentPlace > 20){
                System.out.println("Sorry, you loose");
                break;
            }
        }
    }
}
/*
The rolling stone shows 3. 17 steps left to win
The rolling stone shows 6. 11 steps left to win
The rolling stone shows 3. 8 steps left to win
The rolling stone shows 4. 4 steps left to win
The rolling stone shows 4. 0 steps left to win
Congratulations! You win!*/