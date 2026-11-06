package lecture8_strategyDesignPattern;

public class FriendlyProjection implements ProjectableRobot{
    @Override
    public void projection() {
        System.out.println("Friendly projection robot");
    }
}
