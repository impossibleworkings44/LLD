package SolidPrinciple.LiskovSubstitution;

public class Cycle implements  Bike {
    boolean isEngine;
    int speed;

    @Override
    public void turnOnEngine() {
        throw new AssertionError("No engine found");
    }

    public void incSpeed() {
        speed += 10;
    }
}
