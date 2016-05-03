/*
Soundex coding groups together words that appear to sound alike based on their spelling. For example,
“can” and “khawn”, “con” and “gone” would be equivalent under Soundex coding.
Soundex coding involves translating each word into a series of digits in which each digit represents
a letter:
1 represents B, F, P, or V
2 represents C, G, J, K, Q, S, X, or Z
3 represents D or T
4 represents L
5 represents M or N
6 represents R
The letters A, E, I, O, U, H, W, and Y are not represented in Soundex coding, and repeated letters
with the same code digit are represented by a single instance of that digit. Words with the same
Soundex coding are considered equivalent.
Input
Each line of input contains a single word, all upper case, less than 20 letters long.
Output
For each line of input, produce a line of output giving the Soundex code.
Sample Input
KHAWN
PFISTER
BOBBY
Sample Output
25
1236
11
*/

import java.util.HashMap;

public class SoundexCoding
{
	private static HashMap<String, Integer> codeBook = new HashMap<String, Integer>();

	public static void main(String[] args)
	{
		String testString = "PFISTER";
		String[] testArray = testString.split("");
		String result = "";
		
		for (String s : testArray)
		{
			if (s.equals(""))
				continue;
			int tempInt = checkCodeBook(s);
			if (tempInt != 0)
			{
				result += String.valueOf(tempInt);
			}
		}
		System.out.print(result);
	}

	private static int checkCodeBook(String s)
	{
		if (codeBook.containsKey(s))
		{
			int result = codeBook.get(s);
			removeCodeBookByValue(result);
			return result;
		}
		return 0;
	}
	
	private static void removeCodeBookByValue(Integer i)
	{
		HashMap<String, Integer> backupMap = new HashMap<String, Integer>();
		for (String s : codeBook.keySet())
		{
			backupMap.put(s, codeBook.get(s));
		}
		
		for (String s : backupMap.keySet())
		{
			if (codeBook.get(s) == i)
			{
				codeBook.remove(s);
			}
		}
	}

	static
	{
		codeBook.put("B", 1);
		codeBook.put("F", 1);
		codeBook.put("P", 1);
		codeBook.put("V", 1);

		codeBook.put("C", 2);
		codeBook.put("G", 2);
		codeBook.put("J", 2);
		codeBook.put("K", 2);
		codeBook.put("Q", 2);
		codeBook.put("S", 2);
		codeBook.put("X", 2);
		codeBook.put("Z", 2);

		codeBook.put("D", 3);
		codeBook.put("T", 3);

		codeBook.put("L", 4);

		codeBook.put("M", 5);
		codeBook.put("N", 5);

		codeBook.put("R", 6);
	}

}
