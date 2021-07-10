import java.util.*;

public class repeat_array_search {
    public static int find_occurances(int arr[],int key) {
    	int count=0;
    	int low=0;
    	int high=arr.length-1;
    	boolean flag=false;
    	int index=0;
    	while(low<=high)
    	{
    		int mid=(int)(low+high)/2;
    		if(arr[mid]==key) {
    			flag=true;
    			index=mid;
    			break;
    		}
    		else if(key>arr[mid]) {
    			low=mid+1;
    		}
    		else {
    			high=mid-1;
    		}
    		
    	}
    	if(flag) {
    		for(int i=index;i<arr.length;i++)
    		{
    			if (arr[i]!=key){
    				break;
    			}
    			count=count+1;
    		}
    		for(int j=index-1;j>=0;j--) {
    			if (arr[j]!=key)
    			{ 
    				break;
    				
    			}
    			count=count+1;
    		}
    	}
    	
    	return count;
    }
    public static int optimized_occurance(int arr[],int key) {
    	int count=0;
    	int low=0;
    	int high=arr.length-1;
    	boolean flag=false;
    	int lindex=0;
    	while(low<=high)
    	{
    		int mid=(low+high)/2;
    		if(arr[mid]==key && (mid==0||arr[mid-1]<key)) {
    			flag=true;
    			lindex=mid;
    			System.out.println(lindex);
    			break;
    		}
    		else if(key>arr[mid]) {
    			low=mid+1;
    		}
    		else {
    			high=mid-1;
    		}
    		
    	}
    	
    	if(flag) {
    		low=lindex;
    		high=arr.length-1;
    		int hindex=0;
    		while(low<=high) {
    			int val=(low+high)/2;
    			if (arr[val]==key && (val==arr.length-1||arr[val+1]>key))
    			{
    				hindex=val;
    				break;
    			}
    			if(key>arr[val])
    			{
    				low=val+1;
    				System.out.println("Low"+low+"val"+val);
    			}
    			else if(key<arr[val]) {
    				high=val-1;
    				System.out.println("high"+high+"val"+val);
    			}
    			else {
    				continue;
    			}
    		}
    		System.out.println(hindex+" "+lindex);
    		count=hindex-lindex+1;
    	}
    	
    	return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,10,20,20,20,20,30,30,30,30,40,40,40,40};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to search");
		int key=sc.nextInt();
		
		int result=find_occurances(arr,key);
		System.out.println("Occurances: "+result);
		int nresult=optimized_occurance(arr, key);
		System.out.println("Occurances: "+nresult);
		
		
		

	}

}
