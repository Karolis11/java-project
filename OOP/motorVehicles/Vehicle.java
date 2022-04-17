package OOP.motorVehicles;

public interface Vehicle extends TrafficParticipant {
    void turnEngine(boolean engine);
    void speedup(int spd);
    void slowdown(int spd);
    void stop();
}
