package lecture5_6_SOLID_DESIGN.Lecture9factoryPattern.abstractMethod;

public class PremiumBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Premium Burger with gourmet bun, premium patty, cheese, lettuce, and secret sauce!");
    }
}
