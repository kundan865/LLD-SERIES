package lecture8_strategyDesignPattern;

public class StrategyDesignPattern {

    public static void main(String[] args) {

        Robot robot1 = new CompanionRobot(
                new NormalWalk(),
                new NormalTalk(),
                new NoFly(),
                new FriendlyProjection()
        );
        robot1.walk();
        robot1.talk();
        robot1.fly();
        robot1.projection();

        System.out.println("--------------------");

        Robot robot2 = new WorkerRobot(
                new NoWalk(),
                new NoTalk(),
                new NormalFly(),
                new UnFriendlyProjectionRobot()
        );
        robot2.walk();
        robot2.talk();
        robot2.fly();
        robot2.projection();
    }
}
