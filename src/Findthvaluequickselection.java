import java.util.*;
public class Findthvaluequickselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int k=sc.nextInt();
		//inputting array
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		quickselection(arr,0,num-1,k-1);
	}
	public static void quickselection(int arr[],int low,int high,int k)
	{
		if(low<high) {
			int pindex=partision(arr,low,high);
			if(k==pindex)
			{
				System.out.println(k+" th position is "+arr[k]);
				return;
			}
			if(k>pindex) {
				quickselection(arr,pindex+1,high, k);
			}
			else {
				quickselection(arr,low,pindex-1,k);
			}
		}
	}
	public static int partision(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int pindex=low;
		for(int i=low;i<high;i++)
		{
			if(arr[i]<=pivot)
			{
				int temp=arr[pindex];
				arr[pindex]=arr[i];
				arr[i]=temp;
				pindex++;
			}
		}
		int temp=arr[pivot];
		arr[pivot]=arr[pindex];
		arr[pindex]=temp;
		return pindex;
	}
}
