package main;

import domain.Band;
import domain.DomeinController;
import domain.MyList;
import domain.MyQueue;

public class GenericPersistApp {

    public static void main(String arg[]) {
       
    	
    	//USING WITH OBJECTS
    	//Create a new MyList and test methods
    	MyList<Band> bands = new MyList<Band>("my list");   	
    	
    	System.out.println(bands.isEmpty()); //true
    	
    	bands.insertAtFront(new Band("Red Hot Chilli Peppers", 9.5));
    	bands.insertAtFront(new Band("DMX", 9.6));
    	bands.insertAtFront(new Band("Arch Enemy", 8.9));
    	bands.insertAtBack(new Band("Kiss", 9.9));
    	
    	System.out.println(bands);
    	
    	System.out.println(bands.isEmpty()); //false
    	
    	
    	
    	MyQueue<Band> bandQueue = new MyQueue<Band>("my queue");   	
    	
    	System.out.println(bandQueue.isEmpty()); //true
    	
    	bandQueue.offer(new Band("Red Hot Chilli Peppers", 9.5));
    	bandQueue.offer(new Band("DMX", 9.6));
    	bandQueue.offer(new Band("Arch Enemy", 8.9));
    	bandQueue.offer(new Band("Kiss", 9.9));
    	
    	System.out.println(bandQueue);
    	
    	System.out.println(bandQueue.isEmpty()); //false
    	System.out.println("Polled first element from queue");
    	System.out.println(bandQueue.poll());
    	
    	System.out.println(bandQueue);
    	
    	

    	//Here i'am retrieving text file bands.txt and map the content of it to bandListObject.dat
    	DomeinController dc = new DomeinController();
    	System.out.println(dc.persistListToObject("bands.txt","bandListObject.dat"));  
 
    	
    }

}
