/**
 * 這是一隻用來測試Integer溢位問題的小程式
 * 
 * @author Vincent_Lin XPEC
 */
public class Promotion
{
	public static void main(String[] args) throws ParseException
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = dateFormat.parse("1988-01-22");
		Date current = new Date();
		long life = current.getTime() - birthday.getTime();
		
		//life = life / 1000;
		//int daySecond = 365 * 24 * 60 * 60;
		int daySecond = 365 * 24 * 60 * 60 * 1000; // 錯誤case，試著把這行注解掉並取消上面兩行的注解
		
		int age = (int) (life / daySecond);
		System.out.println(age);

		int tempMIN_VALUE = Integer.MIN_VALUE;
		tempMIN_VALUE++;
		System.out.println("Integer.MAX_VALUE =  " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("Integer.MIN_VALUE +1  = " + tempMIN_VALUE);
		System.out.println(Integer.MAX_VALUE == -tempMIN_VALUE);
	}
}
