import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Task_3");
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

        int indexMax = 0;
        int indexMin = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            } else if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }
        System.out.println("Индекс максимального элемента массива: " + indexMax);
        System.out.println("Индекс минимального элемента массива: " + indexMin);
    }
}
