public class Queue {
    private QueueItem head;
    private QueueItem tail;

    public  void add(double item){
        QueueItem temp = new QueueItem();
        temp.value = item;
        if (isEmpty()){
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
    }

    public double delete(){
        double a = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return a;


    }
    public boolean isEmpty(){
        return head == null;
    }


    private  class  QueueItem{
        public double value;
        public QueueItem next;

    }


}
