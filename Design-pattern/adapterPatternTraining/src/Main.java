
public class Main {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        
        turkey.gobble();
        turkey.fly();
        
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }

}
