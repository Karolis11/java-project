package OOP.motorVehicles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class SaveThread implements Runnable{
    String fileName;

    MotorVehicle[] vehicle;

    public SaveThread(String fileName, MotorVehicle[] vhc){
        this.fileName = fileName;
        this.vehicle = vhc;
    }

    @Override
    public void run() {
        try {
            //Thread.sleep(10000);
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(int i = 0; i < vehicle.length; ++i){
                oos.writeObject(vehicle[i]);
                // System.out.println(vehicle[i]);
            }
            oos.close();
            System.out.println("Issaugota sekmingai");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
