import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Task_1
        System.out.println("Task_1");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            //array[i] = input.nextInt();
            array[i] = (int) ((double) Math.random() * 10);
        }
        System.out.print("Массив в прямом виде:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        System.out.print("Массив в обратном порядке:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }
        System.out.println();




    }
}