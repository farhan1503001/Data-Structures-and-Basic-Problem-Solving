import java.util.*;
public class Palindromeint {
	
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean result=check_palindrome(number);
		if(result)
		{
			System.out.println("Not Palindrome");
		}
		else {
			System.out.println("Palindrome");
		}
		
	}
	public static boolean check_palindrome(int number)
	{  
		boolean flag=false;
		String temp=String.valueOf(number);
		int len=temp.length();
		for(int i=0;i<len;i++)
		{
			if (temp.charAt(i)!=temp.charAt(len-i-1))
			{
				flag=true;
				System.out.println("Left: "+temp.charAt(i)+" Right "+temp.charAt(len-i-1));
				break;
			}
		}
		
		return flag;
	}

}
