import java.util.Arrays;
//First level: 1. Написать свою реализацию MergeSort
//
//        Отсортировать стрингу use MergeSort


public class Main {
    public static void main(String[] args) {

            int[] array = { 58, 8, 7, 65, 219, 84,2 };

            String s = "skfjac";
        System.out.println(s);




        mergeSort(s);

        System.out.println(s);
    }



    public static void mergeSort(String s) {
    int n = s.length();

        if (n < 2) {
            return ;
        }
        int mid = n / 2;
        String lArray = "";
       String rArray = "";

        for (int i = 0; i < mid; i++) {
            lArray += String.valueOf(s.charAt(i));

        }
        for (int i = mid; i < n; i++) {
            rArray += String.valueOf(s.charAt(i));

        }
        mergeSort(lArray);
        mergeSort(rArray);

        merge(s, lArray, rArray);
    }

    public static String merge(String s, String lArray, String rArray) {
    int left = lArray.length();
    int right = rArray.length();
    int l = 0;
    int j = 0;
    int k = 0;

        while (l < left && j < right) {
            if (lArray.charAt(l) < rArray.charAt(j)) {
                s += lArray;
                k++;
                l++;
            }
            else {
                s += rArray;
                k++;
                j++;
            }
        }
        for (int i = l; i < left; i++) {
            s += lArray;
        }
        while (j < right) {
            s += rArray;
            k++;
            j++;
        }

        return s;
    }

}
