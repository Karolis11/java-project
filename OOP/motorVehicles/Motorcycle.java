package OOP.motorVehicles;

public class Motorcycle extends MotorcycleAbstract{
    private static final int wheelsCount = 2;
    private boolean isFrontWheelLifted = false;

    public boolean isFrontWheelLifted() {
        return isFrontWheelLifted;
    }

    public void liftFrontWheel(boolean isLifted){isFrontWheelLifted = isLifted;}

    public void move(Directions dir, int distance) {
        if(dir == Directions.Forward){
            setY(getY() + distance);
        }
        if(dir == Directions.Backwards){
            setY(getY() - distance);
        }
        if(dir == Directions.Right){
            setX(getX() + distance);
        }
        if(dir == Directions.Left){
            setX(getX() - distance);
        }
    }

    public void move(Directions dir, int speed, int time) {
        if(dir == Directions.Forward){
            setY(getY() + speed * time);
        }
        if(dir == Directions.Backwards){
            setY(getY() - speed * time);
        }
        if(dir == Directions.Right){
            setX(getX() + speed * time);
        }
        if(dir == Directions.Left){
            setX(getX() - speed * time);
        }
    }

    public void turnEngine(boolean engine) {
        setEngineOn(engine);
    }

    public void stop() {
        slowdown(getSpeed());
    }

    public void reset() {
        setX(0);
        setY(0);
        slowdown(getSpeed());
        liftFrontWheel(false);
    }

}
