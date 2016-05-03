import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent_Lin
 *�Ѥl�ɤ��u�t
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
    
    //���o�@�ɪ��Ѥl�����`��
    public int getChessCount() {
        return chessFlyweight.size();
    }
}

//�Ѥl�ɤ�����
interface ChessFlyweight {

    public abstract void Display(int x, int y);
}

//�Ѥl�ɤ�
class ConcreteChessFlyweight implements ChessFlyweight {

    private String name;//�@�ɸ��

    public ConcreteChessFlyweight(String name) {
        this.name = name;
    }

    //x,y�y�ЫD�@�ɸ��
    @Override
    public void Display(int x, int y) {
        System.out.println(name + " chess at location:" + x + y);
    }
}
