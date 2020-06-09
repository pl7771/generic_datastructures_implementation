package domain;

import java.io.Serializable;

public class MusicInstrument implements Serializable{
	
	private String instrument;
    private double price;

    // a band is made of band name and rating of band
    public MusicInstrument(String instrument, double rating) {
        this.instrument = instrument;
        this.price = price;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public double getPrice() {
        return price;
    }

    public void setRating(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
    	return String.format("Band %s has rating of %.1f\n", getInstrument(), getPrice());
    }
 
	
}
