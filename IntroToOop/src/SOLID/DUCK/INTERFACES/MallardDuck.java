package SOLID.DUCK.INTERFACES;

public class MallardDuck extends Duck{

    public MallardDuck()
    {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    void display() {
        System.out.println("Mallard Duck");
    }
}
