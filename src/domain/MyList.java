package domain;

import exceptions.EmptyListException;
import java.io.Serializable;

public class MyList <T extends Serializable>{
	
	
	//we need to have a first node
    private Node<T>  firstNode;
    //and last node
    private Node<T> lastNode;
    //attribute for saving a list name
    private final String nameList;

    
    //reference to constructor that gives default name - List
    public MyList() {
        this("List");
    }

    
    //constructor that accepts name of a list
    public MyList(String name) {
        nameList = name;
    }
    
    
    //if first node is not defined, it means that node is empty
    public boolean isEmpty() {
        return firstNode == null;
    }

    
    //overriding method toString of class object to say if the list is empty or not
    @Override
    public String toString() {
    	
    	//call method is empty to check if there is a first node
        if (isEmpty()) {
            return nameList + " is empty";
        }
        
        //here StringBuilder is used to make sentence: "The (name of list) id"
        StringBuilder buffer = new StringBuilder();
        buffer.append("The ").append(nameList).append(" contains:\n");
        
        //create current node and assign it to first node
        Node<T> current = firstNode;
        
        
        //while current node has next node, retrieve data from current node and append a "," to make it readeble
        while (current != null) {
            buffer.append(current.getData()).append("");
            current = current.getNext();
        }
        return buffer.toString();
    } 

    
    //insert node in front with given data
    public void insertAtFront(T data) {
    	
    	//create a new node
        Node<T> aNode = new Node<>(data);
        
        //if list is empty we assign a new node as First and Last node;
        if (isEmpty()) {     	
            firstNode = lastNode = aNode;
        } 
        //if list is not empty we use setNext method of Node class to link this new node with first
        //other words: firtNode is not first anymore, first node is just new made
        //and AFTER this we say that first node is new node we just made
        else {        
            aNode.setNext(firstNode);
            firstNode = aNode;
        }
    }

    
    //here we insert a new node at the end of list
    public void insertAtBack(T data) {
    	//we create a new node
        Node<T> aNode = new Node<>(data);
        //and again if there is no node we make a new node as first and last node
        if (isEmpty()) {
            firstNode = lastNode = aNode;
        } 
        //otherwise we set a new node as last node
        //and we assign to last node the next node of the last one
        //so the last node is new created node now
        else {
            lastNode.setNext(aNode);
            lastNode = lastNode.getNext();
        }
    }

    
    //if the list is already empty it throws the EpmtyListException
    public T removeFromFront() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException(nameList);
        }

        //get a generic data from first node
        T removedItem = firstNode.getData();
        
        //if first and last nodes are one node we make them null beacuse the last node of list is deleted
        if (firstNode == lastNode) {
            firstNode = lastNode = null;  
        } 
        
        //if not empty end not last, get the next node and assign it to first
        else {
            firstNode = firstNode.getNext();
        }
        
        //give generic data back
        return removedItem;
    }

}
