import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        Arrays.sort(array);
        System.out.println();
        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.println(" input item: ");
        int item = sc.nextInt();
        System.out.println(binarySearch(array, item));

    }

    private static int binarySearch(int[] array, int item){
        int low = 0;
        int hight = array.length -1;
        while (low <= hight){
            int mid = (low + hight) / 2;
            int guess = array[mid];
            if (guess == item){         // Elements atrasts
                return mid;
            }
            if (guess > item) {
                hight = mid - 1;

            }else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
