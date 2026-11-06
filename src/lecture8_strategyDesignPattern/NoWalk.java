package lecture8_strategyDesignPattern;

public class NoWalk implements WalkableRobot {
    public void walk() {
        System.out.println("Cannot walk.");
    }
}
