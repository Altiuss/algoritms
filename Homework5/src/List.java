
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

    public void remuve( int item){

        if(head.value == item ){
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = head;
        while (temp.next != null){
            prev = temp;
            temp=temp.next;
            if (temp.value == item){
                break;
            }
        }
        prev.next = temp.next;
        if(temp == tail){
            tail = prev;
        }
    }

    private class Node {
        int value;
        Node next;


    }

}