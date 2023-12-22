package SOLID.DUCK.INTERFACES;

public class DuckSimulator {
    public static void main(String[] args)
    {
        Duck mallardDuch = new MallardDuck();
        mallardDuch.performFly();
        mallardDuch.performQuack();
        mallardDuch.display();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
