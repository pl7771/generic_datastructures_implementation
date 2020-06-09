package domain;

import java.io.Serializable;

public class Band implements Serializable{

    private String bandName;
    private double rating;

    // a band is made of band name and rating of band
    public Band(String bandName, double rating) {
        this.bandName = bandName;
        this.rating = rating;
    }

    public String getBandNaam() {
        return bandName;
    }

    public void setBandNaam(String bandName) {
        this.bandName = bandName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
    @Override
    public String toString() {
    	return String.format("Band %s has rating of %.1f\n", getBandNaam(), getRating());
    }
 
}
