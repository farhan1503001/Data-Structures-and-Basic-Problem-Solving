
public class Secondlargestelement {
	
	public static int large_finder(Integer arr[])
	{ 
		Integer largest=Integer.MIN_VALUE;
		Integer second_largest=Integer.MIN_VALUE;
		Integer third_largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				third_largest=second_largest;
				second_largest=largest;
				largest=arr[i];
			}
			else if(arr[i]>second_largest && arr[i]!=largest)
			{
				second_largest=arr[i];
			}
			else if(arr[i]>third_largest && arr[i]!=largest && arr[i]!=second_largest)
			{
				third_largest=arr[i];
			}
					
		}
		System.out.println("Largest Value is: "+largest);
		System.out.println("Second largest Value is: "+second_largest);
		System.out.println("Second largest Value is: "+third_largest);
		return 0;
	}
	public static int minimum_finder(Integer arr[])
	{
		Integer smallest=Integer.MAX_VALUE;
		Integer second_smallest=Integer.MAX_VALUE;
		Integer third_smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(smallest>arr[i])
			{
				third_smallest=second_smallest;
				second_smallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<second_smallest && arr[i]!=smallest)
			{
				second_smallest=arr[i];
			}
			else if(arr[i]<third_smallest && arr[i]!=smallest && arr[i]!=second_smallest)
			{
				third_smallest=arr[i];
			}
					
		}
		System.out.println("Smallest Value is: "+smallest);
		System.out.println("Second smallest Value is: "+second_smallest);
		System.out.println("Second smallest Value is: "+third_smallest);
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {10,45,55,33,77,22,77,22,11,55};
		
		large_finder(arr);
		minimum_finder(arr);
		
	}

}
