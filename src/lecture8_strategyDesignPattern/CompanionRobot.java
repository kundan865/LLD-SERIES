package lecture8_strategyDesignPattern;

public class CompanionRobot extends Robot {
    public CompanionRobot(
            WalkableRobot w,
            TalkableRobot t,
            FlyableRobot f,
            ProjectableRobot p) {

        super(w, t, f, p);
    }
}
