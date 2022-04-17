package OOP.motorVehicles;

public class InvalidNumberException extends Exception{
    int numb;
    public InvalidNumberException(String msg){ super(msg); }
    public InvalidNumberException(String msg, int num){
        super(msg + ": " + num);
        numb = num;
    }
    public InvalidNumberException(int num){
        super("The number can not be negative: " + num);
        numb = num;
    }
}
