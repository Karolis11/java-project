import OOP.motorVehicles.*;
import OOP.pedestrians.*;

public class Main {
    public static void main(String[] args) throws InvalidNumberException {
        MotorVehicle car = new MotorVehicle(Colors.Blue, 2500, 200);
        MotorVehicle car2 = new MotorVehicle();
        MotorVehicle car3 = new Car();

        MotorVehicle car4 = new Car(Colors.Green, 1700, 290, 6);
        Car c = new Car(Colors.Red, 2500, 200, 7);
        c.reset();

        Truck t = new Truck();

        Pedestrian ped = new Pedestrian(Gender.Male, 20, 78);

        car3.move(Directions.Forward, 60);
        car3.move(Directions.Backwards, 60);


        car3.move(Directions.Forward, 1, 80);
        car3.move(Directions.Backwards, 1, 60);

        t.loadTruck(500);
        t.unloadTruck(300);
        t.attachTrailer(10, 3, 500, 1000);

//        System.out.println(c);
//        System.out.println(t);
        //----------------------------

        MotorcycleAbstract m = new Motorcycle();
        m.move(Directions.Forward, 100);
        m.move(Directions.Left, 400);
        m.speedup(70);
//        System.out.println(m.getX());
        //-----------------------------------

        try {
//            c.loadCar(0);
            c.unloadCar(-1);
        }
        catch(ZeroNumberException exc){
            System.out.println(exc.getMessage());
        }
        catch(InvalidNumberException exc){
            System.out.println(exc.getMessage());
        }

    }

}
