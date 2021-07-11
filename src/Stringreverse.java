import java.util.*;
public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Enter the string: ");
         Scanner sc=new Scanner(System.in);
         String val=sc.nextLine();
         sc.close();
         rev_string(val);
         
         StringBuffer buff=new StringBuffer();
         buff.append(val);
         buff.reverse();
         System.out.println("\nReversed string is "+buff.toString());
	}
	public static void rev_string(String val)
	{
		char[] temp=val.toCharArray();
		int len=temp.length;
		int start=0;
		int end=len-1;
		while(start<end)
		{
			char value=temp[start];
			temp[start]=temp[end];
			temp[end]=value;
			start++;
			end--;
		}
		
		System.out.print("Reverse string: ");
		for(char c:temp) {
			System.out.print(c);
		}
		
		
	}

}
