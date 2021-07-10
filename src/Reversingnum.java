/**
 * 
 */

/**
 * @author Soumik
 *
 */
import java.util.*;
public class Reversingnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer number");
		Integer num=sc.nextInt();
		Integer res=reverse_find(num);
		System.out.println(res);
	}
	public static int reverse_find(int num)
	{
		int rev=0;
		int rem=num;
		int prev_rev=0;
		while(rem!=0)
		{   
			rev=rev*10+(rem%10);
			if ((rev-rem%10)/10!=prev_rev)
			{
				return 0;
			}
			prev_rev=rev;
			rem=rem/10;
		}
		//System.out.println(num%10);
		//System.out.println(rev);
		return rev;
	}

}
