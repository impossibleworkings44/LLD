package WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy {
    public void Drive() {
        System.out.println("Normal Drive strategy...");
    }
}
