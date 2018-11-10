
public class Recursion 
{
	
	public static void main (String[] args) {
		
	}
	
	
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
			return fibonachi(num-1) + fibonachi(num-2);
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
	
	public static String changePi(String str) {
		  if(str.length() == 0) {
			  return "";
		  } 
		  else if (str.length() == 1) {
			  return str.substring(0);
		  }
		  else if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			  return "3.14" + changePi(str.substring(2));
		  }
		  else {
			  return str.substring(0,1) + changePi(str.substring(1));
		  }
	}
	
	public static String noX(String str) {
		  if(str.length() == 0)
		  {
			  return "";
		  }
		  else if(str.charAt(0) == 'x') {
			  return "" + noX(str.substring(1));
		  }
		  else {
			  return str.substring(0,1) + noX(str.substring(1));
		  }
	}

	public static boolean array6(int[] nums, int index) {
		  if(index == nums.length) {
			  return false;
		  }
		  else if(nums[index] == 6) {
			  return true;
		  }
		  else {
			  return array6(nums,index+1);
		  }
	}
	
	public int array11(int[] nums, int index) {
		  if(index == nums.length) {
			  return 0 ;
		  }
		  else if (nums[index] == 11) {
			  return 1 + array11(nums,index+1);
		  }
		  else {
			  return array11(nums,index+1);
		  }
		}
	
	public String allStar(String str) {
		  if(str.length() == 0) {
			  return "";
		  }
		  if(str.length() == 1) {
			  return str.substring(0, 1);
		  }
		  return str.substring(0, 1) + "*" + allStar(str.substring(1));
		}
	
	public String pairStar(String str) {
		  if(str.length() == 0) {
			  return "";
		  }
		  else if(str.length() == 1) {
			  return str.substring(0);
		  }
		  else if(str.charAt(0) == str.charAt(1)) {
			  return str.substring(0,1) + "*" + pairStar(str.substring(1));
		  }
		  else {
			  return str.substring(0,1) + pairStar(str.substring(1));
		  }
	}

	public boolean array220(int[] nums, int index) {
		  if(nums.length < 2 || index+1 == nums.length) {
			  return false;
		  }
		  else if(nums[index]*10 == nums[index+1]) {
			 return true; 
		  }
		  else {
			  return array220(nums,index+1);
		  }
	}
	
	public String endX(String str) {
		if(str.length() == 0)
			return str;
		if(str.charAt(0) == 'x')
			return endX(str.substring(1)) + 'x';
		return str.charAt(0) + endX(str.substring(1));
	}
	
	public int countPairs(String str) {
		if(str.length() < 3) {
			return 0;
		}
		else if (str.charAt(0) == str.charAt(2)) {
			return 1 + countPairs(str.substring(1));
		}
		else {
			return countPairs(str.substring(1));
		}
	}
	
	public int countAbc(String str) {
		if(str.length() < 3) {
			return 0;
		}
		else if ((str.charAt(0) == 'a' && str.charAt(1) == 'b' && str.charAt(2) == 'c') ||
				(str.charAt(0) == 'a' && str.charAt(1) == 'b' && str.charAt(2) == 'a')) {
			return 1 + countAbc(str.substring(1));
		}
		else {
			return countAbc(str.substring(1));
		}  
	}
	
	public int count11(String str) {
		if(str.length() < 2)
			return 0;
		if(str.substring(0, 2).equals("11"))
			return 1 + count11(str.substring(2));
		return count11(str.substring(1));  
	}
	
	public String stringClean(String str) {
		 if(str.length() == 0) {
			 return str;
		 }
		 else if (str.length() == 1) {
			 return str.substring(0);
		 }
		 else if(str.charAt(0) == str.charAt(1)) {
			 return stringClean(str.substring(1));
		 }
		 else {
			 return str.charAt(0) + stringClean(str.substring(1));
		 }
	}

	public int countHi2(String str) {
		if(str.length() < 2)
			return 0;
		if(str.length() == 2)
			return (str.equals("hi")) ? 1 : 0;
		if(str.charAt(0) == 'x')
		{
			if(str.substring(1, 3).equals("hi"))
				return countHi2(str.substring(3));
			return countHi2(str.substring(1));
		}
		if(str.substring(0, 2).equals("hi"))
			return 1 + countHi2(str.substring(2));
		if(str.substring(1, 3).equals("hi"))
			return 1 + countHi2(str.substring(3));
		return countHi2(str.substring(2));
	}
	
	public String parenBit(String str) {
		if(str.length() == 0) {
			return str;
		}
		else if (str.charAt(0) == '(') {
			int i = 0;
			while (str.charAt(i) != ')') {
				i++;
			}
			return str.substring(0, i+1);
		}
		else {
			return parenBit(str.substring(1));
		}
	}
	
	public boolean nestParen(String str) {
		int len = str.length();
		if(len == 0)
			return true;
		if(str.charAt(0) == '(' && str.charAt(len - 1) == ')')
				return nestParen(str.substring(1, len - 1));
		return false;
	}

	public int strCount(String str, String sub) {
		int sLen = sub.length();
		if(str.length() < sLen)
			return 0;
		if(str.substring(0, sLen).equals(sub))
			return 1 + strCount(str.substring(sLen), sub);
		return strCount(str.substring(1), sub);  
	}

	public boolean strCopies(String str, String sub, int n) {
		  if(n == 0)
				return true;
			if(str.length() < sub.length())
				return false;
			if(str.substring(0, sub.length()).equals(sub))
				return strCopies(str.substring(1), sub, n - 1);
			return strCopies(str.substring(1), sub, n);
		}

	public int strDist(String str, String sub) {
		int stLen = str.length();
		int sbLen = sub.length();
		if(stLen < sbLen)
			return 0;
		if(str.substring(0, sbLen).equals(sub))
		{
			if(str.substring(stLen - sbLen, stLen).equals(sub))
				return stLen;
			return strDist(str.substring(0, stLen - 1), sub);
		}
		return strDist(str.substring(1), sub);
	}
	
	
	
	
	
	
	
	
	
	
	
}
