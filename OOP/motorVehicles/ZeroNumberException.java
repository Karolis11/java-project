package OOP.motorVehicles;

public class ZeroNumberException extends InvalidNumberException{
    public ZeroNumberException(){
        super("The number can not be zero");
    }
    public ZeroNumberException(String msg){
        super(msg);
    }
}
