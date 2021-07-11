import java.util.*;
//algo
// at first we will create prefix array specially helpful for recurrent characters
//then it will loop and find pattern
public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter First String");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println("Enter Second(smaller) String");
		String str2=sc.nextLine();
		sc.close();
		kmpsubstring(str1, str2);
		
	}
   public static void kmpsubstring(String str1,String str2)
   {
	   //Finding both string's length;
	   int m=str1.length();
	   int n_small=str2.length();
	   //longest prefix finder function
	   int[] lp=lpfind(str2,n_small);
	   //Now we will match with our string and lp will help
	   int count=0;//for traversing through pattern string
	   int i=0;//will traverse through big string
	   while(i<m)
	   {
		   if(str2.charAt(count)==str1.charAt(i))
		   {
			   count++;
			   i++;
		   }
		   if (count==n_small)
		   {
			   System.out.println("Pattern found at "+(i-count));
			   count=lp[count-1];
			   
		   }
		   else if(i<m && str2.charAt(count)!=str1.charAt(i)) {
			   if(count!=0)
			   {
				   count=lp[count-1];
			   }
			   else {
				   i++;
			   }
		   }
	   }
	   
   }
   public static int[] lpfind(String pattern,int pattern_length)
   { 
	   int[] lp=new int[pattern_length];
	   int len=0;
	   int i=1;
	   lp[0]=0;
	   while(i<pattern_length)
	   {
		   //System.out.println(lp[i]+" "+i+" "+len);
		   if(pattern.charAt(i)==pattern.charAt(len))
		   {
			   len=len+1;
			   lp[i]=len;
			   i=i+1;
		   }
		   else {
			   if(len!=0)
			   {
				   len=lp[len-1];
			   }
			   else {
				   lp[i]=0;
				   i=i+1;
			   }
		   }
	   }
	   
	   for(int num:lp)
	   {
		   System.out.print(num+" ");
	   }
	   
	   return lp;
	   
   }
   
}
