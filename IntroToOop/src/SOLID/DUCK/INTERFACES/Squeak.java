package SOLID.DUCK.INTERFACES;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
