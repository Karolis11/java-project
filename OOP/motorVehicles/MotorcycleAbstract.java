package OOP.motorVehicles;

abstract public class MotorcycleAbstract implements Vehicle {
    private final static String country = "Lithuania";
    private boolean isEngineOn = false;
    private int currentSpeed = 0;
    private int x;
    private int y;

    public void speedup(int spd){
        currentSpeed += spd;
    }
    public void slowdown(int spd){
        currentSpeed -= spd;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return currentSpeed;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public boolean isEngineOn(){return isEngineOn;}
}
