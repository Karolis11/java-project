package OOP.motorVehicles;

public interface TrafficParticipant {
    void move(Directions dir, int distance);
    void move(Directions dir, int speed, int time);
}
