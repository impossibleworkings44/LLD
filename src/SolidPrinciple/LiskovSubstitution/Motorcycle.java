package SolidPrinciple.LiskovSubstitution;

public class Motorcycle implements Bike {
    boolean isEngine;
    int speed;
    @Override
    public void turnOnEngine() {
        isEngine = true;
    }

    @Override
    public void incSpeed() {
        speed+=40;
    }
}
