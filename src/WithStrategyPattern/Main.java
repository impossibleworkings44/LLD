package WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        System.out.println("Strategy pattern used when child class have same code which base class don't have, helps avoid reusing same code");
        //calling drive method for Sports Vehicle
        vehicle.drive();
    }
}
