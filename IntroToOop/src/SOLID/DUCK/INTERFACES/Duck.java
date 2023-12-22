package SOLID.DUCK.INTERFACES;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour fb)
    {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb)
    {
        quackBehaviour = qb;
    }

    void performFly(){
        flyBehaviour.fly();
    }

    void performQuack(){
        quackBehaviour.quack();
    }

    abstract void display();



}
