import java.util.*;
public class Minswapselectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		//selection sort and num swaps
		int count=0;
		for(int i=0;i<num-1;i++)
		{
			int jmin=i;
			for(int j=i+1;j<num;j++)
			{
				if(arr[jmin]>arr[j])
				{
					jmin=j;
				}
			}
			if(jmin!=i)
			{
				int temp=arr[jmin];
				arr[jmin]=arr[i];
				arr[i]=temp;
				count++;
			}
		}
		System.out.println(count);
		/*
		for(int n:arr)
		{
			System.out.print(n+" ");
		}
        */
	}

}
