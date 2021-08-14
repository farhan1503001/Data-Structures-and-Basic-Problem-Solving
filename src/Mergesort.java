
public class Mergesort {
	public static void sort(int inputArray[],int start,int end) {
		if(end<=start)
		{
			return;
		}
		int mid=(start+end)/2;
		sort(inputArray,start,mid);
		sort(inputArray,mid+1,end);
		merge(inputArray,start,mid,end);
	}
	public static void merge(int inputArray[],int start,int mid,int end)
	{
		int temp_array[]=new int[end-start+1];
		int left=start;
		int right=mid+1;
		int k=0;
		while(left<=mid && right<=end)
		{
			if(inputArray[left]<=inputArray[right])
			{
			
				temp_array[k]=inputArray[left];
				left=left+1;
			}
			else {
				temp_array[k]=inputArray[right];
				right=right+1;
			}
			k++;
		}
		if(left<=mid)
		{
			while(left<=mid)
			{
				temp_array[k]=inputArray[left];
				k++;
				left=left+1;
			}
		}
		else if(right<=end) {
			while(right<=end) {
				temp_array[k]=inputArray[right];
				k++;
				right++;
			}
		}
		for(int i=0;i<temp_array.length;i++)
		{
			inputArray[start+i]=temp_array[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,7,3,1,6,3,2,6,8,9,2,3,0};
		sort(arr,0,arr.length-1);
		for(int val:arr) {
			System.out.print(val+"\t");
		}

	}

}
