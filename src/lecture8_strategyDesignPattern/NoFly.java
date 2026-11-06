package lecture8_strategyDesignPattern;

public class NoFly implements FlyableRobot {
    public void fly() {
        System.out.println("Cannot fly.");
    }
}
