
public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=75;i++)
		{
			boolean is_three=false;
			boolean is_five=false;
			if(i%3==0)
			{
				is_three=true;
			}
			if(i%5==0)
			{
				is_five=true;
			}
			if(is_three==true && is_five==false)
			{
				System.out.println("3");
			}
			else if(is_three==false && is_five==true) {
				System.err.println("5");
			}
			else if(is_three==true && is_five==true)
			{
				System.out.println("35");
			}
		}

	}
	/*
	public static int series_sum(int n) {
		int sum=0;
		int result=0;
		for(int i=1;i<=n;i++)
		{
			result=((i*(i-1))/2)-result;
			sum+=result;
		}
		//sum+=n;
		//System.out.println(sum);
		return sum;
	}
*/	

}
/*
1--> (5+1-1)/2(2*1+(5+1-1)*1)==17.5
2--> ((5+1-2)/2)(2*2)+(5+1-2)*1)==16
3-->((5+1-3)/2)(2*3+(5+1-3)*1)=13.5
4-->((5+1-4)/2)(2*4)+(5+1-4)*1)=10
5-->5
*/