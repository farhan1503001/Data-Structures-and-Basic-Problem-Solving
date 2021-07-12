import java.util.*;
public class gradingstudents {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter number ");
		int num=sc.nextInt();
		System.out.println("Enter the number whose nearest multiple you want to find ");
		int mul=sc.nextInt();
		
		var temp=(num%mul);
		System.out.println("Divisor value is: "+temp);
		var div=mul-temp;
		System.out.println("Difference between nearest of multiple and number "+div);
		
		System.out.println("Nearest number: "+(num+div));
		grade_students();
	}
	
	public static void grade_students()
	{
		int line=sc.nextInt();
		int[] students=new int[line];
		int mul=5;
		for(int i=0;i<line;i++)
		{
			int grade=sc.nextInt();
			int temp=mul-(grade%mul);
			if(temp<3 && grade>=38)
			{
				students[i]=(grade+temp);
			}
			else {
				students[i]=grade;
			}
		}
		System.out.println();
		for(int num:students)
		{
			System.out.print(num+" ");
		}
	}

}
