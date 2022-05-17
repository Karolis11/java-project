package OOP.motorVehicles;

import java.io.Serializable;

public class Truck extends MotorVehicle implements Cloneable, Serializable {
    private int maxLoadCapacity; // kg
    private int currentlyLoaded = 0; // kg
    private int height;
    private boolean isTrailerAttached;
    private int trailerLength;
    private int trailerWidth;
    private int trailerWeight;

    public Coordinates coordinates = new Coordinates();

//    public Object clone() throws CloneNotSupportedException{
//        Truck cloned = (Truck)super.clone();
//        return cloned;
//    }

    public Object clone() throws CloneNotSupportedException{
        Truck copy = (Truck)super.clone();
//        copy.coordinates = new Coordinates();
//        copy.coordinates.x = coordinates.x;
//        copy.coordinates.y = coordinates.y;
        return copy;
    }

//    public Object shallowClone() throws CloneNotSupportedException{
//        Truck copy = (Truck)super.clone();
//        return copy;
//    }

    public Truck(){
        super(Colors.Black, 10000, 70);
        this.maxLoadCapacity = 15000;
    }

    public Truck(Colors clr, int weight, int maxS, int maxLC, int height){
        super(clr, weight, maxS);
        this.maxLoadCapacity = maxLC;
        this.height = height;
    }

    public void loadTruck(int weight){
        if(this.currentlyLoaded + weight <= this.maxLoadCapacity){
            this.currentlyLoaded += weight;
        }
    }

    public void unloadTruck(int weight){
        this.currentlyLoaded -= weight;
    }

    public void attachTrailer(int length, int width, int weight, int capacity){
        this.isTrailerAttached = true;
        this.trailerLength = length;
        this.trailerWeight = weight;
        this.trailerWidth = width;
        this.maxLoadCapacity += capacity;
    }

    public void unAttachTrailer(){
        this.isTrailerAttached = false;
        this.trailerLength = 0;
        this.trailerWeight = 0;
        this.trailerWidth = 0;
    }

    public void reset(){
        super.reset();
        this.currentlyLoaded = 0;
        this.unAttachTrailer();
    }

    public String toString(){
        String output = new String();
        output += "Truck number is " ;
        output += this.getVehicleNumber() + "\n";
        if(this.isPowerOn()){
            output += "Truck power on\n";
            output += "Moving " + this.getMovingDir() + "\n";
        }
        else{
            output += "Truck power is off\n";
        }
        output += "Vehicle color: " + this.getColor() + "\n";
        output += "Vehicle weight: " + this.getWeight() + "\n";
        output += "Vehicle max speed: " + this.getMaxSpeed() + "\n";
        output += "Current coordinates: " + this.getX() + ":" + this.getY() + "\n";
        if(this.isTrailerAttached){
            output += "Trailer is attached\n";
            output += "Trailer parameters:\n";
            output += "Length - " + this.trailerLength + ", ";
            output += "width - " + this.trailerWidth + ", ";
            output += "weight - " + this.trailerWeight + "\n";
        }
        output += "Truck loaded: " + this.currentlyLoaded + " / " + this.maxLoadCapacity + "\n";
        return output;
    }
}
