import java.util.*;
public class Anagram {
   public static int num_of_chars=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Enter the 1st string: ");
         Scanner sc=new Scanner(System.in);
         String first=sc.nextLine();
         System.out.println("Enter the second string: ");
         String second=sc.nextLine();
         anagram_find(first,second);
	}
	
	public static void anagram_find(String first,String second)
	{
		if(first.length()!=second.length())
		{
			System.out.println("Strings are not anagram to each other");
			return;
		}
		//logic element is different or not;
		int[] counter_array=new int[num_of_chars];
		for(int i=0;i<first.length();i++)
		{
			counter_array[first.charAt(i)-'a']+=1;
			counter_array[second.charAt(i)-'a']-=1;
			System.out.println(first.charAt(i)+" count "+counter_array[first.charAt(i)-'a']+" "+
			second.charAt(i)+" count "+counter_array[second.charAt(i)-'a']);
		}
		boolean flag=false;
		for(int num:counter_array)
		{
			if(num!=0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(first+" and "+second+" are not anagram to each other");
		}
		else {
			System.out.println(first+" and "+second+" are anagram to each other");
		}
	}

}
