public abstract class Duck {

    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
