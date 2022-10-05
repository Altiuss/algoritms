public class Main {

    public static void main(String[] args) {
        System.out.println(sum(new int[] {2, 4, 6},0));

    }

    private static  int sum(int[] arr, int index){
        if(index == arr.length - 1){
            return arr[index];
        }
        return arr[index] + sum(arr,index + 1);

    }
}
