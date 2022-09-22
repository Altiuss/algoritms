
//First level: Дан односвязный список (указатель на его начало head). Дано натуральное число k.
//        Удалить из этого списка k-ый элемент с конца.
//        Подсказка: используйте метод двух указателей для поиска K-го элемента с конца.
//


public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int k = 11;

        list.removeFromEnd(k);
        list.printList();

    }
}
