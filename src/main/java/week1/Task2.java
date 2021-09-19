package week1;

public class Task2 {
    public static void main(String[] args) {
        // Написать программу, которая печатает значения sin(x), где x это каждые 10 градусов от 0 до 360.
        for (int i = 0; i <= 360; i = i + 10) {
            int sin = i;
            System.out.println("sin" + sin);
        }
    }
}
