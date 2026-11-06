package lecture5_6_SOLID_DESIGN.Lecture9factoryPattern.abstractMethod;

public class BasicWheatBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Basic Wheat Burger with bun, patty, and ketchup!");
    }
}
