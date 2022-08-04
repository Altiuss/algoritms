public class Main {
    public static void main(String[] args) {
        System.out.println(fact(10));

    }
    private static int fact(int n){
        if (n == 1){
            return 1;

        }
        return fact(n - 1) * n; // *n paliek mazaks ar katru soli

    }
}
// fact( 10 - 1) * 10
// fact( 9 - 1) * 9
// fact( 8 - 1) * 8
// fact( 7 - 1) * 7
// fact( 6 - 1) * 6
// fact( 5 - 1) * 5
// fact( 4 - 1) * 4
// fact( 3 - 1) * 3
// fact( 2 - 1) * 2
// fact( 1 - 1) * 1 = 1