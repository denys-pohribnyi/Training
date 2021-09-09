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
        int[] field = new int[20];
        for (int i = 0; i < field.length; i++) {
            field[i] = i + 1;
        }
        for(int i : field) {
            System.out.print(i + " ");
        }
        int pointsLeftToWin = 20;
        int currentTry = 1;
        int currentPlace = field[0];
        int maxTries = 5;
        for (int i = currentTry; i <= maxTries; i++) { // цикл попыток
            for (int j = 0; j < field.length; j++) {   // бежим по полю
                int roll = rnd.nextInt(6)+1;    // роллим кость
                field[j] = field[roll];

                System.out.println("Points left to win: "+ (field.length -currentPlace));
                if(currentPlace > field.length || currentPlace < field.length){
                    System.out.println("You loose");
                }
                if(currentPlace == field.length){
                    System.out.println("Congratulations! You win!");
                }
            }
        }
    }
}
