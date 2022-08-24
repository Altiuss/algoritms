
//First level: Дан файл действительных чисел и два числа a и b.
//        Используя очередь (несколько очередей) напечатать сначала все элементы,
//        меньшие a; потом все элементы из отреза [a, b]; потом все элементы, большие b.


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number  from 1 to 50: ");
        int a = sc.nextInt();
        System.out.println("Enter number from 51 to 100 : ");
        int b = sc.nextInt();
        int[] data = new int[100];
        Queue lessQueue = new Queue();
        Queue similarQueue = new Queue();
        Queue largerQueue = new Queue();

        for (int i = 0; i <= data.length - 1; i++) {
            data[i] = (int) (1 + Math.random() * 100);
            System.out.print(data[i] + " ");

            if (data[i] < a) {
                lessQueue.add(data[i]);

            } else if (data[i] > a && data[i] < b) {
                similarQueue.add(data[i]);
            } else {
                largerQueue.add(data[i]);
            }
        }
        System.out.println();
        System.out.println("Numbers smaler than a: ");
        while (!lessQueue.isEmpty()) {
            System.out.print( lessQueue.delete()+ " ");
        }
        System.out.println();
        System.out.println("Numbers from a to b:");

        while (!similarQueue.isEmpty()) {
            System.out.print(similarQueue.delete() + " ");
        }
        System.out.println();
        System.out.println("Numbers greater than b: ");

        while ((!largerQueue.isEmpty())){
            System.out.print(largerQueue.delete() + " ");
        }
    }
}