import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Task_2");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];

        for (int i = 0;i < size; i++) {
            //array[i] = input.nextInt();
            array[i] = (int) ((double) Math.random() * 10);
        }
        System.out.print("Исходный массив:");
        for (int i = 0;i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        int maxEl = array[0];
        int minEl = array[0];
        for (int i = 1;i < size; i++) {
            if (array[i] > maxEl) {
                maxEl = array[i];
            }
        }
        System.out.println("Максимальный элемент: " + maxEl);
        for (int i = 1;i < size; i++) {
            if (array[i] < minEl) {
                minEl = array[i];
            }
        }
        System.out.println("Минимальный элемент: " + minEl);
    }
}
