public class copyst {


    String[] array;
    int top;


    public copyst(int length){
       array = new String[length];
        top = -1;
    }

    public void push(String item){
        if (top == array.length -1) {
            System.out.println("Stack is fuul");
        } else {
            top++;
            array[top] = item;
        }
    }

    public String pop(){
        if (top < 0){
            System.out.println("Stack is empty");
            return "";
        } else {
            String value = array[top];
            top--;
            return value;
        }
    }
}
