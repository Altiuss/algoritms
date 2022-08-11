public class Stack {


    int[] array;
    int top;


    public Stack(int length){
       array = new int[length];
        top = -1;
    }

    public void push(int item){
        if (top == array.length -1) {
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
