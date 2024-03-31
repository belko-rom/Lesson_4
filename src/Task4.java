import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Task_4");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];

        for (int i = 0;i < size; i++) {
            //array[i] = input.nextInt();
            array[i] = (int) ((double) Math.random() * 100);
        }
        System.out.print("Исходный массив:");
        for (int i = 0;i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        int count = 0;
        for (int el : array) {
            if (el == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Нулевых элементов нет");
        } else {
            System.out.println(count);
        }
    }
}
