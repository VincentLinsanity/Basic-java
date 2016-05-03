
/**
 * @author Vincent_Lin
 * �D�{��
 */
public class Main {
    public static void main(String[] args) {
        
        //�إߤ@�Ӥu�t����
        ChessFlyweightFactory chessFactory = new ChessFlyweightFactory();
        
        //�Q�Τu�t���鲣�ͥ|�ӴѤl����
        ConcreteChessFlyweight chess1 = chessFactory.getChessFlyweight("black");
        chess1.Display(0, 0);
        ConcreteChessFlyweight chess3 = chessFactory.getChessFlyweight("white");
        chess3.Display(1, 1);
        ConcreteChessFlyweight chess2 = chessFactory.getChessFlyweight("black");
        chess2.Display(0, 1);
        ConcreteChessFlyweight chess4 = chessFactory.getChessFlyweight("white");
        chess4.Display(1, 2);

        //�p��Ѥl�����`��
        System.out.println("total chess number: "+ chessFactory.getChessCount());      
    }

}
