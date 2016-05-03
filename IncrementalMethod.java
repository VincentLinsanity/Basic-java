/**
 * 常見的演算法範例
 * 
 * @author Vincent_Lin XPEC
 */
public class IncrementalMethod
{
	/**
	 * 對輸入的整數陣列加總
	 * 
	 * @author Vincent_Lin XPEC
	 * @param array
	 * @param n
	 * @return
	 */
	public int summation(int[] array, int n)
	{
		int sum = 0;

		for (int i : array)
		{
			sum += array[i];
		}
		return sum;
	}

	/**
	 * 複製一份字元陣列
	 * 
	 * @author Vincent_Lin XPEC
	 * @param array
	 * @param n
	 * @return
	 */
	public char[] copy(char[] array, int n)
	{
		char[] result = new char[10];
		for (int i = 0; i < n; i++)
		{
			result[i] = array[i];
		}
		return result;
	}

	/**
	 * 對一個整數陣列排序
	 * 
	 * @author Vincent_Lin XPEC
	 * @param array
	 * @param n
	 * @return
	 */
	public int[] simplySort(int[] array, int n)
	{
		int[] result = new int[10];
		int tempj = 0;
		for (int i = 0; i < n; i++)
		{
			int min = array[i];
			for (int j = i + 1; j < n; j++)
			{
				if (min > array[j])
				{
					min = array[j];
					tempj = j;
				}
			}
			swap(array, i, tempj);
		}
		return result;
	}

	private void swap(int[] array, int i, int j)
	{
		int tempi = array[i];
		int tempj = array[j];
		array[i] = tempj;
		array[j] = tempi;
	}

	/**
	 * 遇到大寫字母轉成小寫字母，其他不變
	 * 
	 * @author Vincent_Lin XPEC
	 * @param array
	 * @return
	 */
	public char[] lowerCase(char[] array)
	{
		char[] result = new char[array.length];
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] <='z'  && array[i] >= 'a')
			{
				int diff = array[i] - 'a';
				result[i] = (char)(diff + 'A');
				continue;
			}
			result[i] = array[i];
		}

		return result;
	}
}
