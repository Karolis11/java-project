package OOP.motorVehicles;

import javax.swing.*;
import java.io.*;
import java.io.File;

public class ReadThread implements Runnable{
    String fileName;

    MotorVehicle[] array;

    public ReadThread(String fileName, MotorVehicle[] array){
        this.fileName = fileName;
        this.array = array;
    }

    @Override
    public void run() {
        try {
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fin);
            for(int i = 0; i < array.length; ++i){
                array[i] = (MotorVehicle) ois.readObject();
                //System.out.println(array[i]);
            }
            System.out.println("Duomenys gauti sekmingai");
            ois.close();
        } catch (FileNotFoundException e){
            System.out.println("ERROR: There is no file named " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
