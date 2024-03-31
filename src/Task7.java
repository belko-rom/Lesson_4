import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Task_7*");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];

        for (int i = 0;i < size; i++) {
            array[i] = input.nextInt();
            //array[i] = (int) ((double) Math.random() * 10);
        }
        System.out.print("Исходный массив:");
        for (int i = 0;i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        for (int i = size - 1; i >= 0; i--) {
            if (array[i] < 9) {
                array[i]++;
                break;
            }else {
                array[i] = 0;
            }
        }
        int[] newArray = new int[size + 1];
        newArray[0] = 1;
        for (int i : array) { //?
            System.out.print(i + ", ");
        }
        System.out.println();


    }
}
