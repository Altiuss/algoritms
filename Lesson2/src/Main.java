public class Main {

    public static void main(String[] args) {
        Stack st1 = new Stack(100);
        st1.push(10);
        st1.push(100);
        System.out.println(st1.pop());
        System.out.println(st1.pop());
        System.out.println(st1.pop());

        for (int i = 0; i < 100; i++){
            st1.push(i);
        }
        for (int i = 0; i < 100; i++){
            System.out.println(st1.pop());
        }

copyst str2 = new copyst(10);
        str2.push("qwerty");
        System.out.println(str2.pop());

    }
}
