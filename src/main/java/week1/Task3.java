package week1;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Task 3");
    //Написать программу которая сортирует массив от минимума до максимума
    int[] ar = {8,5,3,9,4,6,1,2,7};
    int temp;                                           // Создадим временную переменную для свапа
    boolean isSorted = false;                           // Для цикла
        while (!isSorted){                                  // Цикл поможет прогонять сортировку пока не отсортирует
        isSorted = true;
        for (int i = 0; i < ar.length -1; i++) {        // Пробежимся по массиву
            if(ar[i] > ar[i+1]){                        // Сравниваем элементы
                temp = ar[i];                           // Свапаем используя временную переменную чтобы не перезаписывать значение поверх предыдущего
                ar[i] = ar[i+1];
                ar[i+1] = temp;
                isSorted = false;
            }
        }
    }
        for(int i : ar){                                    // Выводим в консоль сортированный массив
        System.out.print(i+" ");
    }
}
}
//1 2 3 4 5 6 7 8 9