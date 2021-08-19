
public class q_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,7,1,3,5,8,9,6};
		quick_sort(array, 0,array.length-1);
		for(int val:array) {
			System.out.print(val+"\t");
		}

	}
	public static void quick_sort(int inputArray[],int start,int end)
	{
		if(start<end)
		{
			int mid=partision(inputArray,start,end);
			quick_sort(inputArray, start,mid-1);
			quick_sort(inputArray,mid+1,end);
		}
	}
	public static int partision(int inputArray[],int start,int end)
	{
		/*
		 * i will be -1 j will iterate through the array if arr[j]<=pivot then we will increase i and swap i and j
		 */
		int i=start-1;
		int j=start;
		int pivot=inputArray[end];
		while(j<=end)
		{
			if(inputArray[j]<=pivot)
			{
				i++;
				int temp=inputArray[i];
				inputArray[i]=inputArray[j];
				inputArray[j]=temp;
			}
			j=j+1;
		}
		return i;
	}
}
