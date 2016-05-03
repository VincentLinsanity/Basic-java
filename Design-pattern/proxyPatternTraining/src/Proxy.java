
public class Proxy implements Sourceable{
    private Sourceable source;
    
    public Proxy(Sourceable source) {
        this.source = source;
    }
    
    public void method() {
        otherMethod();
        source.method();
        otherMethod();
    }
    
    public void otherMethod() {
        System.out.println("Other method");
    }

}
