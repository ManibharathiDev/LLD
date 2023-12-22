package SOLID.DUCK.INTERFACES;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
