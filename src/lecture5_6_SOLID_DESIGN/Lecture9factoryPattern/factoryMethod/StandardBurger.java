package lecture5_6_SOLID_DESIGN.Lecture9factoryPattern.factoryMethod;

public class StandardBurger implements Burger {
    public void prepare() {
        System.out.println("Preparing Standard Burger with bun, patty, cheese, and lettuce!");
    }
}
