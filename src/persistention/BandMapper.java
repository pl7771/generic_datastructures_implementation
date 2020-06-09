package persistention;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

import domain.Band;

public class BandMapper {

    public List<Band> readBands(File fileName) {
        
    	List<Band> bands = new ArrayList<>();
        
        try (Stream<String> stream = Files.lines(fileName.toPath()) ){
            
        	//retieve each band from stream
        	stream.forEach(element -> {
                Scanner scanner = new Scanner(element);
                String bandName = scanner.next();
                double rating = scanner.nextDouble();
                bands.add(new Band(bandName, rating));
            });
        	
        	
        } catch (IOException ex) {
            Logger.getLogger(BandMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bands;
    }

}
