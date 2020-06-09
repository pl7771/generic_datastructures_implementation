package domain;

import java.io.File;
import java.util.List;

import persistention.PersistentionController;

//use simple facade pattern
public class DomeinController {
    
    private PersistentionController pc = new PersistentionController();
    
    public MyListIterable<Band> persistListToObject(String txtFileName, String objectFileName){          
    	
        List<Band> bandList = pc.readBands(new File(txtFileName));
        
        MyListIterable<Band> myList =  new MyListIterable<>();
        
        bandList.forEach(elem -> myList.insertAtBack(elem));
        
        pc.persistObject(myList, new File(objectFileName));
        
        return myList;
        
       
    }
    
    
    
}
