package OOP.motorVehicles;

public class VehicleFactory {

    public static MotorVehicle getMotorVehicle(String type){
        if(type == "Car"){
            return new Car();
        }
        else if(type == "Truck"){
            return new Truck();
        }
        else{
            return new MotorVehicle();
        }
    }

}
