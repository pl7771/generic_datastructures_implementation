package domain;

import java.io.Serializable;
public class Node<T extends Serializable> implements Serializable {

	//a node may contain generic data
    private final T data;
    
    //a node may reference to it self (selfreference)
    //here we save a next node
    private Node<T> next;

    //constructor for node that contains generic data
    public Node(T data) {
        this.data = data;
    }

    //retrieve data from this node
    public T getData() {
        return data;
    }

    //set next node
    public void setNext(Node<T> next) {
        this.next = next;
    }

    //retrieve next node
    public Node<T> getNext() {
        return next;
    }
}
