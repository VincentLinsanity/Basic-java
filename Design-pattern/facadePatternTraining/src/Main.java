
public class Main {
    public static void main(String[] args) {
        SomeWork someWork = new SomeWork();
        otherWork otherWork = new otherWork(1);
        
        facade facade = new facade(someWork, otherWork);
        facade.doSomethings();
        
    }

}
