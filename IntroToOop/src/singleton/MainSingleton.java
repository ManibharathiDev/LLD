package singleton;

public class MainSingleton {
    public static void main(String[] args)
    {




        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                TestSingleton t1 = TestSingleton.getInstance();
                System.out.println(t1.getAge());
                TestSingleton t2 = TestSingleton.getInstance();
                t2.setAge(10);
                System.out.println(t2.getAge());
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                TestSingleton t1 = TestSingleton.getInstance();
                System.out.println(t1.getAge());
                TestSingleton t2 = TestSingleton.getInstance();
                t2.setAge(10);
                System.out.println(t2.getAge());
            }
        });

        t3.start();
        t4.start();

        System.out.println("DEBUG");



//        First first = new First();
//        first.setAge();
//        first.printAge();
//
//        Second second = new Second();
//        second.printAge();

//        TestSingleton testSingleton = new TestSingleton();
//        System.out.println(testSingleton.getAge());
    }
}
