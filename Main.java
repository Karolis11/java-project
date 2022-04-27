import OOP.motorVehicles.*;
import OOP.pedestrians.*;

public class Main {
    public static void main(String[] args) throws InvalidNumberException, CloneNotSupportedException {
        MotorVehicle car = new MotorVehicle(Colors.Blue, 2500, 200);
        MotorVehicle car2 = new MotorVehicle();
        MotorVehicle car3 = new Car();

        MotorVehicle car4 = new Car(Colors.Green, 1700, 290, 6);
        Car c = new Car(Colors.Red, 2500, 200, 7);
        c.reset();

        Truck t = new Truck();

//        Pedestrian ped = new Pedestrian(Gender.Male, 20, 78);

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

//        try {
////            c.loadCar(0);
//            c.unloadCar(1);
//        } catch (ZeroNumberException exc) {
//            System.out.println(exc.getMessage());
//        } catch (InvalidNumberException exc) {
//            System.out.println(exc.getMessage());
//        }

        MotorVehicle car6 = VehicleFactory.getMotorVehicle("Car");
        car6.move(Directions.Forward, 100);

//        System.out.println(car6);

        Truck original = new Truck(Colors.Green, 9000, 200, 100, 20);
//        Truck cloned = null;
//        Truck cloned2 = null;

        Truck truck3 = null;
        Truck truck4 = null;

        try {
            truck3 = (Truck)original.clone();
            truck4 = (Truck)original.clone();
//            cloned = (Truck) original.clone();
//            cloned2 = (Truck) original.clone();
        } catch (CloneNotSupportedException exc) {
            System.out.println(exc.getMessage());
        }

        original.coordinates.x = 5;
//        original.loadTruck(20);
//        cloned.loadTruck(50);
//        cloned2.loadTruck(80);

//        truck3.move(Directions.Right, 100);
//        cloned.move(Directions.Forward, 40);
//        cloned2.move(Directions.Left, 70);

//        System.out.println(original);
//        System.out.println(truck3);

        System.out.println(original.coordinates.x + " deep:" + truck3.coordinates.x + " shallow:" + truck4.coordinates.x);
//        System.out.println(cloned);
//        System.out.println(cloned2);


    }

}
