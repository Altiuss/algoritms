import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum(new int[] {6, 4, 6},0));
     int[] array = {39, 22, 2, 55, 6, 20};
     qSort(array, 0, array.length -1);
        System.out.println(Arrays.toString(array));
    }

    private static void qSort(int[] arr, int begin, int end){
       if (begin < end) {
          int pivotIndex = partition(arr, begin, end);
          qSort(arr, begin, pivotIndex - 1);
          qSort(arr, pivotIndex + 1, end);
        }

    }

    private static int partition(int[] arr, int begin, int end){
        int pivot = arr[end];
        int pivotIndex = begin;
        for (int i = begin; i < end; i++){
            if (arr[i] < pivot){
                swap(arr, i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(arr, pivotIndex, end);
        return pivotIndex;
    }

    private static void swap(int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }


    private static  int sum(int[] arr, int index){
        if(index == arr.length - 1){
            return arr[index];
        }
        return arr[index] + sum(arr,index + 1);

    }
}
