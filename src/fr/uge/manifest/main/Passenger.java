package fr.uge.manifest.main;

import fr.uge.manifest.Container;

public class Passenger {
    private String destination;



    private Integer price   ;

    public Passenger(String destination){
        this.destination=destination;
        this.price=10;

    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public boolean isContainer(){
        return this instanceof Passenger;
    }
    @Override
    public String toString() {
        return ".  "+getDestination()+"  (Passenger)";
    }
}
