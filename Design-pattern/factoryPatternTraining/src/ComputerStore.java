
public abstract class ComputerStore {
    
    public Computer orderComputer(String type) {
        Computer computer;
        computer = createComputer(type);
        return computer;
    }
 
    protected abstract Computer createComputer(String type);
}
