package StackAirCondition;

public class MyStack {
    private boolean empty =true;
    private String[] element = new String[10];
    private int size =0;

    public boolean isEmpty () {
        return empty;
    }
    public void push (String item) {
        element[size] = item;
        size++;
        empty = false;
    }

    public void pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
        size --;

        if (size ==0){
            empty = true;
        }
    }

    public String peek() {
        if (isEmpty()){
            throw new IllegalArgumentException("Stack is empty");
        }
        String item =  element[--size];
        size++;
        return item;
    }

    public String search() {
        String item ="Benz";
        for (int index =0; index < size; index ++){
            if (element[index].equals(item)) {
                return element[index];
            }
        }
        return null;
    }
}
