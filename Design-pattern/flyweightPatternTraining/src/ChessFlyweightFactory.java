import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent_Lin
 *棋子享元工廠
 */
public class ChessFlyweightFactory {

    private Map<String, ConcreteChessFlyweight> chessFlyweight = 
            new HashMap<String, ConcreteChessFlyweight>();

    public ConcreteChessFlyweight getChessFlyweight(String key) {

        if (!chessFlyweight.containsKey(key)) {
            chessFlyweight.put(key, new ConcreteChessFlyweight(key));
        }
        return chessFlyweight.get(key);
    }
    
    //取得共享的棋子物件總數
    public int getChessCount() {
        return chessFlyweight.size();
    }
}

//棋子享元介面
interface ChessFlyweight {

    public abstract void Display(int x, int y);
}

//棋子享元
class ConcreteChessFlyweight implements ChessFlyweight {

    private String name;//共享資料

    public ConcreteChessFlyweight(String name) {
        this.name = name;
    }

    //x,y座標非共享資料
    @Override
    public void Display(int x, int y) {
        System.out.println(name + " chess at location:" + x + y);
    }
}
