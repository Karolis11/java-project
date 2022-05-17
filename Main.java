import javax.swing.*;
import OOP.motorVehicles.*;
import OOP.pedestrians.*;

public class Main {
    public static void main(String[] args) throws InvalidNumberException, CloneNotSupportedException {
        MotorVehicle t = new Truck(Colors.Green, 250, 120, 30, 30);
        MotorVehicle c = new Car(Colors.Black, 100, 200, 10);
        MotorVehicle c1 = new Car(Colors.Black, 200, 350, 3);

        // new MyFrame(t);

        MotorVehicle[] objectsArray = {t, c, c1};
        new MyFrame(objectsArray);
        UI ui = new UI(objectsArray);
        ui.StartUI();

        //System.out.println(array[0]);
    }

}
