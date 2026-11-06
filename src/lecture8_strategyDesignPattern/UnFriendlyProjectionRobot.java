package lecture8_strategyDesignPattern;

public class UnFriendlyProjectionRobot implements ProjectableRobot{
    @Override
    public void projection() {
        System.out.println("Un friendly projection robot");
    }
}
