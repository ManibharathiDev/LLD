package singleton;

public class Second {
    public void printAge()
    {
        System.out.println(TestSingleton.getInstance().getAge());
    }
}
