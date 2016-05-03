
public class TokyoComputerStore extends ComputerStore{
    
    public Computer createComputer(String item) {
        
        if (item.equals("Sony")) {
            return new SonyComputer();
        }
        else return null;
    }

}
