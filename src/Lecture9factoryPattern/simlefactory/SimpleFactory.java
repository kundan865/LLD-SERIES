package Lecture9factoryPattern.simlefactory;

public class SimpleFactory {
    public static void main(String[] args) {

        String type = "premium";

        BurgerFactory myBurgerFactory = new BurgerFactory();

        Burger burger = myBurgerFactory.createBurger(type);

        if (burger != null) {
            burger.prepare();
        }
    }
}
