
public class TaipeiComputerStore extends ComputerStore{
    
   public Computer createComputer(String item) {
       
       if (item.equals("Asus")) {
           return new AsusComputer();
       }
       else if (item.equals("Hp")) {
           return new HpComputer();
       }
       else return null;
   }

}
