package OOP.motorVehicles;

import java.io.Serializable;

public class Car extends MotorVehicle implements Serializable {
    private int seatingCapacity;
    private int seatsTaken = 0;

    public Car(){
        super();
    }

    public Car(Colors clr, int weight, int maxS, int sC){
        super(clr, weight, maxS);
        this.seatingCapacity = sC;
    }

    public void loadCar(int peopleNumber) throws InvalidNumberException, ZeroNumberException{
        if(peopleNumber <= 0){
            if(peopleNumber == 0) {
                throw new ZeroNumberException("People number can not be zero");
            }
            else {
                throw new InvalidNumberException("People number can not be negative: " + peopleNumber);
            }
        }

        if(this.seatsTaken + peopleNumber <= this.seatingCapacity){
            this.seatsTaken += peopleNumber;
        }
    }

    public void unloadCar(int peopleNumber) throws InvalidNumberException{
        if(peopleNumber <= 0){
            if(peopleNumber == 0) {
                throw new ZeroNumberException();
            }
            else {
                throw new InvalidNumberException(peopleNumber);
            }
        }
        this.seatsTaken -= peopleNumber;
    }

    public void reset(){
        super.reset();
        this.seatsTaken = 0;
    }

    public String toString(){
        String output = new String();
        output += "Car number is " ;
        output += this.getVehicleNumber() + "\n";
        if(this.isPowerOn()){
            output += "Car power on\n";
            output += "Moving " + this.getMovingDir() + "\n";
        }
        else{
            output += "Car power is off\n";
        }
        output += "Vehicle color: " + this.getColor() + "\n";
        output += "Vehicle weight: " + this.getWeight() + "\n";
        output += "Vehicle max speed: " + this.getMaxSpeed() + "\n";
        output += "Current coordinates: " + this.getX() + ":" + this.getY() + "\n";
        output += "Seats taken: " + this.seatsTaken + " / " + this.seatingCapacity + "\n";
        return output;
    }
}
