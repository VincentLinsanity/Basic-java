public class Singleton extends Thread {
    //private static volatile Singleton uniqueInstance;
    //private static Singleton uniqueInstance = new Singleton();
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void run() {
        while (true) {
            go();
        }
    }

    public void go() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        doMore();
    }

    public void doMore() {
        System.out.println("show something");
    }

}
