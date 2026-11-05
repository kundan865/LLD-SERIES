import org.w3c.dom.ls.LSOutput;

class Animal {
    void  sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Animal a =new Dog();
        a.sound();
    }
}