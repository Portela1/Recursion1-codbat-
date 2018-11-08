
public class Recursion 
{
	
	public static int factorial(int num) 
	{
		if(num < 1) 
		{
			return 1;
		}
		return factorial(num - 1)*num;
	}
	
	public static int fibonachi(int num) 
	{
		if(num == 1) 
		{
			return 0;
		}
		if(num == 2) 
		{
			return 1;
		}
		else 
		{
			return fibonachi(num-1)+fibonachi(num-2);
		}
	}
	
	public static int sumton(int num) 
	{
		if(num == 0) 
		{
			return 0;
		}
		else 
		{
			return num + sumton(num-1);
		}
	}
	
	public static boolean isPalindrom (String word) 
	{
		if(word.length() <= 1) 
		{
			return true;
		}
		else if (word.charAt(0) == word.charAt(word.length()-1)) 
		{
			return isPalindrom(word.substring(1, word.length()-1));
		}
		else 
		{
			return false;
		}
	}
	
	public static int bunnyEars(int bunnies) 
	{
	if(bunnies == 0)
	{
		return 0;
	}
	return 2 + bunnyEars(bunnies-1);
	}
	
	public static int bunnyEars2(int bunnies) 
	{
		if(bunnies == 0)
		{
			return 0;
		}
		else if(bunnies%2 == 0)
		{
			return 3 + bunnyEars2(bunnies - 1);
		}
		else
		{
			return 2 + bunnyEars2(bunnies - 1);
		}
	}
	
	public static int triangle(int rows)
	{
		if(rows == 0)
		{
			return 0;	
		}
		return rows + triangle(rows-1);
	}

	public static int sumDigits(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		return n%10 + sumDigits(n/10);
	}
	
	public static int count7(int n) 
	{
		if(n == 0) 
		{
			return 0;
		}
		else if(n%10 == 7) 
		{
			return 1 + count7(n/10);
		}
		else 
		{
			return count7(n/10);
		}
	}
	
	public static int count8(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n == 8)
		{
			return 1;
		}
		else if(n%10 == 8)
		{
			if ((n/10)%10 == 8) 
			{
				return 2 + count8(n/10);
			}
			else 
			{
				return 1 + count8(n/10);
			}
		}
		else
		{
			return count8(n/10);	
		}
	}
	
	public static int powerN(int base, int n)
	{
		if(n <= 1)
		{
			return base;
		}
		else if(base == 0)
		{
			return 0;
		}
		else
		{
			return base * powerN(base,n-1);
		}
	}
	
	public static int countX(String str)
	{
		
		if (str.isEmpty()) {
			return 0;
		}
		else if(str.charAt(0) == 'x')
		{
			return 1 + countX(str.substring(1));
		}
		else
		{
			return countX(str.substring(1));
		}
	}
	
	public static int countHi(String str)
	{
		if(str.length() < 2)
		{
			return 0;
		}
		else if(str.charAt(0) == 'h' && str.charAt(1) == 'i')
		{
			return 1 + countHi(str.substring(1));
		}
		
		
		return countHi(str.substring(1));
		
	}
	
	public static String changeXY(String str)
	{
		if(str.length() == 0) {
			return "";
		}
		else if(str.charAt(0) == 'x') {
			return "y" + changeXY(str.substring(1));
		}
		return str.charAt(0) + changeXY(str.substring(1));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
