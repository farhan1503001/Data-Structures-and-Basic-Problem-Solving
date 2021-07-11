import java.util.Arrays;

public class FindMedianTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Median Finding of two arrays");
		int[] array1 = { -5, 3, 6, 12, 15 };
        int[] array2 = { -12, -10, -6, -3, 4, 10 };
        //int[] array3=new int[array1.length+array2.length];
        //System.arraycopy(array1, 0, array3, 0, array1.length);
        //System.arraycopy(array2, 0, array3, array1.length-1,array2.length);
        int [] merged_array=copier(array1,array2);
       
        /*
        for(int i:array3)
        {
        	System.out.println(i);
        }
        */
        Arrays.sort(merged_array);
        for(int num:merged_array)
        {
        	System.out.print(num);
        	System.out.print("\t");
        }
        System.out.println();
        int median=medianFind(merged_array);
        System.out.println("Median value is: "+median);

	}
	
	public static int[] copier(int arr1[],int arr2[])
	{    
		int[] arr3=new int[arr1.length+arr2.length];
		int index=0;
		for(int num:arr1) {
			   arr3[index]=num;
			   index++;
		}
		for(int num1:arr2)
		{
			arr3[index]=num1;
			index++;
		}
		return arr3;
	}
	public static int medianFind(int arr[])
	{
		int median=0;
		int n=arr.length;
		if(n%2==0)
		{
			int pos=n/2;
			median=(arr[pos]+arr[pos-1])/2;
		}
		else {
			median=arr[n/2];
		}
		return median;
	}

	
}
