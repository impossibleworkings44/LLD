package SolidPrinciple.LiskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        Cycle c = new Cycle();
        m.turnOnEngine();
        //Class cycle should follow all the methods of parent class
        // and not narrow it down
        c.turnOnEngine();
    }
}
