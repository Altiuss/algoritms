public class Stack {
    StackItem top = null; //adress objekta

    public void push(char item){
        StackItem temp = new StackItem();
        temp.value = item;
        temp.next = top;
        top = temp;


    }
    public int pop( ){
        char a =  top.value;
                                    // pabidit top
        top = top.next;
        return a;


    }
    public boolean isEmpty(){
        return ( top == null);

    }


    class StackItem{
        char value = 0;
        StackItem next = null;

    }


}