import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Task_6");
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


        boolean order = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                order = false;
                break;
            }
        }
        if (order) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }
}
