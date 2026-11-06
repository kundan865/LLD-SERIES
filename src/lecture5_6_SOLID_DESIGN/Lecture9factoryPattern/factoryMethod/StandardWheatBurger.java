package lecture5_6_SOLID_DESIGN.Lecture9factoryPattern.factoryMethod;

public class StandardWheatBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Standard Wheat Burger with bun, patty, cheese, and lettuce!");
    }
}
