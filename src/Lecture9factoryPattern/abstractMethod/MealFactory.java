package Lecture9factoryPattern.abstractMethod;

// --- Abstract Factory ---
public interface MealFactory {
    Burger createBurger(String type);
    GarlicBread createGarlicBread(String type);
}
