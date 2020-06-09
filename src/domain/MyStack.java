package domain;

import java.io.Serializable;

public class MyStack<T extends Serializable> {

    private MyList<T> list;

    public MyStack() {
        this("Stack");
    }

    public MyStack(String name) {
        list = new MyList(name);
    }
    
    //push element to stack
    public void push(T data) {
        list.insertAtFront(data);
    }

    //get upper elemetn from stack
    public T pop() {
        return list.removeFromFront();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }

}
