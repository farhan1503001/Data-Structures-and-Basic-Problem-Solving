import java.math.BigInteger;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the fibonacci sequence number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<=45){
			fibonacci_mem(num);
			fibonacci_opt(num);
		}
		else {
			fibonacci_big(num);
		}
		
		int result=efficient_fibonacci(num);
		System.out.println("N th term: "+result);
		sc.close();

	}
	public static int efficient_fibonacci(int num) {
		//here we will calculate fibonacci number using Knott's formula
		//((root5+1)/2)^n)/(root5);
		Double temp=(Math.sqrt(5)+1)/2.0;
		Double result=Math.pow(temp,num)/Math.sqrt(5);
		return (int)Math.round(result);
	}
	//This function will work for only int limit num-23
	public static void fibonacci_mem(int num)
	{
		int[] fibonacci=new int[num+2];
		fibonacci[0]=0;
		fibonacci[1]=1;
		for(int i=2;i<=num;i++)
		{
			fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
		}
		
		System.out.println("Nth value is : "+fibonacci[num]);
	}
	
	public static void fibonacci_opt(int num) {
		int a=0;
		int b=1;
		int c=0;
		for(int i=2;i<=num;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		System.out.println("Nth value is: "+c);
	}
	public static void fibonacci_big(int num)
	{
		BigInteger a=BigInteger.valueOf(0);
		BigInteger b=BigInteger.valueOf(1);
		BigInteger c=BigInteger.valueOf(0);
		for(int i=2;i<=num;i++)
		{
			c=b.add(a);
			System.out.println(c);
			a=b;
			b=c;
		}
		System.out.println("N th Term: "+(c));
	}

}
