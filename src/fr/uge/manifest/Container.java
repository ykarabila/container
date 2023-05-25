package fr.uge.manifest;

import fr.uge.manifest.env.Env;
import fr.uge.manifest.main.Passenger;

public class Container extends Passenger {


    private Integer weight;

    public Container destination(String str){
        super.setDestination(str);
        return this;
    }
    public Container weight(Integer n){
        setWeight(n);
        return this;
    }

    public Container(String destination,Integer weight){

        super(destination);

        if(weight>0 && weight != null || Env.allowedDestinations.contains(destination)){
            this.weight=weight;
            super.setPrice(weight*2);
        }

    }



    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public boolean isContainer(){
        return this instanceof Container;
    }

    @Override
    public String toString() {
        return ".   {" + super.getDestination() + "}   {" + this.getWeight() + " Kg}";
    }
}
