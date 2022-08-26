

//Реализовать очередь с помощью только двух стеков.

import java.util.Stack;

public class Level {
    public static void main(String[] args) {

        int[] data = new int[10];
        Stack st1 = new Stack();
        Stack st2 = new Stack();
        for (int i = 0; i <= data.length - 1; i++) {
            data[i] = (int) (1 + Math.random() * 100);
            System.out.print(data[i] + " ");
            st1.push(data[i]);
        }
        while (!st1.isEmpty()){
            st2.push(st1.pop());
        }

        System.out.println();
        while (!st2.isEmpty()) {
            System.out.print(st2.pop() + " ");
        }
    }
}
//P.S Думаю правильно понял правила задания.
//        К сожалению, на второе задание времени не хватило.