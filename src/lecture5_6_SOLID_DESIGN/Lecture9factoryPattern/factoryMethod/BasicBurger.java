package lecture5_6_SOLID_DESIGN.Lecture9factoryPattern.factoryMethod;

public class BasicBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Basic Burger with bun, patty, and ketchup!");
    }
}
