	/**
	 * 產生一個範圍在0-9,a-z,A-Z的隨機字元陣列
	 * 
	 * @author Vincent_Lin XPEC
	 * @param pSize
	 * @return
	 */
	public static char[] createRandomLetterArray(int pSize)
	{
		char[] result = new char[pSize];
		for (int i = 0; i < pSize; i++)
		{
			result[i] = createRandomLetter();
		}
		return result;
	}

	private static char createRandomLetter()
	{
		Random random = new Random();
		String alphabet = createAlphabet();
		int n = alphabet.length();
		int rNumber = random.nextInt(n);

		return alphabet.charAt(rNumber);
	}

	private static String createAlphabet()
	{
		String result = new String();
		for (int i = 0; i < 10; i++)
		{
			result += i;
		}
		for (int i = 0; i < 26; i++)
		{
			result += (char) ('a' + i);
		}
		for (int i = 0; i < 26; i++)
		{
			result += (char) ('A' + i);
		}
		return result;
	}
