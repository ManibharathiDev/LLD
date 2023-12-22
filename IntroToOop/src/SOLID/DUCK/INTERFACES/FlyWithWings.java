package SOLID.DUCK.INTERFACES;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I am Flying");
    }
}
