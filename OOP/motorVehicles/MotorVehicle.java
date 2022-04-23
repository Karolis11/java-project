package OOP.motorVehicles;

public class MotorVehicle implements TrafficParticipant {
    private final static String country = "Lithuania";
    public static int vehicleCount = 0;
    private Colors color;
    private Directions movingDir = Directions.None;
    private boolean isPowerOn;
    private int weight; // kg
    private int maxSpeed = 100; // km/h
    private int vehicleNumber;
    // 1 point = 1 km
    private int x = 0;
    private int y = 0;

    // Default constructor - creates default car
    public MotorVehicle(){
        this(Colors.Black,1500, 180);
    }

    // Constructor with current speed
    public MotorVehicle(Colors clr, int weight, int maxS){
        this.color = clr;
        this.isPowerOn = false;
        this.weight = weight;
        this.maxSpeed = maxS;
        this.movingDir = Directions.None;
        assignVehicleNumber();
    }

    private void assignVehicleNumber(){
        ++vehicleCount;
        this.vehicleNumber = vehicleCount;
    }

    protected void vehicleNumberForClonedObject(){
        assignVehicleNumber();
    }
    // Setters and Getters
    public String getCountry(){
        return country;
    }

    public Directions getMovingDir() {
        return movingDir;
    }

    public void setMovingDir(Directions movingDir) {
        this.movingDir = movingDir;
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

    public int getVehicleNumber(){
        return vehicleNumber;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void move(Directions dir, int distance){
        this.setPowerOn(true);
        this.movingDir = dir;
        if(this.movingDir == Directions.Forward){
            this.y += distance;
        }
        if(this.movingDir == Directions.Backwards){
            this.y -= distance;
        }
        if(this.movingDir == Directions.Right){
            this.x += distance;
        }
        if(this.movingDir == Directions.Left){
            this.x -= distance;
        }
    }

    public void move(Directions dir, int speed, int time){
        this.setPowerOn(true);
        this.movingDir = dir;
        if(this.movingDir == Directions.Forward){
            this.y += speed * time;
        }
        if(this.movingDir == Directions.Backwards){
            this.y += -speed * time;
        }
        if(this.movingDir == Directions.Right){
            this.x += speed * time;
        }
        if(this.movingDir == Directions.Left){
            this.x += -speed * time;
        }
    }

    public final void stop(){
        this.setPowerOn(false);
        this.movingDir = Directions.None;
    }

    public void reset(){
        stop();
        this.x = 0;
        this.y = 0;
    }

}

