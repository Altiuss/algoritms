public class Deque {
    private DequeItem head = null;
    private DequeItem tail = null;

    public void addFirst(int item) {
        DequeItem temp = new DequeItem();
        temp.value = item;
        if (isEmpty()){
            head = temp;
            tail = temp;
        } else {
            head.previous = temp;
            temp.next = head;
            head = temp;
        }
    }

    public void addLast(int item){
        DequeItem temp = new DequeItem();
        temp.value = item;
        if (isEmpty()){
            head = temp;
            tail = temp;
        } else {
            temp.next = temp;
            temp.previous = tail;
            tail = temp;
        }
    }

    public int deleteFirst(int item){
        int value = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        head.previous = null;
        return value;

    }
    public int deleteLast(int item){
        int value = tail.value;
        tail = tail.previous;
        if (tail == null){
            head = null;
        }
        tail.next = null;
        return value;

    }

    public boolean isEmpty(){
        return  head == null;

    }

    private class DequeItem{
        int value;
        DequeItem next;
        DequeItem previous;
    }
}
