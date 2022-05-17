package OOP.motorVehicles;

import java.util.Scanner;

public class UI {
    final static String fileName = "data.txt";
    Scanner scannerObj = new Scanner(System.in);
    String input;
    int chosen;
    MotorVehicle[] array;

    public UI(MotorVehicle[] array) throws ZeroNumberException, InvalidNumberException {
        this.array = array;
    }

    public void StartUI() throws InvalidNumberException {
        // int chosenMain = mainUI(array);
        int chosenMain = 0;
        while(chosenMain != 5) {
            chosenMain = mainUI(array);
            if (chosenMain == 1) {
                for (int i = 0; i < array.length; ++i) {
                    System.out.println(i + 1 + ". " + array[i]);
                }
            } else if (chosenMain == 2) {
                System.out.println("Pasirinkite transporto priemone, kuria norite keisti");
                input = scannerObj.nextLine();
                int chosenCar = Integer.parseInt(input);
                if (array[chosenCar - 1].getClass().getName().equals("OOP.motorVehicles.Truck")) {
                    System.out.println("1. Pakrauti kroviniu ");
                    System.out.println("2. Iskrauti krovini ");
                    System.out.println("3. Judeti ");
                    input = scannerObj.nextLine();
                    String inputkg;
                    if (Integer.parseInt(input) == 1) {
                        System.out.println("Kiek kilogramu norite pakrauti?");
                        inputkg = scannerObj.nextLine();
                        ((Truck) array[chosenCar - 1]).loadTruck(Integer.parseInt(inputkg));
                    }
                    if (Integer.parseInt(input) == 2) {
                        System.out.println("Kiek kilogramu norite iskrauti?");
                        inputkg = scannerObj.nextLine();
                        ((Truck) array[chosenCar - 1]).unloadTruck(Integer.parseInt(inputkg));
                    }
                    if (Integer.parseInt(input) == 3) {
                        Directions dir = moveUI();
                        inputkg = scannerObj.nextLine();
                        ((Truck) array[chosenCar - 1]).move(dir, Integer.parseInt(inputkg));
                    }
                    // mainUI(array);
                }
                if (array[chosenCar - 1].getClass().getName().equals("OOP.motorVehicles.Car")) {
                    System.out.println("1. Isodinti keleiviu");
                    System.out.println("2. Issodinti keleivis");
                    System.out.println("3. Judeti");
                    input = scannerObj.nextLine();
                    String inputPeople;
                    if (Integer.parseInt(input) == 1) {
                        System.out.println("Kiek keleiviu norite pasodinti?");
                        inputPeople = scannerObj.nextLine();
                        ((Car) array[chosenCar - 1]).loadCar(Integer.parseInt(inputPeople));
                    }
                    if (Integer.parseInt(input) == 2) {
                        System.out.println("Kiek keleiviu norite issodinti?");
                        inputPeople = scannerObj.nextLine();
                        ((Car) array[chosenCar - 1]).unloadCar(Integer.parseInt(inputPeople));
                    }
                    if (Integer.parseInt(input) == 3) {
                        Directions dir = moveUI();
                        inputPeople = scannerObj.nextLine();
                        ((Car) array[chosenCar - 1]).move(dir, Integer.parseInt(inputPeople));
                    }
                    // mainUI(array);
                }
            } else if (chosenMain == 3) {
                SaveThread saveThread = new SaveThread(fileName, array);
                Thread thread = new Thread(saveThread);
                thread.start();
            } else if (chosenMain == 4) {
                ReadThread readThread = new ReadThread(fileName, array);
                Thread thread = new Thread(readThread);
                thread.start();
            } else if (chosenMain != 5){
                System.out.println("Tokia varianto nera");
            }
        }
    }

    private Directions moveUI(){
        System.out.println("Kuria kryptimi norite judeti?");
        System.out.println("1. Priekin");
        System.out.println("2. Atgal");
        System.out.println("3. Desinen");
        System.out.println("4. Kairen");
        input = scannerObj.nextLine();
        Directions moveDir = Directions.None;
        if(Integer.parseInt(input) == 1){ moveDir = Directions.Forward;}
        if(Integer.parseInt(input) == 2){ moveDir = Directions.Backwards;}
        if(Integer.parseInt(input) == 3){ moveDir = Directions.Right;}
        if(Integer.parseInt(input) == 4){ moveDir = Directions.Left;}
        System.out.println("Koki atstuma norite judeti " + moveDir + "?");

        return moveDir;
    }

    private int mainUI(MotorVehicle[] array){
        System.out.println("1. Isvesti visa motoriniu transporto priemoniu sarasa");
        System.out.println("2. Modifikuoti transporto priemone");
        System.out.println("3. Saugoti transporto priemones i faila");
        System.out.println("4. Gauti transporto priemones is failo");
        System.out.println("5. Iseiti is programos");
        input = scannerObj.nextLine();
        chosen = Integer.parseInt(input);
        if(chosen == 1){
            return 1;
        }
        if(chosen == 2){
            return 2;
        }
        if(chosen == 3){
            return 3;
        }
        if(chosen == 4){
            return 4;
        }
        if(chosen == 5){
            return 5;
        }
        return 0;
    }
}
