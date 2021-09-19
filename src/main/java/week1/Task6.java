package week1;

public class Task6 {
    //Написать программу, которая подсчитывает количество элементов массива int*ов,
    //которые делятся на 2, но не делятся на 3 и выводит в консоль
    public static void main(String[] args) {
        System.out.println("Task 6");
        int[] arr = {1, 4, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        for (int i = 0; i < arr.length; i++) {                  // выведем в консоль наш массив
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Numbers that can be divided on 2 but not 3 :");
        for (int i = 0; i < arr.length; i++) {                  // Пробежимся по массиву анализируя каждую ячейку
            if (arr[i] % 2 == 0 && arr[i] % 3 != 0) {             // В условии используем деление по модулю -
                System.out.print(arr[i] + " ");                   // Если тру в обоих случаях (на 2 да, на 3 нет) то
            }                                                   // печатаем значение
        }
    }
}
//1 4 6 7 8 9 10 12 13 14 15 16
//Numbers that can be divided on 2 but not 3 :
//4 8 10 14 16