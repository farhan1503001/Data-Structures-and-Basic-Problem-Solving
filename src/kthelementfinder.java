import java.util.*;
public class kthelementfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the element you want to find");
       Scanner sc=new Scanner(System.in);
       int kth=sc.nextInt();
       int[] arr={7,7,8,8, 10, 4, 3, 20, 15};
       sort_find(arr,kth);
       set_use_find(arr, kth);
	}
	//
	public static int sort_find(int arr[],int k)
	{
		Arrays.sort(arr);
		int count=0;
		for(int j:arr)
		{
			System.out.print(j+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i==0)
				count++;
			else if(arr[i]!=arr[i-1])
			{
				count++;
				if(count==k-1)
				{
					System.out.println("\n"+k+" th value is: "+arr[i]);
				}
			}
			else
			{
				continue;
			}
		}
		return 0;
	}
	public static int set_use_find(int arr[],int k)
	{
		HashSet<Integer>set=new HashSet<Integer>();
		for(int num:arr)
		{
			set.add(num);
		}
		int find=0;
		for(int val:set) {
			if(find==k-1)
				System.out.print(val+" ");
			find=find+1;
		}
		return 0;
	}

}
