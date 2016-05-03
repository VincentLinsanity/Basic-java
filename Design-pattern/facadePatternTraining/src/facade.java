
public class facade {
    SomeWork someWork;
    otherWork otherWork;
    public facade(SomeWork someWork, otherWork otherWork) {
        
        this.someWork = someWork;
        this.otherWork = otherWork;
    }
    
    public void doSomethings() {       
        someWork.doSomething();
        otherWork.doOtherWork();
    }

}
