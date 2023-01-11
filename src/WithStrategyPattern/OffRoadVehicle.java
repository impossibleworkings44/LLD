package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
