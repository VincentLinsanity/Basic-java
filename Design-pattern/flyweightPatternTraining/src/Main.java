
/**
 * @author Vincent_Lin
 * 主程式
 */
public class Main {
    public static void main(String[] args) {
        
        //建立一個工廠實體
        ChessFlyweightFactory chessFactory = new ChessFlyweightFactory();
        
        //利用工廠實體產生四個棋子物件
        ConcreteChessFlyweight chess1 = chessFactory.getChessFlyweight("black");
        chess1.Display(0, 0);
        ConcreteChessFlyweight chess3 = chessFactory.getChessFlyweight("white");
        chess3.Display(1, 1);
        ConcreteChessFlyweight chess2 = chessFactory.getChessFlyweight("black");
        chess2.Display(0, 1);
        ConcreteChessFlyweight chess4 = chessFactory.getChessFlyweight("white");
        chess4.Display(1, 2);

        //計算棋子物件總數
        System.out.println("total chess number: "+ chessFactory.getChessCount());      
    }

}
