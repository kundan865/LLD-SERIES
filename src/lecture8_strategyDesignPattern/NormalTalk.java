package lecture8_strategyDesignPattern;

// --- Concrete Strategies for Talk ---
public class NormalTalk implements TalkableRobot {
    public void talk() {
        System.out.println("Talking normally...");
    }
}
