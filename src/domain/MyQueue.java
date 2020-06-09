package domain;

import java.io.Serializable;

//my queque is made of list
public class MyQueue<T extends Serializable> {

    private MyList<T> list;

    public MyQueue() {
        this("Queue");
    }

    public MyQueue(String naam) {
        list = new MyList<>(naam);
    }

    //Insert element at back of queue
    public void offer(T data) {
        list.insertAtBack(data);
    }

    //retrieve element from front
    public T poll() {
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
