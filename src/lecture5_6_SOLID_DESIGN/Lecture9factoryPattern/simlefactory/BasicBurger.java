package lecture5_6_SOLID_DESIGN.Lecture9factoryPattern.simlefactory;

// --- Concrete Burger Implementations ---
public class BasicBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Basic Burger with bun, patty, and ketchup!");
    }
}
