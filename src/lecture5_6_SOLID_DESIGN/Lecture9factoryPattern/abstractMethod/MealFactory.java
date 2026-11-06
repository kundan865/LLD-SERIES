package lecture5_6_SOLID_DESIGN.Lecture9factoryPattern.abstractMethod;

// --- Abstract Factory ---
public interface MealFactory {
    Burger createBurger(String type);
    GarlicBread createGarlicBread(String type);
}
