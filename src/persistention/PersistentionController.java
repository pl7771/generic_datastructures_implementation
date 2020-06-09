package persistention;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import domain.Band;

public class PersistentionController {

   private BandMapper bandMapper;

    public List<Band> readBands(File besnaam) {
        if (bandMapper == null) {
            bandMapper = new BandMapper();
        }
        return bandMapper.readBands(besnaam);
    }
     
    
    //using a generic method 
    //and try with resources
    public <T extends Serializable> void persistObject(T object, File fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
        	
            out.writeObject(object);
            
        } catch (IOException ex) {
            Logger.getLogger(BandMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
