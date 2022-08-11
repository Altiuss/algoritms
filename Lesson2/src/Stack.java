public class Stack {


    int[] array;
    int top;


    public Stack(){
       array = new int[10];
        top = -1;
    }

    public void push(int item){
        if (top == 9) {
            System.out.println("Stack is fuul");
        } else {
            top++;
            array[top] = item;
        }
    }

    public int pop(){
        if (top < 0){
            System.out.println("Stack is empty");
            return 0;
        } else {
            int value = array[top];
            top--;
            return value;
        }
    }
}
