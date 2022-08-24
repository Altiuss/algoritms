public class Main {
    public static void main(String[] args) {

        double[] data = new double[20];
        for (int i = 0; i < data.length; i++) {
            data[i] = 100 * Math.random();
            System.out.println(data[i]);
        }
        System.out.println();
        double c = 50.0;
        Queue queue = new Queue();
        for (int i = 0; i < data.length; i++) {
            if (data[i] < c) {
                System.out.println(data[i]);
            } else {
                queue.add(data[i]);
            }
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.delete());
        }
    }
}