public class List {

    private Node head;
    private Node tail;

    public  void add(int item){
        Node temp = new Node();
        temp.value = item;
        if (head == null){
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
    }

    public  void  printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void removeFromEnd( int k) {
        Node p = head;
        Node q = head;

        for (int i = 0; i < k; i++) {
            if (q.next != null) {
                q = q.next;
            } else if (i == k - 1) {
                head = head.next;
            } else {
                System.out.println("No such element");
                return;
            }
        }
        while (q.next != null) {
            q = q.next;
            p = p.next;
        }

        p.next = p.next.next;
    }

    private class Node {
        int value;
        Node next;
    }
}
