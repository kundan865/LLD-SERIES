package lecture8_strategyDesignPattern;

public class NoTalk implements TalkableRobot {
    public void talk() {
        System.out.println("Cannot talk.");
    }
}
