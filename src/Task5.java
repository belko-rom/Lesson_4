import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Task_5");
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

        /*for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+ ", ");               //Тоже самое что и ниже

        }
        */
        for (int i = 0; i < array.length / 2; i++) { //?
            int temp = array[i]; //?
            array[i] = array[array.length - i - 1]; //?
            array[array.length - i - 1] = temp; //?
        }
        for (int i : array) { //?
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
