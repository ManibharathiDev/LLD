package singleton;

public class TestSingleton {

    private int age;

    private static TestSingleton instance;

    private TestSingleton(){}

    public static TestSingleton myInstance()
    {
        if(instance == null)
        {
            instance = new TestSingleton();
        }

        return instance;
    }

    public static TestSingleton getInstance()
    {
        if(instance == null)
        {
            instance = new TestSingleton();
        }

        return instance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
