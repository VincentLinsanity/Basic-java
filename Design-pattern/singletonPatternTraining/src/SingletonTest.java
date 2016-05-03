
public class SingletonTest {
    public static void main(String[] args) {
        Runnable theJob = Singleton.getInstance();
        Thread t = new Thread(theJob);
        t.start();
    }

}
