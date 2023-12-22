package SOLID.DUCK.INTERFACES;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
