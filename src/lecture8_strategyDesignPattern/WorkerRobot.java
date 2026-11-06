package lecture8_strategyDesignPattern;

public class WorkerRobot extends Robot {
    public WorkerRobot(
            WalkableRobot w,
            TalkableRobot t,
            FlyableRobot f,
            ProjectableRobot p) {

        super(w, t, f, p);
    }
}
