package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;
    Vehicle(DriveStrategy driveObj) {
        this.driveObject = driveObj;
    }

    public void drive() {
        driveObject.Drive();
    }
}
