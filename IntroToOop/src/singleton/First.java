package singleton;


public class First {

    public void setAge()
    {
        TestSingleton.getInstance().setAge(10);
    }
    public void printAge()
    {
        System.out.println(TestSingleton.getInstance().getAge());
    }
}
