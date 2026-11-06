package lecture8_strategyDesignPattern;

// --- Robot Base Class ---
public abstract class Robot {

    protected WalkableRobot walkBehavior;
    protected TalkableRobot talkBehavior;
    protected FlyableRobot flyBehavior;
    protected ProjectableRobot projectableRobot;

    public Robot(WalkableRobot w, TalkableRobot t, FlyableRobot f, ProjectableRobot p) {
        this.walkBehavior = w;
        this.talkBehavior = t;
        this.flyBehavior = f;
        this.projectableRobot = p;
    }

    public void walk() {
        walkBehavior.walk();
    }

    public void talk() {
        talkBehavior.talk();
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void projection(){
        projectableRobot.projection();
    }
}
